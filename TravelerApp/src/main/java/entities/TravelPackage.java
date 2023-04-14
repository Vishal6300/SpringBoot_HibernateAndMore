package entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class TravelPackage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageId;
	private String packageName;
	@OneToMany(cascade = CascadeType.ALL)
	private double price;
	private Set<Booking> bookings;
/*
 	packageId : int
	packageName : String
	price : double
	bookings : Set<Booking>
 */
}
