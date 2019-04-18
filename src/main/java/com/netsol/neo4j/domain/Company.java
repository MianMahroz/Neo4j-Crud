package com.netsol.neo4j.domain;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Company {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Relationship(type = "HIRED")
	private List<Employee> employees = new ArrayList();

	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Company() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
