package com.sam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Student;

public class ReadStudentDemo {
	
public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Update Student object");
			int id =6;
			
			/*session.beginTransaction();
			Student temp = session.get(Student.class, id);
			temp.setEmail("can@gmail.com");
			
			session.getTransaction().commit();
			*/
			 
			
			session.beginTransaction();
			Student temp = session.get(Student.class, id);
			session.delete(temp);
		int i=	session.createQuery("Delete Student where  firstName like 'k%'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Noo of row deleted "+ i);
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			factory.close();
		}

	}


}
