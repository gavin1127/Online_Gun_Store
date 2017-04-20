package com.gunstore;

import java.math.BigDecimal;

/**
 * Created by Gavin on 4/19/17.
 */
public class Optics {
    Integer Id;
    String Name;
    String Type;
    BigDecimal Price;

    @Override
    public String toString(){
        return "Optics{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                ", Type='" + Type;
    }
    public Optics(Integer Id, String Name, String Type, BigDecimal Price) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.Type = Type;
    }

    //Getters And Setters
    public Integer getId() {return Id;}
    public void setId(Integer id) {Id = id;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getType() {return Type;}
    public void setType(String type) {Type = type;}
    public BigDecimal getPrice() {return Price;}
    public void setPrice(BigDecimal price) {Price = price;}
}
