package com.mazarin.mazarinTest.dao;

import com.mazarin.mazarinTest.model.Customer;

import java.util.List;

/**
 * Created by hp on 1/23/2017.
 */
public interface CustomerDao {

    public String addCustomer(Customer customer);

    public String editCustomer(Customer customer);

    public String deleteCustomer(String customerName);

    public List<Customer> getAllCustomers();
}
