package com.netsol.neo4j.services;

import org.springframework.stereotype.Service;

import com.netsol.neo4j.dto.HiredDto;

@Service
public interface HIREDService {

	public HiredDto saveHired(HiredDto hiredDto);

}
