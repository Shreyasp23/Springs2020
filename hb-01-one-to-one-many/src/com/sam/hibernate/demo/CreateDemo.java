package com.sam.hibernate.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sam.hibernate.entity.Course;
import com.sam.hibernate.entity.Instructor;
import com.sam.hibernate.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
									.configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating object");
			
			
			session.beginTransaction();
			
			Course course = session.get(Course.class, 10);
			
			session.delete(course);
			
			
			session.getTransaction().commit();
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			
			factory.close();
		}

	}

}
