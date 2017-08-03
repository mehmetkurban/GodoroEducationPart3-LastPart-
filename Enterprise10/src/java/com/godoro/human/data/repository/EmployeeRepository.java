
package com.godoro.human.data.repository;

import com.godoro.human.data.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class EmployeeRepository {
    private EntityManager entityManager;
    
    public EmployeeRepository(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    public void persist(Employee employee){
        entityManager.persist(employee);
    }
    public List<Employee> listByDepartmentId(long departmentId){
        String jpql="select employee from Employee as employee "
                +" where employee.department.departmentId = departmentId";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("departmentId", departmentId);
        return query.getResultList();
    }
}
