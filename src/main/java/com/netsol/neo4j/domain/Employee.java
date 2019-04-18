package com.netsol.neo4j.domain;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@NodeEntity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private double salary;
	@JsonIgnoreProperties("employee")
	@Relationship(type = "HIRED", direction = Relationship.INCOMING)
	private List<Company> companies;

	public List<Company> getCompanies() {
		return companies;
	}

	
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public Employee() {
	}


	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", companies=" + companies + "]";
	}
}
