
package com.godoro.human.business.document;


public class EmployeeDetail {
    private long employeeId;
    private String employeName;
    private double montlySalary;
    private long departmentId;
    private String departmentName;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public double getMontlySalary() {
        return montlySalary;
    }

    public void setMontlySalary(double montlySalary) {
        this.montlySalary = montlySalary;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    
}
