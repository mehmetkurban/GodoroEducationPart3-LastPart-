
package com.godoro.human.data.repository;

import com.godoro.human.data.entity.Department;
import javax.persistence.EntityManager;

public class DepartmentRepository {
    private EntityManager entityManager;

    public Department find(long departmentId) {
        return entityManager.find(Department.class, departmentId);
    }

    public  DepartmentRepository(EntityManager entityManager) {
        this.entityManager=entityManager;
    }
    
}
