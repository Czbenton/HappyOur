package com.zach.Entities;

import javax.persistence.*;

/**
 * Created by jeremypitt on 1/23/17.
 */
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String hh_day;

    @Column(nullable = false)
    private String hh_starttime;

    @Column(nullable = false)
    private String hh_endtime;

    @Column(nullable = false)
    private String hh_details;

    @Column
    private String hh2_day;

    @Column
    private String hh2_starttime;

    @Column
    private String hh2_endtime;

    @Column
    private String hh2_details;

    @Column
    private String hh3_day;

    @Column
    private String hh3_starttime;

    @Column
    private String hh3_endtime;

    @Column
    private String hh3_details;

    @Column
    private String hh4_day;

    @Column
    private String hh4_starttime;

    @Column
    private String hh4_endtime;

    @Column
    private String hh4_details;

    @Column
    private int parking_diff;

    @Column
    private int seating_cap;

    @Column
    private int noisy_atmo;

    public Location() {
    }

    public Location(String name, String address, String hh_day, String hh_starttime, String hh_endtime, String hh_details, String hh2_day, String hh2_starttime, String hh2_endtime, String hh2_details, String hh3_day, String hh3_starttime, String hh3_endtime, String hh3_details, String hh4_day, String hh4_starttime, String hh4_endtime, String hh4_details, int parking_diff, int seating_cap, int noisy_atmo) {
        this.name = name;
        this.address = address;
        this.hh_day = hh_day;
        this.hh_starttime = hh_starttime;
        this.hh_endtime = hh_endtime;
        this.hh_details = hh_details;
        this.hh2_day = hh2_day;
        this.hh2_starttime = hh2_starttime;
        this.hh2_endtime = hh2_endtime;
        this.hh2_details = hh2_details;
        this.hh3_day = hh3_day;
        this.hh3_starttime = hh3_starttime;
        this.hh3_endtime = hh3_endtime;
        this.hh3_details = hh3_details;
        this.hh4_day = hh4_day;
        this.hh4_starttime = hh4_starttime;
        this.hh4_endtime = hh4_endtime;
        this.hh4_details = hh4_details;
        this.parking_diff = parking_diff;
        this.seating_cap = seating_cap;
        this.noisy_atmo = noisy_atmo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHh_day() {
        return hh_day;
    }

    public void setHh_day(String hh_day) {
        this.hh_day = hh_day;
    }

    public String getHh_starttime() {
        return hh_starttime;
    }

    public void setHh_starttime(String hh_starttime) {
        this.hh_starttime = hh_starttime;
    }

    public String getHh_endtime() {
        return hh_endtime;
    }

    public void setHh_endtime(String hh_endtime) {
        this.hh_endtime = hh_endtime;
    }

    public String getHh_details() {
        return hh_details;
    }

    public void setHh_details(String hh_details) {
        this.hh_details = hh_details;
    }

    public String getHh2_day() {
        return hh2_day;
    }

    public void setHh2_day(String hh2_day) {
        this.hh2_day = hh2_day;
    }

    public String getHh2_starttime() {
        return hh2_starttime;
    }

    public void setHh2_starttime(String hh2_starttime) {
        this.hh2_starttime = hh2_starttime;
    }

    public String getHh2_endtime() {
        return hh2_endtime;
    }

    public void setHh2_endtime(String hh2_endtime) {
        this.hh2_endtime = hh2_endtime;
    }

    public String getHh2_details() {
        return hh2_details;
    }

    public void setHh2_details(String hh2_details) {
        this.hh2_details = hh2_details;
    }

    public String getHh3_day() {
        return hh3_day;
    }

    public void setHh3_day(String hh3_day) {
        this.hh3_day = hh3_day;
    }

    public String getHh3_starttime() {
        return hh3_starttime;
    }

    public void setHh3_starttime(String hh3_starttime) {
        this.hh3_starttime = hh3_starttime;
    }

    public String getHh3_endtime() {
        return hh3_endtime;
    }

    public void setHh3_endtime(String hh3_endtime) {
        this.hh3_endtime = hh3_endtime;
    }

    public String getHh3_details() {
        return hh3_details;
    }

    public void setHh3_details(String hh3_details) {
        this.hh3_details = hh3_details;
    }

    public String getHh4_day() {
        return hh4_day;
    }

    public void setHh4_day(String hh4_day) {
        this.hh4_day = hh4_day;
    }

    public String getHh4_starttime() {
        return hh4_starttime;
    }

    public void setHh4_starttime(String hh4_starttime) {
        this.hh4_starttime = hh4_starttime;
    }

    public String getHh4_endtime() {
        return hh4_endtime;
    }

    public void setHh4_endtime(String hh4_endtime) {
        this.hh4_endtime = hh4_endtime;
    }

    public String getHh4_details() {
        return hh4_details;
    }

    public void setHh4_details(String hh4_details) {
        this.hh4_details = hh4_details;
    }

    public int getParking_diff() {
        return parking_diff;
    }

    public void setParking_diff(int parking_diff) {
        this.parking_diff = parking_diff;
    }

    public int getSeating_cap() {
        return seating_cap;
    }

    public void setSeating_cap(int seating_cap) {
        this.seating_cap = seating_cap;
    }

    public int getNoisy_atmo() {
        return noisy_atmo;
    }

    public void setNoisy_atmo(int noisy_atmo) {
        this.noisy_atmo = noisy_atmo;
    }
}
