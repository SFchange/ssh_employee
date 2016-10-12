package com.bianfeng.employee.service.impl;

import com.bianfeng.employee.dao.EmployeeDao;
import com.bianfeng.employee.domain.Employee;
import com.bianfeng.employee.service.EmployeeService;

/**
 * 员工管理的业务层的实现类
 * 
 * @author sf
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
	/**
	 * 注入DAO层的类
	 */
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * 业务层登录方法
	 */
	@Override
	public Employee login(Employee employee) {
		Employee existEmployee=employeeDao.findByUsernameAndPassword(employee);
		return existEmployee;
	}

}
