package com.netsol.neo4j.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.netsol.neo4j.domain.Company;

public interface CompanyRepository extends Neo4jRepository<Company, Long> {

	@Query(value = "match (c:Company {name:{name}}) return c ")
	public Company getCompantByName(@Param("name") String name);
}
