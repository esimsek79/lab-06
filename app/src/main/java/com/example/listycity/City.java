package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City with the given name and province
     * @param city
     *      The name of the city
     * @param province
     *      The province the city belongs to
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city
     * @return
     *      The city name as a String
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province the city belongs to
     * @return
     *      The province name as a String
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city alphabetically by city name
     * @param o
     *      The other City to compare to
     * @return
     *      A negative integer, zero, or positive integer if this city name
     *      is less than, equal to, or greater than the other city name
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Checks equality based on city name and province name
     * @param o
     *      The object to compare to
     * @return
     *      true if both city name and province name are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Returns a hash code based on city name and province name
     * @return
     *      An integer hash code
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(city, province);
    }
}