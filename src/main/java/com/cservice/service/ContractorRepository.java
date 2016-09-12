package com.cservice.service;

import com.cservice.Entity.Contractor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ContractorRepository extends CrudRepository<Contractor, Long> {


    List<Contractor> findByCity( String city);

    Contractor findByEmail(String email);
}
