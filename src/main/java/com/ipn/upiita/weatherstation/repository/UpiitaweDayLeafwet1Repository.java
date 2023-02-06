package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayLeafwet1;

@RepositoryRestResource
public interface UpiitaweDayLeafwet1Repository extends CrudRepository <UpiitaweDayLeafwet1, Integer> {
    
}
