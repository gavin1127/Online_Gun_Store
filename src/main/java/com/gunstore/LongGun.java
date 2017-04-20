package com.gunstore;

import java.math.BigDecimal;

/**
 * Created by Gavin on 4/19/17.
 */
public class LongGun {
    Integer Id;
    String Name;
    String Caliber;
    BigDecimal Price;

    @Override
    public String toString() {
        return "LongGun{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                ", Caliber='" + Caliber;
    }

    public LongGun(Integer Id, String Name, BigDecimal Price, String Caliber) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.Caliber = Caliber;

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

