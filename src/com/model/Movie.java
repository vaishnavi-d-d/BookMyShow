package com.model;

public class Movie {
	private int id;
	private String name;
	private  float  rating;
    private String genre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Movie(int id, String name, float rating, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
