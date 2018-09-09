package com.amcharts.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import com.amcharts.dao.Dao;
@Service
public class PopulationService 
{	
	@Autowired
	private Dao dao;
	public List<Map<String,Object>> getData()
	{
		return dao.getData();
	}

}
