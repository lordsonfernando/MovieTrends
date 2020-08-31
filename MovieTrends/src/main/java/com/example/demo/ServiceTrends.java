package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ServiceTrends {
	RestTemplate rest = new RestTemplate();
	@Autowired
	TrendingMedia trm ;

	@HystrixCommand(fallbackMethod = "fallback")
public TrendingMedia getTrends()
{
	/*
	 * TrendingMedia tr = new TrendingMedia(); tr.setValues(Arrays.asList(new
	 * results("title","kjhgy","6578",5.6f), new
	 * results("title","kjhgy","6578",5.6f), new
	 * results("title","kjhgy","6578",5.6f) ));
	 */
	
	       trm = rest.getForObject(
			"https://api.themoviedb.org/3/trending/movie/week?api_key=df748feae4d49daeefec7d788e14fb4f",TrendingMedia.class);
	       
	return trm;
}
	public TrendingMedia getTrendsDay()
	{
		/*
		 * TrendingMedia tr = new TrendingMedia(); tr.setValues(Arrays.asList(new
		 * results("title","kjhgy","6578",5.6f), new
		 * results("title","kjhgy","6578",5.6f), new
		 * results("title","kjhgy","6578",5.6f) ));
		 */
		
		       trm = rest.getForObject(
				"https://api.themoviedb.org/3/trending/movie/day?api_key=df748feae4d49daeefec7d788e14fb4f",TrendingMedia.class);
		      
		return trm;
	}
	public TrendingMedia fallback()
	{
		return trm;
	}
}
