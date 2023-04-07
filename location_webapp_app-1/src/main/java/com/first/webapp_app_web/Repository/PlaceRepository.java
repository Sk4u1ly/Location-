package com.first.webapp_app_web.Repository;

import org.springframework.data.repository.CrudRepository;

import com.first.webapp_app_web.Entity.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer> {

}
