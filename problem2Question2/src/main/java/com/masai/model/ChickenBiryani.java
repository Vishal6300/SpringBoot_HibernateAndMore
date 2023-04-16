package com.masai.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ChickenBiryani")
public class ChickenBiryani extends Biryani{

    private int chickenBiryaniId;
    private int price ;
    private String description;

    public ChickenBiryani( double biryaniRating, int chickenBiryaniId, int price, String description) {
        super( biryaniRating);
        this.chickenBiryaniId = chickenBiryaniId;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ChickenBiryani{" +
                "chickenBiryaniId=" + chickenBiryaniId +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public int getChickenBiryaniId() {
        return chickenBiryaniId;
    }

    public void setChickenBiryaniId(int chickenBiryaniId) {
        this.chickenBiryaniId = chickenBiryaniId;
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

    public ChickenBiryani() {
    }

    public ChickenBiryani(int chickenBiryaniId, int price, String description) {
        this.chickenBiryaniId = chickenBiryaniId;
        this.price = price;
        this.description = description;
    }
}
