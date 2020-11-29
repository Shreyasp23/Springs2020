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
			
			/*Instructor sam = new Instructor("Chandan","Prakash","chan@email.com");
			
			InstructorDetail detail =new InstructorDetail("ChanTube","Coding");
			
			sam.setInstuctorDetailId(detail);
			
			System.out.println("Instructor-->"+sam.toString());*/
			
			int id=5;
			
			session.beginTransaction();
			
			InstructorDetail temp;
			temp = new InstructorDetail();
			try {
				
				 temp =session.get(InstructorDetail.class, id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(temp.getIntructor().toString());
			
			temp.getIntructor().setInstuctorDetailId(null);
			session.delete(temp);
			
			session.getTransaction().commit();
			
			System.out.println("Done!!"+temp.toString());
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			factory.close();
		}

	}

}
