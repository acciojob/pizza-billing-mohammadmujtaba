package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int frqCheezeToppingsPaper[];


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;

        bill = "";
        frqCheezeToppingsPaper = new int[3];
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        frqCheezeToppingsPaper[0]++;
    }

    public void addExtraToppings(){
        // your code goes here
        frqCheezeToppingsPaper[1]++;
    }

    public void addTakeaway(){
        // your code goes here
        frqCheezeToppingsPaper[2]++;
    }

    public String getBill(){
        // your code goes here

        bill += "Base Price Of The Pizza: " + price +"\n";

        if(frqCheezeToppingsPaper[0]!=0) {
            bill += "Extra Cheese Added: " + 80 +"\n";
            price += 80;
        }
        if(frqCheezeToppingsPaper[1]!=0) {
            if(isVeg) {
                bill += "Extra Toppings Added: " + 70 +"\n";
                price += 70;
            }
            else{
                bill += "Extra Toppings Added: " + 120 +"\n";
                price += 120;
            }
        }
        if(frqCheezeToppingsPaper[2]!=0) {
            bill += "Paperbag Added: " + 20 +"\n";
            price += 20;
        }

        bill += "Total Price: " + price +"\n";

        return this.bill;
    }
}
