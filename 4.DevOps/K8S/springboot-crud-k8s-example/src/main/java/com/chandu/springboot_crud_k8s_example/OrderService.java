package com.chandu.springboot_crud_k8s_example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
   private OrderRepo orderRepo;


    public Order save(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public Order findById(Long id) {
        return orderRepo.findById(id).get();
    }
}
