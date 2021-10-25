package com.github.cassiacristina.citiesapi.countries.repository;

import com.github.cassiacristina.citiesapi.countries.entitie.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
