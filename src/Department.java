/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BCC
 */
public class Department {
   
    private String location;
    private int number_teachers;
    private int num_subjects;
    private String head;

    public String getLocation() {
        return location;
    }

    public int getNumber_teachers() {
        return number_teachers;
    }

    public int getNum_subjects() {
        return num_subjects;
    }

    public String getHead() {
        return head;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumber_teachers(int number_teachers) {
        this.number_teachers = number_teachers;
    }

    public void setNum_subjects(int num_subjects) {
        this.num_subjects = num_subjects;
    }

    public void setHead(String head) {
        this.head = head;
    }
    
    
}


