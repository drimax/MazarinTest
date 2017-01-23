package com.mazarin.mazarinTest.service;

import com.mazarin.mazarinTest.dto.CustomerDTO;
import com.mazarin.mazarinTest.model.Customer;

import java.util.List;

/**
 * Created by hp on 1/23/2017.
 */
public interface CustomerService {

    public boolean addCustomer(CustomerDTO customer);

    public boolean editCustomer(CustomerDTO customer);

    public boolean deleteCustomer(String customerName);

    public List<CustomerDTO> viewCustomer();
}
