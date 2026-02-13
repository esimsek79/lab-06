package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist
     * @param city
     *      The candidate city to add
     * @throws IllegalArgumentException
     *      If the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of all cities
     * @return
     *      A sorted List of City objects
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a given city exists in the list
     * @param city
     *      The city to search for
     * @return
     *      true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list if it exists
     * @param city
     *      The city to remove
     * @throws IllegalArgumentException
     *      If the city is not found in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list.");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     * @return
     *      The count of cities as an int
     */
    public int countCities() {
        return cities.size();
    }
}