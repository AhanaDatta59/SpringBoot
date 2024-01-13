package com.springboot.SpringBoot.controller;

import com.springboot.SpringBoot.entity.Department;
import com.springboot.SpringBoot.service.DepartmentService;
import com.springboot.SpringBoot.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private  DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
//        DepartmentService service = new DepartmentServiceImpl();
        return departmentService.saveDepartment(department);
    }
}
