package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoilmoist3;

@RepositoryRestResource
public interface UpiitaweDaySoilmoist3Repository extends CrudRepository <UpiitaweDaySoilmoist3,Integer> {
    
}
