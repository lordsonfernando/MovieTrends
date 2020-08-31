package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class results {
   private String title;
   private String overview;
   private String release_date;
   private float rating;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getOverview() {
	return overview;
}
public void setOverview(String overview) {
	this.overview = overview;
}
public String getRelease_date() {
	return release_date;
}
public void setRelease_date(String release_date) {
	this.release_date = release_date;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
public results(String title, String overview, String release_date, float rating) {
	super();
	this.title = title;
	this.overview = overview;
	this.release_date = release_date;
	this.rating = rating;
}
public results() {
	
	// TODO Auto-generated constructor stub
}



   
}
