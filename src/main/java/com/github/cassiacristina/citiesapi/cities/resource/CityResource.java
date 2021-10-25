package com.github.cassiacristina.citiesapi.cities.resource;

import com.github.cassiacristina.citiesapi.cities.entitie.City;
import com.github.cassiacristina.citiesapi.cities.repository.CityRepository;
import com.github.cassiacristina.citiesapi.states.entitie.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<City> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
