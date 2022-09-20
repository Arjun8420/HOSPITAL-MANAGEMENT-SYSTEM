package com.mindtree.orchard.Entity;

import java.util.List;

public class ResponcePatient
{
		
	private String name;
	private Integer age;
	
	private List<VisitedDoctor> listOfVisit;
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<VisitedDoctor> getListOfVisit() 
	{
		return listOfVisit;
	}
	
	public void setListOfVisit(List<VisitedDoctor> listOfVisit) 
	{
		this.listOfVisit = listOfVisit;
	}
	
	public ResponcePatient(String name,Integer age,  List<VisitedDoctor> listOfVisit) 
	{
		super();
		this.name = name;
		this.age=age;
		this.listOfVisit = listOfVisit;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public void setAge(Integer age)
	{
		this.age = age;
	}
	
	public ResponcePatient()
	{
		super();
	}

	
}
