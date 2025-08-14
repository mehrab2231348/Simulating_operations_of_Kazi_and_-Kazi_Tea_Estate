package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class DailyEstateMonitoring {

    private String zone;
    private int absentWorkers;
    private double totalPlucked;
    private LocalDate date;
    private double rainfall;
    private String details;

    public DailyEstateMonitoring(String zone, int absentWorkers, double totalPlucked, LocalDate date, double rainfall, String details) {
        this.zone = zone;
        this.absentWorkers = absentWorkers;
        this.totalPlucked = totalPlucked;
        this.date = date;
        this.rainfall = rainfall;
        this.details = details;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getAbsentWorkers() {
        return absentWorkers;
    }

    public void setAbsentWorkers(int absentWorkers) {
        this.absentWorkers = absentWorkers;
    }

    public double getTotalPlucked() {
        return totalPlucked;
    }

    public void setTotalPlucked(double totalPlucked) {
        this.totalPlucked = totalPlucked;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

