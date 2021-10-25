package com.github.cassiacristina.citiesapi.cities.repository;

import com.github.cassiacristina.citiesapi.cities.entitie.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
