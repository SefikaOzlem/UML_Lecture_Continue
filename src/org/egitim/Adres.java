package org.egitim;

public class Adres implements ILog {
	
	private String country;
	private String city;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void log() {
		System.out.println("Address");
		
	}
	
	

}
