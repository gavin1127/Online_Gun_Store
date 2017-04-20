package com.gunstore;

import java.math.BigDecimal;

/**
 * Created by Gavin on 4/19/17.
 */
public class HandGun {
    Integer Id;
    String Name;
    BigDecimal Price;
    String Caliber;

    @Override
    public String toString(){
        return "HandGun{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                ", Caliber='" + Caliber ;
    }
    public HandGun(Integer Id, String Name, BigDecimal Price , String Caliber){
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.Caliber = Caliber;

    }
    public HandGun(){
    }
    //Getters And Setters
    public Integer getId() {return Id;}
    public void setId(Integer id) {Id = id;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public BigDecimal getPrice() {return Price;}
    public void setPrice(BigDecimal price) {Price = price;}
    public String getCaliber() {return Caliber;}
    public void setCaliber(String caliber) {Caliber = caliber;}
}
