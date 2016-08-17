/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Faculty {
    public static void main(String args [])
    {
        Scanner user_input = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        
        System.out.println("Enter the name of the first student");
        String name = user_input.next();
        s1.setName(name);
        System.out.println("Enter the grade of the first student");
        double Grades = user_input.nextDouble();
        s1.setGrades(Grades);
        System.out.println("Enter the hours of the first student");
        int hours = user_input.nextInt();
        s1.setHours(hours);
        System.out.println("Enter the id of the first student");
        int Id = user_input.nextInt();
        s1.setID(Id);
        System.out.println("Enter the subject first student");
        String subject = user_input.next();
        s1.setSubject(subject);
        System.out.println("Enter the year of the first student");
        int year = user_input.nextInt();
        s1.setYear(year);
        System.out.println("Enter the department of the first student");
        String department = user_input.next();
        s1.setDepartment(department);
        
        System.out.println("Enter the name of the second student");
        name = user_input.next();
        s2.setName(name);
        System.out.println("Enter the grade of the second student");
        Grades = user_input.nextDouble();
        s2.setGrades(Grades);
        System.out.println("Enter the hours of the second student");
        hours = user_input.nextInt();
        s2.setHours(hours);
        System.out.println("Enter the id of the second student");
        Id = user_input.nextInt();
        s2.setID(Id);
        System.out.println("Enter the subject of the second student");
        subject = user_input.next();
        s2.setSubject(subject);
        System.out.println("Enter the year of the second student");
        year = user_input.nextInt();
        s2.setYear(year);
        System.out.println("Enter the department of the second student");
        department = user_input.next();
        s2.setDepartment(department);
        
        System.out.println("Enter the name of the third student");
        name = user_input.next();
        s3.setName(name);
        System.out.println("Enter the grades of the third student");
        Grades = user_input.nextDouble();
        s3.setGrades(Grades);
        System.out.println("Enter the hours of the third student");
        hours = user_input.nextInt();
        s3.setHours(hours);
        System.out.println("Enter the id of the third student");
        Id = user_input.nextInt();
        s3.setID(Id);
        System.out.println("Enter the subject of the third student");
        subject = user_input.next();
        s3.setSubject(subject);
        System.out.println("Enter the year of the third student");
        year = user_input.nextInt();
        s3.setYear(year);
        System.out.println("Enter the department of the third student");
        department = user_input.next();
        s3.setDepartment(department);
        
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        
        System.out.println("Enter the degree of the fisrt teacher");
        String degree = user_input.next();
        t1.setDegree(degree);
        boolean mandate = user_input.nextBoolean();
        t1.setMandate(mandate);
        
        System.out.println("Enter the degree of the second teacher");
        degree = user_input.next();
        t2.setDegree(degree);
        mandate = user_input.nextBoolean();
        t2.setMandate(mandate);
        
        System.out.println("Enter the degree of the third teacher");
        degree = user_input.next();
        t3.setDegree(degree);
        mandate = user_input.nextBoolean();
        t3.setMandate(mandate);
        
        staff st1 = new staff();
        staff st2 = new staff();
        staff st3 = new staff();
        
        System.out.println("Enter the degree of the fisrt staff");
        degree = user_input.next();
        st1.setDegree(degree);
        System.out.println("Enter the degree of the second teacher");
        degree = user_input.next();
        st2.setDegree(degree);
        System.out.println("Enter the degree of the third teacher");
        degree = user_input.next();
        st3.setDegree(degree);
        
        Department d1 = new Department();
        Department d2 = new Department();
        
        department = user_input.next();
        d1.setLocation(department);
        int number_teachers = user_input.nextInt();
        d1.setNumber_teachers(number_teachers);
        int number_subjects = user_input.nextInt();
        d1.setNum_subjects(number_subjects);
        name = user_input.next();
        d1.setHead(name);
        department = user_input.next();
        d2.setLocation(department);
        number_teachers = user_input.nextInt();
        d2.setNumber_teachers(number_teachers);
        number_subjects = user_input.nextInt();
        d2.setNum_subjects(number_subjects);
        name = user_input.next();
        d2.setHead(name);
    }
}
        
         

        
       
      
        
        
        
        
        
        
        
        
        
        
       
        
        
        
    