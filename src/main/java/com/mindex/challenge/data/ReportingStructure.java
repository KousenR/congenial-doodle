package com.mindex.challenge.data;

import java.util.List;

public class ReportingStructure {
    private Employee employee;
    private int numOfReports;

    public ReportingStructure() {
    }

    public ReportingStructure (Employee employee, int numOfReports){
        this.employee = employee;
        this.numOfReports = numOfReports;
    }

    /* GET methods */
    public Employee getEmployee(){
        return employee;
    }

    public int getNumOfReports(){
        return numOfReports;
    }
}
