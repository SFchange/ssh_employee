package com.bianfeng.employee.service;

import com.bianfeng.employee.domain.Department;
import com.bianfeng.employee.domain.PageBean;

/**
 * 部门管理 业务层接口
 * 
 * @author sf
 *
 */
public interface DepartmentService {

	PageBean<Department> findAll(Integer currPage);


}
