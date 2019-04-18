package com.netsol.neo4j.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.domain.Employee;

public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
	@Query(value = "match (e:Employee {name:{name}}) return e ")
	public Employee getEmployeeByName(@Param("name") String name);
}
