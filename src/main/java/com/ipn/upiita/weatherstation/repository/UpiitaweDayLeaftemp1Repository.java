package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayLeaftemp1;

@RepositoryRestResource
public interface UpiitaweDayLeaftemp1Repository extends CrudRepository <UpiitaweDayLeaftemp1, Integer>{
    
}
