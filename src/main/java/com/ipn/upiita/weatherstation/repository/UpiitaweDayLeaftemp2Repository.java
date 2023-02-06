package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UpiitaweDayLeaftemp2Repository extends CrudRepository<UpiitaweDayLeaftemp2Repository, Integer>{
    
}
