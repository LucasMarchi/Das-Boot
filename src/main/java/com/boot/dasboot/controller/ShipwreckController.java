package com.boot.dasboot.controller;

import com.boot.dasboot.model.Shipwreck;
import com.boot.dasboot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shipwrecks")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @GetMapping
    public List<Shipwreck> list() {
        return shipwreckRepository.findAll();
    }

    @PostMapping
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @GetMapping("/{id}")
    public Shipwreck get(@PathVariable Long id) {
        return shipwreckRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        Shipwreck existingShipwreck = shipwreckRepository.findById(id).get();
        BeanUtils.copyProperties(shipwreck, existingShipwreck);
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @DeleteMapping("/{id}")
    public Shipwreck delete(@PathVariable Long id) {
        Shipwreck existingShipwreck = shipwreckRepository.findById(id).get();
        shipwreckRepository.delete(existingShipwreck);
        return existingShipwreck;
    }

}
