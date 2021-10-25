package com.github.cassiacristina.citiesapi.cities.entitie;

import com.github.cassiacristina.citiesapi.states.entitie.State;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity(name = "City")
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    // Opção usando somente o id da uf
    // private Integer uf;

    //Opção para mostrar a UF
    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;

    private Integer ibge;

    // Opção considerando a lat_lon como String
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City() {
    }

/*    public City(final Long id, final String name, final Integer uf, final Integer ibge,
                final String geolocation, final Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.ibge = ibge;
        this.geolocation = geolocation;
        this.location = location;
    }*/

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /* Opção usando somente o id da uf
    public Integer getUf() {
        return uf;
    }*/

    public State getState() {
        return state;
    }

    public Integer getIbge() {
        return ibge;
    }

    // Opção considerando a lat_lon como String
    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return location;
    }
}
