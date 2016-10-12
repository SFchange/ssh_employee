package com.bianfeng.employee.service.impl;

import com.bianfeng.employee.dao.DepartmentDao;
import com.bianfeng.employee.dao.EmployeeDao;
import com.bianfeng.employee.service.DepartmentService;

/**
 * 部门管理 业务层实现类
 * 
 * @author sf
 *
 */
public class DepartmentServiceImpl implements DepartmentService {
	/**
	 * 注入DAO层的类
	 */
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
}
