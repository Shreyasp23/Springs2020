package com.sam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Student object");
			Student tempStudent =new Student("Shreyas","Milton","Shreyas@email.com");
			Student tempStudent1 =new Student("Chandan","Milton","Chan@email.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			session.save(tempStudent1);
			
			session.getTransaction().commit();
			
			System.out.println("Done!!");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}

	}

}
