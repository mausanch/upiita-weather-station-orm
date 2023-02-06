package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoilmoist1;

@RepositoryRestResource
public interface UpiitaweDaySoilmoist1Repository extends CrudRepository <UpiitaweDaySoilmoist1,Integer>{
    
}
