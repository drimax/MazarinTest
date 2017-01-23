package com.mazarin.mazarinTest.dao.impl;

import com.mazarin.mazarinTest.dao.CustomerDao;
import com.mazarin.mazarinTest.model.Audit;
import com.mazarin.mazarinTest.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hp on 1/23/2017.
 */
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String addCustomer(Customer customer) {
        try {
            Session session=this.sessionFactory.openSession();
            session.beginTransaction();
            session.save(customer);

            Audit audit = new Audit();
            audit.setDate(new Date());
            audit.setMessage(customer.toString() +": added");
            session.save(audit);

            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            return e.getCause().toString();
        }

        return "SUCCESS";
    }

    @Override
    public String editCustomer(Customer customer) {
        try {
            Session session=this.sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(customer);

            Audit audit = new Audit();
            audit.setDate(new Date());
            audit.setMessage(customer.toString() +": edited");
            session.save(audit);

            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            return e.getCause().toString();
        }

        return "SUCCESS";
    }

    @Override
    public String deleteCustomer(String customerName) {

        List<Customer> customers = new ArrayList<>();
        Customer customer;
        try {
            Session session=this.sessionFactory.openSession();
            session.beginTransaction();

            customers = session.createQuery("from Customer where name=?")
                    .setParameter(0, customerName).list();

            if (customers.size() > 0 && customers.get(0) != null) {
                customer = customers.get(0);
                session.delete(customer);

                Audit audit = new Audit();
                audit.setDate(new Date());
                audit.setMessage(customer.toString() +": deleted");
                session.save(audit);

            } else {
                return "FAILED";
            }

            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            return e.getCause().toString();
        }

        return "SUCCESS";
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Session session=this.sessionFactory.openSession();
            session.beginTransaction();
            customers = session.createCriteria(Customer.class).list();

            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            return null;
        }

        return customers;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
