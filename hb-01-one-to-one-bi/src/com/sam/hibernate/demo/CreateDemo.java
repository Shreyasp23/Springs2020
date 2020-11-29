package com.sam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Instructor;
import com.sam.hibernate.entity.InstructorDetail;
import com.sam.hibernate.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating object");
			
			Instructor sam = new Instructor("Chandan","Prakash","chan@email.com");
			
			InstructorDetail detail =new InstructorDetail("ChanTube","Coding");
			
			sam.setInstuctorDetailId(detail);
			
			System.out.println("Instructor-->"+sam.toString());
			
			int id=2;
			
			session.beginTransaction();
			
			
			session.save(sam);
			
			session.getTransaction().commit();
			
			System.out.println("Done!!"+sam.toString());
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
		}

	}

}
