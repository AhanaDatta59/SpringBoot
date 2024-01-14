package com.springboot.SpringBoot.service;

import com.springboot.SpringBoot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

     public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
