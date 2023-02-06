package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayExtratemp2;

@RepositoryRestResource
public interface UpiitaweDayExtratemp2Repository extends CrudRepository <UpiitaweDayExtratemp2,Integer> {
    
}
