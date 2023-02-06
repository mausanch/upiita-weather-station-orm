package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoiltemp1;

@RepositoryRestResource
public interface UpiitaweDaySoiltemp1Repository extends CrudRepository <UpiitaweDaySoiltemp1, Integer>{
    
}
