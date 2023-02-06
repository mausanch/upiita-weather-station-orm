package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayExtrahumid1;

@RepositoryRestResource
public interface UpiitaweDayExtrahumid1Repository extends CrudRepository <UpiitaweDayExtrahumid1, Integer> {
    
}
