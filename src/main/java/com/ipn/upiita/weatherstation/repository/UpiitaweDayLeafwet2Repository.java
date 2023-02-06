package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayLeafwet2;

@RepositoryRestResource
public interface UpiitaweDayLeafwet2Repository extends CrudRepository <UpiitaweDayLeafwet2,Integer>{
    
}
