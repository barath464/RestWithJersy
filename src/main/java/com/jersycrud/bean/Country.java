package com.jersycrud.bean;
/*
 * {
"id":6,
"countryName":"India",
"population":25000
}
 */
public class Country {

	
	private int id;
	
	  
	private  String countryName;	
	
	  
	private long population;

	public Country(){
		
	}
	/**
	 * @param id
	 * @param countryName
	 * @param population
	 */
	public Country(int id, String countryName, long population) {
		this.id = id;
		this.countryName = countryName;
		this.population = population;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}
	
	
}
