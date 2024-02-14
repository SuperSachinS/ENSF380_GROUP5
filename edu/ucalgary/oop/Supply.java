package edu.ucalgary.oop;

public class Supply {
    // Attributes
    private String type;
    private int quantity;

    // Methods

    // Constructor
    public Supply(String type, int quantity){
        this.setType(type);
        this.setQuantity(quantity);
    }

    // Setters
    public void setType(String type){this.type = type;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    // Getters
    public String getType(){return this.type;}
    public int getQuantity(){return this.quantity;}
}
