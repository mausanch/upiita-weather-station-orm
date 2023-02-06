package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoilmoist2;

@RepositoryRestResource
public interface UpiitaweDaySoilmoist2Repository extends CrudRepository <UpiitaweDaySoilmoist2,Integer>{
    
}
