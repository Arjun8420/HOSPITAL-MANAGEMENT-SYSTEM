package com.mindtree.orchard.doctor;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.Entiy.Doctor;
import com.mindtree.orchard.Interfaces.DoctorInterface;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DoctorApplicationTests {
	@Autowired
	private DoctorInterface docservice;
	
	@Test
	public void getAllDoctors() {
		List<Doctor> docs=docservice.getAllDoctors();
		assertThat(docs).size().isGreaterThan(0);
		
	}
	
	@Test
	public void getDoctor() {
		Doctor doc=docservice.getDoctor(1);
		assertEquals("John", doc.getDocName());
	}
	
	@Test
	public void postDoctor() {
		Doctor doc=new Doctor("Paul", 43, "male", "Radiologist");
		docservice.addDoctor(doc);
	}
	
}
