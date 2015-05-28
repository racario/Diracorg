package entity;

import structures.Datum;
import structures.Password;


public class User {
	
	private String nickname, surname, name, street, number, postalCode, province, country;
	private Password password;
	private Datum geboorteDatum;
	
	
	public User(String nickname, String surname, String name, String password){
		setNickname(nickname);
		setSurname(surname);
		setName(name);
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Datum getGeboorteDatum() {
		return geboorteDatum;
	}


	public void setGeboorteDatum(Datum geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}


	private Password getPassword() {
		return password;
	}


	public void setPassword(Password password) {
		this.password = password;
	}
}
