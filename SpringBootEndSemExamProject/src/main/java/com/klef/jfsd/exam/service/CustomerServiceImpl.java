package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.models.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  implements  CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customer added successfully";
    }

    @Override
    public String updateCustomer(Customer customer) {
        Customer c = customerRepository.findById(customer.getId()).orElse(null);
        assert c != null;
        c.setName((customer).getName());
        c.setAddress(customer.getAddress());
        customerRepository.save(c);
        return "Customer updated successfully";
    }
}