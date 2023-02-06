package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayIntemp;

@RepositoryRestResource
public interface UpiitaweDayIntempRepository extends CrudRepository <UpiitaweDayIntemp,Integer> {
    
}
