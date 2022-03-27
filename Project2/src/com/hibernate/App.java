package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Project2.Users1;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate1.cfg.xml")
                .addAnnotatedClass(Users1.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

try {
// Create object of entity class type
	Users1 us1=new Users1();
//Users1 us1= new Users1( 2, "y","purushothaman","vbnh@tns.org");
// Start transaction
session.beginTransaction();
us1=session.get(Users1.class,0);
//updating object
us1.setUsers1_fname=("yamini");
session.delete(us1);
// Perform operation
//session.save(us1);
// Commit the transaction 
session.getTransaction().commit();
//System.out.println("row added");
System.out.println(us1);
} finally {
session.close();
factory.close();
}
	}

}
