package com.chandu.springboot_crud_k8s_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;


    @PostMapping("/save")
    public Order save(@RequestBody Order order){
        return  orderService.save(order);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders(){
        return orderService.findAll();
    }

    @GetMapping("/id/{id}")
    public Order findByIdOrder(@PathVariable Long id){
        return orderService.findById(id);
    }

}
