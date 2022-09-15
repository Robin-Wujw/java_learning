package com.robin.ssm.service;

import com.github.pagehelper.PageInfo;
import com.robin.ssm.pojo.Employee;

import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-09-06 14:19
 */
public interface EmployeeService {

    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
