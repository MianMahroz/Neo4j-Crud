package com.netsol.neo4j.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.domain.Employee;
import com.netsol.neo4j.domain.HIRED;
import com.netsol.neo4j.repositories.CompanyRepository;
import com.netsol.neo4j.repositories.EmployeeRepository;
import com.netsol.neo4j.repositories.HIREDRepository;
import static com.netsol.neo4j.utill.NetsolUtill.*;

import java.time.Instant;

@RestController
public class InsertDataController {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private HIREDRepository hireRepo;

	@Autowired
	private CompanyRepository companyRepo;

	Company company;
	Employee employee;
	HIRED hired;

	@GetMapping("/insertData")
	public String insertDate() {

		employee = new Employee();
		employee.setName(genearteRandomNo("Emp"));
		employee = employeeRepo.save(employee);

		company = companyRepo.getCompantByName("Netsol");
		if (company == null) {
			System.out.println("Inside New Company");
			Company companyNew = new Company();
			companyNew.setName("Netsol");
			company = companyRepo.save(companyNew);
		}

		hired = new HIRED();
		hired.setApprovedBy(genearteRandomNo("ApprovedBy"));
		hired.setCompany(company);
		hired.setDept(genearteRandomNo("Dept"));
		hired.setEmployee(employee);
		hired.setHiringDate(Instant.now());
		hired.setInterviewedBy(genearteRandomNo("interviewBy"));
		hired.setReportingManager(genearteRandomNo("manager"));
		System.out.println(hired.toString());
		hired = hireRepo.save(hired);
		System.out.println(hired.getId());

		return "";
	}

	@GetMapping("/test")
	public void test() {
		for (int i = 0; i <= 1000; i++) {
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.getForObject("http://localhost:8080/insertData", String.class);
		}
	}
}
