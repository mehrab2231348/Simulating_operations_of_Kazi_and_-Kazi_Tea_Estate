package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class DailyHarvest {

    private String zone;
    private String pluckerName;
    private double harvestKg;
    private String leafQuality;
    private LocalDate date;

    public DailyHarvest(String zone, String pluckerName, double harvestKg, String leafQuality, LocalDate date) {
        this.zone = zone;
        this.pluckerName = pluckerName;
        this.harvestKg = harvestKg;
        this.leafQuality = leafQuality;
        this.date = date;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getPluckerName() {
        return pluckerName;
    }

    public void setPluckerName(String pluckerName) {
        this.pluckerName = pluckerName;
    }

    public double getHarvestKg() {
        return harvestKg;
    }

    public void setHarvestKg(double harvestKg) {
        this.harvestKg = harvestKg;
    }

    public String getLeafQuality() {
        return leafQuality;
    }

    public void setLeafQuality(String leafQuality) {
        this.leafQuality = leafQuality;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DailyHarvest{" +
                "zone='" + zone + '\'' +
                ", pluckerName='" + pluckerName + '\'' +
                ", harvestKg=" + harvestKg +
                ", leafQuality='" + leafQuality + '\'' +
                ", date=" + date +
                '}';
    }
}
