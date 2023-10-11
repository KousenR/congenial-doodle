package com.mindex.challenge.data;
import java.util.*;

public class Compensation {
    private Employee employee;
    private Compensation compensation;
    private int salary;
    private Date effectiveDate;

    public Compensation() {
    }

    public Compensation(Employee employee, Compensation compensation){
        this.employee = employee;
        this.compensation = compensation;
    }

    /* GET methods */
    public Employee getEmployee() {
        return employee;
    }
    public int getSalary(){
        return salary;
    }
    public Date getEffectiveDate(){
        return effectiveDate;
    }

    /* SET methods */
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setEffectiveDate(Date effectiveDate){
        this.effectiveDate = effectiveDate;
    }
}
