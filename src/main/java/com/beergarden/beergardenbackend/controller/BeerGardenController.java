package com.beergarden.beergardenbackend.controller;

import com.beergarden.beergardenbackend.model.BeerGardenEntity;
import com.beergarden.beergardenbackend.repository.BeerGardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beergardens")
    public class BeerGardenController {

    @Autowired
    private BeerGardenRepository beerGardenRepository;

    @GetMapping("/all")
    public List<BeerGardenEntity> getAllBeerGardens() {
        return beerGardenRepository.findAll();
    }

    @PostMapping
    public BeerGardenEntity addData(@RequestBody BeerGardenEntity data) {
        return beerGardenRepository.save(data);
    }

}
