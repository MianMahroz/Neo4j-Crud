package com.netsol.neo4j.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsol.neo4j.domain.HIRED;
import com.netsol.neo4j.dto.HiredDto;
import com.netsol.neo4j.repositories.CompanyRepository;
import com.netsol.neo4j.repositories.EmployeeRepository;
import com.netsol.neo4j.repositories.HIREDRepository;
import static com.netsol.neo4j.utill.NetsolUtill.*;

@Service
public class HIREDServiceImpl implements HIREDService {
	@Autowired
	private HIREDRepository hireRepo;

	@Autowired
	private CompanyRepository companyRepo;

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public HiredDto saveHired(HiredDto hiredDto) {
		HIRED hired = getMapper().map(hiredDto, HIRED.class);
		hired.setCompany(companyRepo.getCompantByName(hiredDto.getCompany()));
		hired.setEmployee(employeeRepo.getEmployeeByName(hiredDto.getEmployee()));
		hired = hireRepo.save(hired);
		System.out.println(hired.toString());
		return getMapper().map(hired, HiredDto.class);
	}

}
