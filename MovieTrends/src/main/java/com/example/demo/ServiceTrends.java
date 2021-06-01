package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ServiceTrends {

	@Autowired
	TrendingMedia trendingBean;

	RestTemplate rest = new RestTemplate();

	@HystrixCommand(fallbackMethod = "fallback")
	public TrendingMedia getTrends() {

		trendingBean = rest.getForObject(
				"https://api.themoviedb.org/3/trending/movie/week?api_key=df748feae4d49daeefec7d788e14fb4f",
				TrendingMedia.class);

		return trendingBean;
	}

	public TrendingMedia getTrendsDay() {

		trendingBean = rest.getForObject(
				"https://api.themoviedb.org/3/trending/movie/day?api_key=df748feae4d49daeefec7d788e14fb4f",
				TrendingMedia.class);

		return trendingBean;
	}

	public TrendingMedia fallback() {
		return trendingBean;
	}
}
