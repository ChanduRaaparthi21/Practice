package com.chandu.patientservice.grpc;

import billing.BillingRequest;
import billing.BillingResponse;
import billing.BillingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceGrpcClient {

    private static final Logger log = LoggerFactory.getLogger(BillingServiceGrpcClient.class);
    private final BillingServiceGrpc.BillingServiceBlockingStub blockingStub;

    public BillingServiceGrpcClient(
            @Value("${billing.service.address:localhost}") String ServerAddress,
            @Value("${billing.service.grpc.port:9001}") int ServerPort
    ){
        log.info("Connecting to Billing Service GRPC service at {}:{}", ServerAddress, ServerPort);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(ServerAddress, ServerPort)
                .usePlaintext()
                .build();

        blockingStub = BillingServiceGrpc.newBlockingStub(channel);

    }

    public BillingResponse createBillingAccount(String patientId, String name, String email){
        log.info("Creating billing account for patient {}", patientId);
        BillingRequest billingRequest = BillingRequest.newBuilder()
                .setPatientId(patientId)
                .setName(name)
                .setEmail(email)
                .build();

        BillingResponse response = blockingStub.createBillingAccount(billingRequest);
        log.info("Billing account created for patient {}", response);
        return response;
    }

}
