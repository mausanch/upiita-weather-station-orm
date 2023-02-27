package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayLeaftemp2;

@RepositoryRestResource
public interface UpiitaweDayLeaftemp2Repository extends CrudRepository<UpiitaweDayLeaftemp2, Integer>{
    
}
