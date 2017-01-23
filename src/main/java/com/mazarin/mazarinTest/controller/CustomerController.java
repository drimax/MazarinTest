package com.mazarin.mazarinTest.controller;


import com.mazarin.mazarinTest.service.CustomerService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mazarin.mazarinTest.dto.CustomerDTO;

import java.util.List;

/**
 * Created by hp on 1/22/2017.
 */

@Controller
public class CustomerController {

    @Qualifier("customerService")
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = { "customer" }, method = RequestMethod.GET)
    public ModelAndView customerLoad() {

        ModelAndView model = new ModelAndView();
        model.setViewName("customer");
        return model;

    }

    @RequestMapping(value = { "/saveCustomer" }, method = RequestMethod.POST)
    public ModelAndView customerSave(@ModelAttribute CustomerDTO customer) {

        boolean isSuccess = customerService.addCustomer(customer);
        ModelAndView model = new ModelAndView();
        model.setViewName("customer");
        return model;


    }

    @RequestMapping(value = { "/viewAllCustomers" }, method = RequestMethod.POST)
    @ResponseBody
    public String viewAllCustomers() {

        JSONObject[] customerJsonList;
        int i=0;
        JSONArray listArray = new JSONArray();
        JSONObject results= new JSONObject();

        try {
            List<CustomerDTO> customerList = customerService.viewCustomer();
            customerJsonList=new JSONObject[customerList.size()];

            for (CustomerDTO customer : customerList) {
                customerJsonList[i]=new JSONObject();
                customerJsonList[i].put("name",customer.getInputName());
                customerJsonList[i].put("email",customer.getInputEmail());
                customerJsonList[i].put("address",customer.getInputAddress());
                customerJsonList[i].put("department",customer.getInputDepartment());
                listArray.add(customerJsonList[i]);
                i++;
            }
            results.put("customers",listArray);
            results.put("status","success");
        } catch (Exception e) {
            e.printStackTrace();
            results.put("status","error");
        }
        System.out.println( results.toString() );
        return results.toString();
    }
}
