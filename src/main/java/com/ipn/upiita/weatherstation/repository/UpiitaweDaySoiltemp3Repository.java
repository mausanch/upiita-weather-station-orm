package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoiltemp3;

@RepositoryRestResource
public interface UpiitaweDaySoiltemp3Repository extends CrudRepository <UpiitaweDaySoiltemp3 , Integer>  {
    
}
