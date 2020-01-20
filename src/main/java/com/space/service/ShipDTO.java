package com.space.service;

import java.util.Optional;

public class ShipDTO {

    private Optional<String> name;
    private Optional<String> planet;
    private Optional<String> shipType;
    private Optional<Long> after;
    private Optional<Long> before;
    private Optional<Boolean> isUsed;
    private Optional<Double> minSpeed;
    private Optional<Double> maxSpeed;
    private Optional<Integer> minCrewSize;
    private Optional<Integer> maxCrewSize;
    private Optional<Double> minRating;
    private Optional<Double> maxRating;
    private Optional<String> order;
    private Optional<Integer> pageNumber;
    private Optional<Integer> pageSize;

    public ShipDTO() {
    }

    public ShipDTO(Optional<String> name, Optional<String> planet, Optional<String> shipType,
                   Optional<Long> after, Optional<Long> before, Optional<Boolean> isUsed,
                   Optional<Double> minSpeed, Optional<Double> maxSpeed, Optional<Integer> minCrewSize,
                   Optional<Integer> maxCrewSize, Optional<Double> minRating, Optional<Double> maxRating,
                   Optional<String> order, Optional<Integer> pageNumber, Optional<Integer> pageSize) {
        this.name = name;
        this.planet = planet;
        this.shipType = shipType;
        this.after = after;
        this.before = before;
        this.isUsed = isUsed;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.minCrewSize = minCrewSize;
        this.maxCrewSize = maxCrewSize;
        this.minRating = minRating;
        this.maxRating = maxRating;
        this.order = order;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<String> getPlanet() {
        return planet;
    }

    public void setPlanet(Optional<String> planet) {
        this.planet = planet;
    }

    public Optional<String> getShipType() {
        return shipType;
    }

    public void setShipType(Optional<String> shipType) {
        this.shipType = shipType;
    }

    public Optional<Long> getAfter() {
        return after;
    }

    public void setAfter(Optional<Long> after) {
        this.after = after;
    }

    public Optional<Long> getBefore() {
        return before;
    }

    public void setBefore(Optional<Long> before) {
        this.before = before;
    }

    public Optional<Boolean> getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Optional<Boolean> isUsed) {
        this.isUsed = isUsed;
    }

    public Optional<Double> getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(Optional<Double> minSpeed) {
        this.minSpeed = minSpeed;
    }

    public Optional<Double> getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Optional<Double> maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Optional<Integer> getMinCrewSize() {
        return minCrewSize;
    }

    public void setMinCrewSize(Optional<Integer> minCrewSize) {
        this.minCrewSize = minCrewSize;
    }

    public Optional<Integer> getMaxCrewSize() {
        return maxCrewSize;
    }

    public void setMaxCrewSize(Optional<Integer> maxCrewSize) {
        this.maxCrewSize = maxCrewSize;
    }

    public Optional<Double> getMinRating() {
        return minRating;
    }

    public void setMinRating(Optional<Double> minRating) {
        this.minRating = minRating;
    }

    public Optional<Double> getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(Optional<Double> maxRating) {
        this.maxRating = maxRating;
    }

    public Optional<String> getOrder() {
        return order;
    }

    public void setOrder(Optional<String> order) {
        this.order = order;
    }

    public Optional<Integer> getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Optional<Integer> pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    public void setPageSize(Optional<Integer> pageSize) {
        this.pageSize = pageSize;
    }
}