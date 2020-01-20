package com.space.controller;

import com.space.model.Ship;
import com.space.service.ShipDTO;
import com.space.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping("/rest/ships")
    public List<Ship> getShips(@RequestParam(value = "name") Optional<String> reqName,
                               @RequestParam(value = "planet") Optional<String> reqPlanet,
                               @RequestParam(value = "shipType") Optional<String> reqShipType,
                               @RequestParam(value = "after") Optional<Long> reqAfter,
                               @RequestParam(value = "before") Optional<Long> reqBefore,
                               @RequestParam(value = "isUsed") Optional<Boolean> reqIsUsed,
                               @RequestParam(value = "minSpeed") Optional<Double> reqMinSpeed,
                               @RequestParam(value = "maxSpeed") Optional<Double> reqMaxSpeed,
                               @RequestParam(value = "minCrewSize") Optional<Integer> reqMinCrewSize,
                               @RequestParam(value = "maxCrewSize") Optional<Integer> reqMaxCrewSize,
                               @RequestParam(value = "minRating") Optional<Double> reqMinRating,
                               @RequestParam(value = "maxRating") Optional<Double> reqMaxRating,
                               @RequestParam(value = "order", defaultValue = "ID") Optional<String> reqOrder,
                               @RequestParam(value = "pageNumber", defaultValue = "0") Optional<Integer> reqPageNumber,
                               @RequestParam(value = "pageSize", defaultValue = "3") Optional<Integer> reqPageSize) {
        ShipDTO shipDTO = new ShipDTO(reqName, reqPlanet, reqShipType, reqAfter, reqBefore, reqIsUsed,
                reqMinSpeed, reqMaxSpeed, reqMinCrewSize, reqMaxCrewSize, reqMinRating, reqMaxRating, reqOrder,
                reqPageNumber, reqPageSize);
        return shipService.getShips(shipDTO);
    }

    @GetMapping("/rest/ships/count")
    public Long getShipCount(@RequestParam(value = "name") Optional<String> reqName,
                             @RequestParam(value = "planet") Optional<String> reqPlanet,
                             @RequestParam(value = "shipType") Optional<String> reqShipType,
                             @RequestParam(value = "after") Optional<Long> reqAfter,
                             @RequestParam(value = "before") Optional<Long> reqBefore,
                             @RequestParam(value = "isUsed") Optional<Boolean> reqIsUsed,
                             @RequestParam(value = "minSpeed") Optional<Double> reqMinSpeed,
                             @RequestParam(value = "maxSpeed") Optional<Double> reqMaxSpeed,
                             @RequestParam(value = "minCrewSize") Optional<Integer> reqMinCrewSize,
                             @RequestParam(value = "maxCrewSize") Optional<Integer> reqMaxCrewSize,
                             @RequestParam(value = "minRating") Optional<Double> reqMinRating,
                             @RequestParam(value = "maxRating") Optional<Double> reqMaxRating) {
        Optional<String> order = Optional.of("");
        Optional<Integer> pageNumber = Optional.of(Integer.MAX_VALUE);
        Optional<Integer> pageSize = Optional.of(Integer.MAX_VALUE);
        ShipDTO shipDTO = new ShipDTO(reqName, reqPlanet, reqShipType, reqAfter, reqBefore, reqIsUsed, reqMinSpeed,
                reqMaxSpeed, reqMinCrewSize, reqMaxCrewSize, reqMinRating, reqMaxRating, order, pageNumber, pageSize);
        return shipService.shipCount(shipDTO);
    }

    @PostMapping("/rest/ships")
    public Ship addShip(@RequestBody Ship ship) {
        return shipService.createShip(ship);
    }

    @GetMapping("/rest/ships/{id}")
    public Ship getShipById(@PathVariable Long id) {
        return shipService.getShip(id);
    }

    @DeleteMapping("/rest/ships/{id}")
    public void deleteShip(@PathVariable Long id) {
        shipService.deleteShip(id);
    }

    @PostMapping("/rest/ships/{id}")
    public Ship updateShipById(@PathVariable Long id, @RequestBody Ship ship) {
        return shipService.updateShip(id, ship);
    }
}