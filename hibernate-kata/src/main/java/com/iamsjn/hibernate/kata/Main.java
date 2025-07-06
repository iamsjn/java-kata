package com.iamsjn.hibernate.kata;

import com.iamsjn.hibernate.kata.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        User user = new User("Alice");
        session.persist(user);

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();

        System.out.println("User saved with ID: " + user.getId());
    }
}
