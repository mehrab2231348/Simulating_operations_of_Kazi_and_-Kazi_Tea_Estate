package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class GenerateDailyFieldReport {

    private String zone;
    private double pluckedKg;
    private int absentWorkers;
    private String note;

    public GenerateDailyFieldReport(String zone, double pluckedKg, int absentWorkers, String note) {
        this.zone = zone;
        this.pluckedKg = pluckedKg;
        this.absentWorkers = absentWorkers;
        this.note = note;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
