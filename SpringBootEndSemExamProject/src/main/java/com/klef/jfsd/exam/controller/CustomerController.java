package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.models.Customer;
import com.klef.jfsd.exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("add")
    public String addCustomer(@RequestBody Customer customer) {
        return  customerService.addCustomer(customer);
    }

    @PutMapping("update")
    public String updateCustomer(@RequestBody Customer customer) {
        return  customerService.updateCustomer(customer);
    }

}
