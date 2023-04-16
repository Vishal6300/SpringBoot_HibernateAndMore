package com.masai.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@NamedQuery(name = "getById" , query = "from VegBiryani v where v.vegBiryani = :id ")
@PrimaryKeyJoinColumn(name = "biryaniId")
@DiscriminatorValue("VegBiryani")
public class VegBiryani extends Biryani{

    private int vegBiryani;
    private int price ;
    private String description;

    public VegBiryani( double biryaniRating, int vegBiryani, int price, String description) {
        super(biryaniRating);
        this.vegBiryani = vegBiryani;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VegBiryani{" +
                "vegBiryani=" + vegBiryani +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public int getVegBiryani() {
        return vegBiryani;
    }

    public void setVegBiryani(int vegBiryani) {
        this.vegBiryani = vegBiryani;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VegBiryani() {
    }

    public VegBiryani(int vegBiryani, int price, String description) {
        this.vegBiryani = vegBiryani;
        this.price = price;
        this.description = description;
    }
}
