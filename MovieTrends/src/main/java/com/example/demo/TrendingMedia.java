package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
@Component
public class TrendingMedia {
	
	@JsonProperty("results")
	private List<results> values; 
	public List<results> getValues() {
		return values;
	}

	public void setValues(List<results> values) {
		this.values = values;
	}

	public TrendingMedia(List<results> values) {
		super();
		this.values = values;
	}

	public TrendingMedia() {
		
		// TODO Auto-generated constructor stub
	}

}
