
package com.godoro.human.business.logic;

import com.godoro.human.business.document.EmployeeDetail;
import com.godoro.human.business.document.EmployeeSummary;
import com.godoro.human.data.entity.Department;
import com.godoro.human.data.entity.Employee;
import com.godoro.human.data.repository.DepartmentRepository;
import com.godoro.human.data.repository.EmployeeRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Persistence;


public class EmployeeLogic {
    
    public void create(EmployeeDetail employeeDetail){
        
        EntityManager entityManager=Persistence
            .createEntityManagerFactory("Enterprise10PU")
            .createEntityManager();
        
            EmployeeRepository employeeRepository=new EmployeeRepository(entityManager);
            Employee employee=new Employee();
            employee.setEmployeeName(employeeDetail.getEmployeName());
            employee.setMontlySalary(employeeDetail.getMontlySalary());
            DepartmentRepository departmentRepository=new DepartmentRepository(entityManager);
            Department department=departmentRepository.find(employeeDetail.getDepartmentId());
            employee.setDepartment(department);
            entityManager.getTransaction().begin();
            employeeRepository.persist(employee);
            entityManager.getTransaction().commit();
        entityManager.close();
    }
     
    public EmployeeSummary listByDepartmentId(long departmentId){
        
        EmployeeSummary employeeSummary=new EmployeeSummary();
        employeeSummary.setEmployeeList(new ArrayList<>());

        EntityManager entityManager=Persistence
                .createEntityManagerFactory("Enterprise10PU")
                .createEntityManager();

             EmployeeRepository employeeRepository=new EmployeeRepository(entityManager);
            List<Employee> employeeList=employeeRepository.listByDepartmentId(departmentId);

            for(Employee employee:employeeList){
                EmployeeDetail employeeDetail=new EmployeeDetail();
                employeeDetail.setEmployeeId(employee.getEmployeeId());
                employeeDetail.setEmployeName(employee.getEmployeeName());
                employeeDetail.setMontlySalary(employee.getMontlySalary());
                employeeDetail.setDepartmentId(employee.getDepartment().getDepartmentId());
                employeeDetail.setDepartmentName(employee.getDepartment().getDepartmentName());
                employeeSummary.getEmployeeList().add(employeeDetail);
            }
        
        entityManager.close();  
    return employeeSummary;
    }
    
  
}
