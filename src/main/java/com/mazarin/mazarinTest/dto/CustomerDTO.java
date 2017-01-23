package com.mazarin.mazarinTest.dto;

import java.io.Serializable;

/**
 * Created by hp on 1/23/2017.
 */
public class CustomerDTO implements Serializable{

    private static final long serialVersionUID = -8393454998531544L;

    private String inputName;

    private String inputEmail;

    private String inputAddress;

    private String inputDepartment;

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public String getInputAddress() {
        return inputAddress;
    }

    public void setInputAddress(String inputAddress) {
        this.inputAddress = inputAddress;
    }

    public String getInputDepartment() {
        return inputDepartment;
    }

    public void setInputDepartment(String inputDepartment) {
        this.inputDepartment = inputDepartment;
    }
}
