package com.mindtree.orchard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.orchard.Entity.Doctor;
import com.mindtree.orchard.Entity.ResponcePatient;
import com.mindtree.orchard.Entity.Patient;
import com.mindtree.orchard.Entity.VisitedDoctor;
import com.mindtree.orchard.Interfaces.PatientInterface;
import com.mindtree.orchard.Repository.PatientRepository;

@Service
public class PatientService implements PatientInterface
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private PatientRepository patientrepo;
	
	@Override
	public List<Patient> getAllPatient() 
	{
		return patientrepo.findAll();
	}

	@Override
	public Patient getPatient(Integer id) 
	{
		List<Patient> s = patientrepo.findByPatid(id);
		return s.get(0);
	}

	@Override
	public ResponcePatient getVisitDetails(Integer id) 
	{
		List<VisitedDoctor> sts=new ArrayList<>();
		List<Patient> pat=patientrepo.findByPatid(id);
		
		for(int i=0;i<pat.size();i++) 
			
		{
			Doctor d=restTemplate.getForObject("http://doctor/doctor/"+pat.get(i).getDocvisited(), Doctor.class);
			
			sts.add(new VisitedDoctor(d.getDocName(),pat.get(i).getDocvisited(),pat.get(i).getPrescription(),pat.get(i).getDate()));
		}
		ResponcePatient o= new ResponcePatient(pat.get(0).getPatname(),pat.get(0).getAge(), sts);
		
		return o;
	}

	@Override
	public void addPatient(Patient p) 
	{
		patientrepo.save(p);
	}

	@Override
	public void updatePatient(Patient p) 
	{
		patientrepo.save(p);
	}

	@Override
	public void deletePatientById(Integer pid) 
	{
		patientrepo.deleteByPatid(pid);
	}

	@Override
	public void deletePatientVist(Integer id) 
	{
		patientrepo.deleteById(id);
	}

	@Override
	public List<Patient> getDocAndPatById(Integer id) 
	{
		return patientrepo.findByDocvisited(id);
	}

}
