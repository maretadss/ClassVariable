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
public class ProductTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        Product p = new Product(); 
//        p.hashCode();
       
        
//        MobileProduct mp = new MobileProduct();
        
       SamsungMobileProduct smp= new SamsungMobileProduct();
       smp.showPruductInfo();
       
       int bilangan = 234;
//       bilangan. // tidak mucul method lain
       String nama = "Fadhil";// inilah kenapa string tidak termasuk tipe data PRIMITIVE
       nama.charAt(1); //String bukan tipe primitive,
                        //karena memiliki banyak method
        
    }
    
}
