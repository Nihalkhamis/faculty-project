/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BCC
 */
public class Student {

    
    private String name;
    private int ID;
    private String subject;
    private double grades;
    private int year;
   private String department;
   private int hours;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrades() {
        return grades;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }
    public  String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    

    public void setDepartment(String department) {
      this.department = department;
    }
    public  void delete()
    {
       this.name = null; 
       this.subject = null;
       this.grades = 0;
       this.hours = 0;
       this.year = 0;
       this.ID = 0;
       this.department = null;
       
       System.out.print("this user is deleted");
       
    }
    
   
    
          
    
}
