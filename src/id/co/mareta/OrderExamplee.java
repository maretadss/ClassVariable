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
public class OrderExamplee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Order order = new Order("Chitato", 7650.0);
        order.setQuantity(5);
        
        System.out.println("Yang harus dibayar : " + order.calculateOrder());//38250.0
        System.out.printf("Yang harus dibayar %,.2f \n", order.calculateOrder());//38, 250.00//2f maksudnya adalah fload atau banyaknya angka dibelakang (.)
         System.out.format("Yang harus dibayar %,.2f \n", order.calculateOrder());//38,250.00
    }
    
}
