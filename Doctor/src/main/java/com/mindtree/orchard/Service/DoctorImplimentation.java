package com.mindtree.orchard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orchard.Entiy.Doctor;
import com.mindtree.orchard.Interfaces.DoctorInterface;
import com.mindtree.orchard.Repository.DoctorRepository;

@Service
public class DoctorImplimentation implements DoctorInterface 
{
	
	@Autowired
	private DoctorRepository docrepo;
	
	@Override
	public List<Doctor> getAllDoctors()
	{
		return docrepo.findAll();
	}

	@Override
	public Doctor getDoctor(Integer id) 
	{
		return docrepo.findById(id).get();
	}

	@Override
	public void addDoctor(Doctor doc) 
	{
		docrepo.save(doc);
	}

	@Override
	public void updateDoctor(Doctor doc)
	{
		docrepo.save(doc);
	}

	@Override
	public void deleteDoctor(Integer id) 
	{
		docrepo.deleteById(id);
	}

}
