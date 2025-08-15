package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class EstateOperationLog {

    private String zone;
    private LocalDate date;
    private double pluckedKg;
    private int absentWorkers;
    private double rainfallMm;
    private String remarks;

    public EstateOperationLog(String zone, LocalDate date, double pluckedKg, int absentWorkers, double rainfallMm, String remarks) {
        this.zone = zone;
        this.date = date;
        this.pluckedKg = pluckedKg;
        this.absentWorkers = absentWorkers;
        this.rainfallMm = rainfallMm;
        this.remarks = remarks;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPluckedKg() {
        return pluckedKg;
    }

    public void setPluckedKg(double pluckedKg) {
        this.pluckedKg = pluckedKg;
    }

    public int getAbsentWorkers() {
        return absentWorkers;
    }

    public void setAbsentWorkers(int absentWorkers) {
        this.absentWorkers = absentWorkers;
    }

    public double getRainfallMm() {
        return rainfallMm;
    }

    public void setRainfallMm(double rainfallMm) {
        this.rainfallMm = rainfallMm;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "EstateOperationLog{" +
                "zone='" + zone + '\'' +
                ", date=" + date +
                ", pluckedKg=" + pluckedKg +
                ", absentWorkers=" + absentWorkers +
                ", rainfallMm=" + rainfallMm +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

