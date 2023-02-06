package com.ipn.upiita.weatherstation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.ipn.upiita.weatherstation.model.entity.UpiitaweDayIntempbatterystatus;

@RepositoryRestController
public interface UpiitaweDayIntempbatterystatusRepository extends CrudRepository <UpiitaweDayIntempbatterystatus,Integer> {
    
}
