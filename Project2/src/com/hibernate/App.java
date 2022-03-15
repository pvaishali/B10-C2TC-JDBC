package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Project2.users;
import com.hibernate.Project2.users.user;
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
	users user=new users();
//users user = new users( 1, "vaishu","purushothaman","hah@tns.org");
// Start transaction
session.beginTransaction();
user=session.get(users.class, 1);
//user.setUsers_fname=("yamini");
session.delete(user);
// Perform operation
session.save(user);
// Commit the transaction 
session.getTransaction().commit();
System.out.println("user");
} finally {
session.close();
factory.close();
}
	}

}
