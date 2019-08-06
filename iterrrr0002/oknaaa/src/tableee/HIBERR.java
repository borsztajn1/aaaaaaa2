package tableee;

public class HIBERR {

}


import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {
    public static void main(String[] args) {
        final List< Long > longs = new ArrayList<>();
        longs.add( 0L ); // long is boxed to Long
        
        long value = longs.get( 0 ); // Long is unboxed to long
        System.out.println( value );
        // Do something with value
    }    
}
=======================================================================
package com.pretech;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//film https://www.youtube.com/watch?v=bUpOL_b7g6k&list=PLU2dl_1LV_SQWZI2R_RSEeYm1tfueszOc&index=23
//FILM https://www.youtube.com/watch?v=R--MH1bORAA&list=PLIWo3oDewwtl8hxfcVk4ygbs9Q2Mk4ck4

//http://mariuszwojcik.blogspot.com/2011/09/andromda-biblioteka-mapowanie-relacji.html
//DODAJ USUN LISTA http://projavatricks.blogspot.com/2015/07/adding-or-removing-elements-from-jlist.html

//http://websystique.com/hibernate/hibernate-many-to-many-unidirectional-annotation-example/
//proste http://javaaces.com/hibernate/onetoone.html
//http://javabysri.blogspot.com/2012/07/step-by-step-example-for-many-to-many.html
//proste http://viralpatel.net/blogs/hibernate-many-to-many-annotation-mapping-tutorial/
//proste http://www.codejava.net/frameworks/hibernate/hibernate-one-to-many-association-on-join-table-annotations-example
//proste http://howtodoinjava.com/hibernate/hibernate-many-to-many-mapping-using-annotations/

//http://outbottle.com/java-hibernate-manytomany-tutorial-with-add-and-delete-examples/
//http://www.pretechsol.com/2013/08/hibernate-many-to-many-simple-example.html#.V8n9-iiLRdg
//add/remove list http://www.java2s.com/Code/Java/Swing-JFC/AnexampleofJListwithaDefaultListModel.htm
//proste:  https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-many-to-many-using-annotations-1.html
//https://www.mkyong.com/hibernate/hibernate-many-to-many-relationship-example-annotation/

//http://www.tutorialspoint.com/hibernate/hibernate_annotations.htm
//http://www.dworld.pl/blogEntry/jump/2055?nomenu=true

//http://www.fastlab.in/mylab/viewtopic.php?f=118&t=84
//http://users.uj.edu.pl/~ciesla/wzorce/wzorce_02.pdf

//https://biz30.timedoctor.com/17-upwork-alternatives-that-will-help-you-outsource-jobs-to-grow-your-business/

//http://www.javatips.net/blog/hibernate-many-to-many-relation-mapping-example?page=3
//http://viralpatel.net/blogs/hibernate-self-join-annotation-mapping-many-to-many-example/
//http://www.codejava.net/frameworks/hibernate/hibernate-many-to-many-association-annotations-example


public class ManytoManyMain002 { 
	private static SessionFactory sessionFactory;


	
 public static void main(String args[])
	{
		
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		Session session = sessionFactory.openSession();

		Student st1 = new Student();
		st1.setStudentId(10);
		st1.setStudentname("Student 1");
		
		Student st2=new Student();
		st2.setStudentId(11);
		st2.setStudentname("Student 2");
		
		Teacher t1=new Teacher();
		Teacher t2 = new Teacher();
		
		t1.setTeacherid(21);
		t1.setTeachername("Teacher 1");
		
		t2.setTeacherid(22);
		t2.setTeachername("Teacher 2");
		
		Set  s =new HashSet();
		s.add(t1);
		s.add(t2);
		
		st1.setTeachers(s);
		st2.setTeachers(s);
		Transaction tx = session.beginTransaction();
		session.save(st1);
		session.save(st2);
		tx.commit();
		System.out.println("Student and Teacher records saved");
		session.close();
	}
	
}
