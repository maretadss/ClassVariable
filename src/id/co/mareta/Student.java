/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mareta;

/**
 *
 * @author user
 */
public class Student {

    String studentName;

    public Student() {
        System.out.println("Contructor default is called");
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String toString() {
        if (studentName == null) {
            return "No Name";
        }

        return studentName;
    }
    
//    public static void 
//    public Student (String studentName, double age){
////    return "Nama = " + studentName + " , Umur" + age;
//    }

}
