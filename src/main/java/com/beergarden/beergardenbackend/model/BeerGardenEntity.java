package com.beergarden.beergardenbackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "beergardens_001")
public class BeerGardenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String address;
    private String openingtimes;
    private String kids;
    private String beer;
    private String tipp;
    private String coordinates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpeningTimes() {
        return openingtimes;
    }

    public void setOpeningTimes(String openingtimes) {
        this.openingtimes = openingtimes;
    }

    public String getKids() {
        return kids;
    }

    public void setKids(String kids) {
        this.kids = kids;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getTipp() {
        return tipp;
    }

    public void setTipp(String tipp) {
        this.tipp = tipp;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

}

