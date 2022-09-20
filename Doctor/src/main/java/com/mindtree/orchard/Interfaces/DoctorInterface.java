package com.mindtree.orchard.Interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.orchard.Entiy.Doctor;

@Service
public interface DoctorInterface 
{
	
	public List<Doctor> getAllDoctors();
	public Doctor getDoctor(Integer id);
	
	public void addDoctor(Doctor doc);
	public void updateDoctor(Doctor doc);
	public void deleteDoctor(Integer id);

}
