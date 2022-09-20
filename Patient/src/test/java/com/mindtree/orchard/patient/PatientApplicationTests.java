package com.mindtree.orchard.patient;


import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.Entity.Patient;
import com.mindtree.orchard.Interfaces.PatientInterface;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PatientApplicationTests {

	@Autowired
	private PatientInterface patinf;

	@Test
	public void getAllPatientsinfo() {
		List<Patient> r=patinf.getAllPatient();
		assertThat(r).size().isGreaterThan(1);
	}
	
	@Test
	public void postpatient() {
		@SuppressWarnings({ "deprecation", "unused" })
		Patient p=new Patient(new Date(2022, 02,13), 123, 15, "Antony", 1, "1 week treatment");
		
	}

}
