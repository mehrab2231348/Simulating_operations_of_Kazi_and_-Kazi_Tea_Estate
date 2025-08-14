package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class AssignManageWorkerShifts {

    private String workerName;
    private String workingZone;
    private String workerTask;

    public AssignManageWorkerShifts(String workerName, String workingZone, String workerTask) {
        this.workerName = workerName;
        this.workingZone = workingZone;
        this.workerTask = workerTask;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkingZone() {
        return workingZone;
    }

    public void setWorkingZone(String workingZone) {
        this.workingZone = workingZone;
    }

    public String getWorkerTask() {
        return workerTask;
    }

    public void setWorkerTask(String workerTask) {
        this.workerTask = workerTask;
    }

    @Override
    public String toString() {
        return "AssignManageWorkerShifts{" +
                "workerName='" + workerName + '\'' +
                ", workingZone='" + workingZone + '\'' +
                ", workerTask='" + workerTask + '\'' +
                '}';
    }
}
