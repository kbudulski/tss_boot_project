package com.tssboot.springbootdemo.dao;

import com.tssboot.springbootdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImplementation implements CustomerDAO {

    private final SessionFactory sessionFactory;

    public CustomerDAOImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer order by id desc", Customer.class);
        return query.getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("in saveCustomer");
        System.out.println(customer);
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        System.out.println("in getCustomer");
        System.out.println(id);
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class, id);
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        session.delete(customer);
    }
}
