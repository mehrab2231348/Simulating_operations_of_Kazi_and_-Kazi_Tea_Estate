package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class EquipmentLog {

    private String equipmentName;
    private LocalDate lastUsed;
    private String condition;
    private String status;
    private LocalDate serviceDate;

    public EquipmentLog(String equipmentName, LocalDate lastUsed, String condition, String status, LocalDate serviceDate) {
        this.equipmentName = equipmentName;
        this.lastUsed = lastUsed;
        this.condition = condition;
        this.status = status;
        this.serviceDate = serviceDate;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public LocalDate getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(LocalDate lastUsed) {
        this.lastUsed = lastUsed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }
}
