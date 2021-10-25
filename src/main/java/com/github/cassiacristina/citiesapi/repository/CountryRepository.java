package com.github.cassiacristina.citiesapi.repository;

import com.github.cassiacristina.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
