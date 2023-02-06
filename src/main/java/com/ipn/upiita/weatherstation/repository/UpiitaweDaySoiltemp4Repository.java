package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoiltemp4;

@RepositoryRestResource
public interface UpiitaweDaySoiltemp4Repository extends CrudRepository <UpiitaweDaySoiltemp4, Integer> {
    
}
