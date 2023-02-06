package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayExtratemp1;

@RepositoryRestResource
public interface UpiitaweDayExtratemp1Repository extends CrudRepository <UpiitaweDayExtratemp1,Integer> {
    
}
