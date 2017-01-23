package com.mazarin.mazarinTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hp on 1/23/2017.
 */

@Entity
@Table(name = "t_customer" , catalog = "mazarintest")
public class Customer {

    private int id;

    private String name;

    private String address;

    private String email;

    private String department;

    public Customer(){};

    public Customer(String name, String address, String email, String department){
        this.name = name;
        this.address = address;
        this.email = email;
        this.department = department;
    }

    @Id
    @Column(name = "customerId" , unique = true, nullable = false,length = 100)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name" , unique = true, nullable = false,length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "address" , unique = true, nullable = false,length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "email" , unique = true, nullable = false,length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "department" , unique = true, nullable = false,length = 45)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return this.name + " , " + this.email +" , " + this.address + " , " + this.department;
    }
}
