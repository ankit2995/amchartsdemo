package com.amcharts.model;

public class Population 
{
	private String countryName;
	private long countryPopulation;
	public String getCountryName( )
	{
		return countryName;
	}
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public long getCountryPopulation( )
	{
		return countryPopulation;
	}
	public void setCountryPopulation(long countryPopulation)
	{
		this.countryPopulation=countryPopulation;
	}
}
