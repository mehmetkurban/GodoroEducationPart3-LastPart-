
package com.godoro.human.data.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private long employeeId;
    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "montlySalary")
    private double montlySalary;
    @ManyToOne
    @Column(name = "departmentId")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMontlySalary() {
        return montlySalary;
    }

    public void setMontlySalary(double montlySalary) {
        this.montlySalary = montlySalary;
    }
    
}
