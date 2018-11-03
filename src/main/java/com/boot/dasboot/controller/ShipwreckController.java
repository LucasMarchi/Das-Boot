package com.boot.dasboot.controller;

import com.boot.dasboot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shipwrecks")
public class ShipwreckController {

    @GetMapping
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }

    @PostMapping
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck);
    }

    @GetMapping("/{id}")
    public Shipwreck get(@PathVariable Long id) {
        return ShipwreckStub.get(id);
    }

    @PutMapping("/{id}")
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.update(id, shipwreck);
    }

    @DeleteMapping("/{id}")
    public Shipwreck delete(@PathVariable Long id) {
        return ShipwreckStub.delete(id);
    }

}
