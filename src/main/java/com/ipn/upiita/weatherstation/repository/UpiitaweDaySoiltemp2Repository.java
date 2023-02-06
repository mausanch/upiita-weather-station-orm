package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoiltemp2;

@RepositoryRestResource
public interface UpiitaweDaySoiltemp2Repository extends CrudRepository <UpiitaweDaySoiltemp2, Integer>  {
    
}
