package com.sam.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
			
			Instructor ins = session.get(Instructor.class, 1);
			
			Query <Instructor> query= session.createQuery("select i from Instructor i Join Fetch i.courses where i.id=:insId",Instructor.class);
			query.setParameter("insId", 1);
			
			query.getSingleResult();
			
			System.out.println("Ins-->"+ins.toString());
			session.getTransaction().commit();
			System.out.println("Courses-->"+ ins.getCourses());
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			
			factory.close();
		}

	}

}
