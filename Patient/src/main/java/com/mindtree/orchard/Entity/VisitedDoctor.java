package com.mindtree.orchard.Entity;

import java.sql.Date;

public class VisitedDoctor {
	
	private Integer visdoc;
	private String prescription;
	private Date date;
	private String docName;
	
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public Integer getVisdoc() 
	{
		return visdoc;
	}
	
	public void setVisdoc(Integer visdoc) 
	{
		this.visdoc = visdoc;
	}
	
	public String getPrescription() 
	{
		return prescription;
	}
	
	public void setPrescription(String prescription) 
	{
		this.prescription = prescription;
	}
	
	public java.util.Date getDate() 
	{
		return date;
	}
	
	public void setDate(Date date) 
	{
		this.date = date;
	}
	
	public VisitedDoctor(String docName, Integer visdoc, String prescription,Date date) 
	{
		super();
		this.docName=docName;
		this.visdoc = visdoc;
		this.prescription = prescription;
		this.date = date;
	}
	
	public VisitedDoctor() 
	{
		super();
	}

	
}
