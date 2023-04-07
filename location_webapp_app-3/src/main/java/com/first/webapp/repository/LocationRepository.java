package com.first.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.first.webapp.entites.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
