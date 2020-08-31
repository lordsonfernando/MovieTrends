package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")

public class TrendController {
	@Autowired
	ServiceTrends serv;
	/*
	 * 
	 * 
	 */
	@Autowired 
	TrendingMedia trend;
	 
	
	@RequestMapping("/test")
	public String movie()
	{
		return "trendhome";
	}

	@RequestMapping("/trending")
	public String trendingWeek(Model m)
	{
		
		//Model m = null;
		// TrendingMedia trend = new TrendingMedia();
			//	ServiceTrends serv = new ServiceTrends();
				trend= serv.getTrends();
		 
		
		m.addAttribute("trend",trend);
		//m.addAttribute("trend",tr);
		
		return"home";
		
		                           		                          
	}
	@RequestMapping("/trendingday")
	public String trendingDay(Model m)
	{
		
		//Model m = null;
		// TrendingMedia trend = new TrendingMedia();
			//	ServiceTrends serv = new ServiceTrends();
				trend= serv.getTrendsDay();
		 
		
		m.addAttribute("trend",trend);
		//m.addAttribute("trend",tr);
		
		return"home";
		
		                           		                          
	}
	@RequestMapping("/notfound")
	@ResponseBody
	public String NotFound()
	{
		
		
		return"home page not found";
		
		                           		                          
	}
}
