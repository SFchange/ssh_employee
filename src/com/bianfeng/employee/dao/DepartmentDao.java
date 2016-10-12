package com.bianfeng.employee.dao;

import java.util.List;

import com.bianfeng.employee.domain.Department;


/**
 * 部门管理的DAO的接口
 * 
 * @author sf
 *
 */
public interface DepartmentDao {

	int findCount();

	List<Department> findByPage(int begin, int pageSize);



}
