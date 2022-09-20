package com.mindtree.orchard.Interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.orchard.Entity.ResponcePatient;
import com.mindtree.orchard.Entity.Patient;

@Service
public interface PatientInterface
{
	
	public List<Patient> getAllPatient();
	public Patient getPatient(Integer id);
	public ResponcePatient getVisitDetails(Integer id);
	
	public void addPatient(Patient p);
	public void updatePatient(Patient p);
	public void deletePatientById(Integer pid);
	public void deletePatientVist(Integer id);
	public List<Patient> getDocAndPatById(Integer id);
	
}
