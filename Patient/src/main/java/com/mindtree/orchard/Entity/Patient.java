package com.mindtree.orchard.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	private Integer patid;
	private String patname;
	private Integer age;
	private Integer docvisited;
	private String prescription;
	
	public Patient(Date date, Integer patid,Integer age, String patname, Integer docvisited, String prescription) 
	{
		this.date = date;
		this.patid = patid;
		this.patname = patname;
		this.docvisited = docvisited;
		this.prescription = prescription;
		this.age=age;
	}
	
	public Integer getAge() 
	{
		return age;
	}
	
	public void setAge(Integer age) 
	{
		this.age = age;
	}
	
	public Patient() {
	}
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	

	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getPatid() 
	{
		return patid;
	}
	
	public void setPatid(Integer patid) 
	{
		this.patid = patid;
	}
	
	public String getPatname() 
	{
		return patname;
	}
	
	public void setPatname(String patname)
	{
		this.patname = patname;
	}
	
	public Integer getDocvisited()
	{
		return docvisited;
	}
	
	public void setDocvisited(Integer docvisited)
	{
		this.docvisited = docvisited;
	}
	
	public String getPrescription()
	{
		return prescription;
	}
	
	public void setPrescription(String prescription)
	{
		this.prescription = prescription;
	}
	
}
