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
	ServiceTrends service;

	@Autowired
	TrendingMedia trending;

	@RequestMapping("/test")
	public String movie() {
		return "home";
	}

	@RequestMapping("/trending")
	public String trendingWeek(Model m) {
		trending = service.getTrends();

		m.addAttribute("trend", trending);

		return "trendWeek";

	}

	@RequestMapping("/trendingday")
	public String trendingDay(Model m) {

		trending = service.getTrendsDay();

		m.addAttribute("trend", trending);

		return "trendDay";

	}

	@RequestMapping("/notfound")
	@ResponseBody
	public String NotFound() {

		return "home page not found";

	}
}
