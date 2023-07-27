package com.sane.maniac.mg.objectorientedconcepts.models.children;

import com.sane.maniac.mg.objectorientedconcepts.models.parents.User;

public class Employee extends User {
    int employeeId;
    String designation;

    public Employee(int id, String name, String email, String password, String phoneNumber, int employeeId, String designation) {
        super(id, name, email, password, phoneNumber);
        this.employeeId = employeeId;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeId +
                ", designation='" + designation + '\'' +
                "} " + super.toString();
    }
}
