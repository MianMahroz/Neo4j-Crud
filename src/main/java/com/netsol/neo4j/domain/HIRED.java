package com.netsol.neo4j.domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "HIRED")
public class HIRED {
	@Id
	@GeneratedValue
	private Long id;

	private Instant hiringDate;
	private String dept;
	private String interviewedBy;
	private String approvedBy;
	private String reportingManager;

	@StartNode
	private Company company;

	@EndNode
	private Employee employee;

	public HIRED() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Instant hiringDate) {
		this.hiringDate = hiringDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getInterviewedBy() {
		return interviewedBy;
	}

	public void setInterviewedBy(String interviewedBy) {
		this.interviewedBy = interviewedBy;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "HIRED [id=" + id + ", hiringDate=" + hiringDate + ", dept=" + dept + ", interviewedBy=" + interviewedBy
				+ ", approvedBy=" + approvedBy + ", reportingManager=" + reportingManager + ", company=" + company
				+ ", employee=" + employee + "]";
	}

}
