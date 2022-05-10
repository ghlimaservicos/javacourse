package model.services;

import model.entities.CarRental;

public class RentalServices {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService taxService;

	public RentalServices() {
		// TODO Auto-generated constructor stub
	}

	public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}
	
}
