package com.amcharts.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class Dao 
{
	 @Autowired
     private JdbcTemplate jdbcTemplate;
	 
	 private static final String FETCH_POPULATION_QUERY="select countryname,population from population;";
	 public List<Map<String,Object>> getData()
	 {
		 //List<Population> populationInfo = new ArrayList<Population>();
			List<Map<String,Object>> populationInfo = new LinkedList<Map<String,Object>>();

         populationInfo = jdbcTemplate.queryForList(FETCH_POPULATION_QUERY);
 		//List<Map<String, Object>> populationInfo = Lists.newArrayList();
System.out.println(populationInfo);
         return populationInfo;
	 }
}
