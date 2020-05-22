package com.tssboot.springbootdemo.service;

import com.tssboot.springbootdemo.dao.CustomerDAO;
import com.tssboot.springbootdemo.entity.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerServiceImplementation(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}
