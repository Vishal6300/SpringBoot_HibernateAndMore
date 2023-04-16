package com.masai.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="BiryaniType" , discriminatorType = DiscriminatorType.STRING)
@Table(name = "BiryaniSingleTable")
public class Biryani {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int biryaniId;
    private double biryaniRating;

    public Biryani() {

    }

    public Biryani( double biryaniRating) {
        this.biryaniRating = biryaniRating;
    }

    @Override
    public String toString() {
        return "Biryani{" +
                "biryaniId=" + biryaniId +
                ", biryaniRating=" + biryaniRating +
                '}';
    }

    public int getBiryaniId() {
        return biryaniId;
    }

    public void setBiryaniId(int biryaniId) {
        this.biryaniId = biryaniId;
    }

    public double getBiryaniRating() {
        return biryaniRating;
    }

    public void setBiryaniRating(double biryaniRating) {
        this.biryaniRating = biryaniRating;
    }
}
