package com.bianfeng.employee.dao;

import com.bianfeng.employee.domain.Employee;

/**
 * 员工管理的DAO的接口
 * 
 * @author sf
 *
 */
public interface EmployeeDao {

	Employee findByUsernameAndPassword(Employee employee);

}
