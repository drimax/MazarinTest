package com.mazarin.mazarinTest.service.impl;

import com.mazarin.mazarinTest.dao.CustomerDao;
import com.mazarin.mazarinTest.dao.impl.CustomerDaoImpl;
import com.mazarin.mazarinTest.dto.CustomerDTO;
import com.mazarin.mazarinTest.model.Customer;
import com.mazarin.mazarinTest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 1/23/2017.
 */
public class CustomerServiceImpl implements CustomerService {

    @Qualifier("customerDao")
    @Autowired
    private CustomerDao customerDao;

    private static final String SUCCESS = "SUCCESS";

    @Override
    public boolean addCustomer(CustomerDTO customer) {
        Customer modelCustomer = new Customer(customer.getInputName(), customer.getInputAddress(), customer.getInputEmail(), customer.getInputDepartment());
        String result = customerDao.addCustomer(modelCustomer);

        if(SUCCESS.equals(result)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean editCustomer(CustomerDTO customer) {
        Customer modelCustomer = new Customer(customer.getInputName(), customer.getInputAddress(), customer.getInputEmail(), customer.getInputDepartment());
        String result = customerDao.editCustomer(modelCustomer);

        if(SUCCESS.equals(result)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(String customerName) {
        String result = customerDao.deleteCustomer(customerName);

        if(SUCCESS.equals(result)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<CustomerDTO> viewCustomer() {
        List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
        CustomerDTO customerDTO;
        List<Customer> customers = customerDao.getAllCustomers();
        if(customers != null && customers.size() > 0){
            for(Customer customer : customers){
                customerDTO = new CustomerDTO();
                customerDTO.setInputName(customer.getName());
                customerDTO.setInputAddress(customer.getAddress());
                customerDTO.setInputDepartment(customer.getDepartment());
                customerDTO.setInputEmail(customer.getEmail());
                customerList.add(customerDTO);
            }
        }

        return customerList;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
