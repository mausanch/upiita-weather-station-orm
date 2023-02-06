package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayUv;

@RepositoryRestResource
public interface UpiitaweDayUvRepository extends CrudRepository <UpiitaweDayUv , Integer>{
    
}
