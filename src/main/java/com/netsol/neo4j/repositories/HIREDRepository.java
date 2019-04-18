package com.netsol.neo4j.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.netsol.neo4j.domain.HIRED;

public interface HIREDRepository  extends Neo4jRepository<HIRED, Long>{

	@Query("match(e:Employee)<-[h:HIRED]-(c:Company) return h limit 1")
	public List<HIRED> mygetAll();
}
