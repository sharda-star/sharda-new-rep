package com.sharda.guide.service;

import com.sharda.guide.model.Employee;

public interface EmployeeService {

	Employee getEmployee(Long id) throws Exception;

	Employee createEmployee(Employee employee)throws Exception;

}
