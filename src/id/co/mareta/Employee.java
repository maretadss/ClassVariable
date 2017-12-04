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
public class Employee { //konstrurtor// jika public bisa dipanggil dikelas lain

    private String employeeName;
    private double salary; // semua member variable harusnya private
    private int age;// private hanya bisa dipanggil diclass ini saja, karena untuk melindungi diubah di kelas lain
    //keuntungannya adalah
    
    public String getEmployee(){ //getter
        return this.employeeName;
    }
    
    public void setSalary(double salary){//setter, jika diadalm set ada duplikasi haru menggunkan this.
    this.salary =  salary;
    }
//    
////    public double getSalary(){
////    if(this.salary == 0)
////        
////    }
    
    
    // 4 konstruktor
    public Employee() { // kunstruktor 1 default
    }

    public Employee(String employeeName) {//kunstruktor 2 
        this.employeeName = employeeName;
    }

    public Employee(String employeeName, double salary) {//konstrutor 3 default
        this.employeeName = employeeName;
        this.salary = salary;

    }

    public Employee(String employeeName, double salary, int age) {//konstruktor 4 default
        this.employeeName = employeeName;
        this.salary = salary;
        this.age = age;
    }

}
