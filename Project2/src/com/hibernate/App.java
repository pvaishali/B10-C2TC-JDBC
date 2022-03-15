package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Project2.users;
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate1.cfg.xml")
                .addAnnotatedClass(users.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

try {
// Create object of entity class type
users user = new users( 3, "Mahima","Shah","sshah@tns.org");
// Start transaction
session.beginTransaction();
// Perform operation
session.save(user);
// Commit the transaction 
session.getTransaction().commit();
System.out.println("Row Added");
} finally {
session.close();
factory.close();
}
	}

}
