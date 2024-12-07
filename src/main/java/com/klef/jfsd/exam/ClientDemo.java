package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;


public class ClientDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        Vehicle v = new Vehicle();
        v.setName("ROYALENFIELD");
        v.setType("Bike");
        v.setMax_Speed(35.4);
        v.setColor("Black");
        session.persist(v);

        Car c = new Car();
        c.setName("TOYOTA");
        c.setType("Sedan");
        c.setMax_Speed(180.0);
        c.setColor("White");
        c.setNoOfDoors(5);
        session.persist(c);

        Truck truck = new Truck();
        truck.setName("VOLVO");
        truck.setType("Heavy");
        truck.setMax_Speed(120.0);
        truck.setColor("Blue");
        truck.setLoadCapacity(56);
        session.persist(truck);

        t.commit();

        session.close();
        sf.close();
    }
}
