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
public class Order {
    private String productName;
    private double price;
    private int quantity;
    protected String info;
    String namaGudang;//default

    
    /**
     * @return the productName
     */
    
    public Order() {
    }

    public Order(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public double calculateOrder(){
    return this.price*this.quantity;
    }

    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
