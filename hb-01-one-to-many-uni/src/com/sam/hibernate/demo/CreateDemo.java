package com.sam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Course;
import com.sam.hibernate.entity.Instructor;
import com.sam.hibernate.entity.InstructorDetail;
import com.sam.hibernate.entity.Review;

public class CreateDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating object");
			
			
			session.beginTransaction();
			
			Review tempCourse = session.get(Review.class, 5);
			
			session.delete(tempCourse);
			
			
			
			session.getTransaction().commit();
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			
			factory.close();
		}

	}

}
