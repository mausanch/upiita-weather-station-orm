package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDaySoilmoist4;

@RepositoryRestResource
public interface UpiitaweDaySoilmoist4Repository extends CrudRepository <UpiitaweDaySoilmoist4,Integer>{
    
}
