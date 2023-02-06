package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayExtratemp3;

@RepositoryRestResource
public interface UpiitaweDayExtratemp3Repository  extends CrudRepository <UpiitaweDayExtratemp3,Integer>{
    
}
