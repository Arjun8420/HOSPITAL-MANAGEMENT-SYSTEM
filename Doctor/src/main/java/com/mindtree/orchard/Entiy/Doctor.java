package com.mindtree.orchard.Entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer docid;
	private String docName;
	private int docAge;
	private String docGender;
	private String docSpecialization;
	
	public Integer getDocid() 
	{
		return docid;
	}
	
	public void setDocid(Integer docid) 
	{
		this.docid = docid;
	}
	
	public String getDocName()
	{
		return docName;
	}
	
	public void setDocName(String docName)
	{
		this.docName = docName;
	}
	
	public int getDocAge() 
	{
		return docAge;
	}
	
	public void setDocAge(int docAge) 
	{
		this.docAge = docAge;
	}
	
	public String getDocGender() 
	{
		return docGender;
	}
	
	public void setDocGender(String docGender) 
	{
		this.docGender = docGender;
	}
	
	public String getDocSpecialization() 
	{
		return docSpecialization;
	}
	
	public void setDocSpecialization(String docSpecialization) 
	{
		this.docSpecialization = docSpecialization;
	}
	
	public Doctor(String docName, int docAge, String docGender, String docSpecialization)
	{
		this.docName = docName;
		this.docAge = docAge;
		this.docGender = docGender;
		this.docSpecialization = docSpecialization;
	}
	
	public Doctor() {
		
	}

}
