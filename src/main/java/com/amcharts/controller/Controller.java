package com.amcharts.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amcharts.service.PopulationService;


@RestController
@CrossOrigin
public class Controller 
{
	@Autowired
	private PopulationService service;
	@RequestMapping(value="/getpopulation")
	public List<Map<String,Object>> countryinfo() 
	{
		System.out.println("IN controller");
		return service.getData();
	}

}
