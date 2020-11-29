package com.sam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Course;
import com.sam.hibernate.entity.Instructor;
import com.sam.hibernate.entity.InstructorDetail;
import com.sam.hibernate.entity.Review;
import com.sam.hibernate.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating object");
			
			
			session.beginTransaction();
			
			Student chandan = session.get(Student.class, 2);
			
			Course course =session.get(Course.class, 10);
			
			session.delete(chandan);
			
			System.out.println("Students - Chandan"+chandan);
			
			System.out.println("courses he is using "+ chandan.getCourses());
			
			
			
			
			
			session.getTransaction().commit();
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			
			factory.close();
		}

	}

}
