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
public class Dog extends Animal {

    public Dog() {
        super("Vetebrata"); //harus ditulis eksplisit
        System.out.println("Dog is animal");
//      super(); //Salah Tempat DAN Constructor //karena kontruktor default ke hidden dengan parameter
    }

}
