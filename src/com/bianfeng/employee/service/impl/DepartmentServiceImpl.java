package com.bianfeng.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bianfeng.employee.dao.DepartmentDao;
import com.bianfeng.employee.dao.EmployeeDao;
import com.bianfeng.employee.domain.Department;
import com.bianfeng.employee.domain.PageBean;
import com.bianfeng.employee.service.DepartmentService;

/**
 * 部门管理 业务层实现类
 * 
 * @author sf
 *
 */
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	/**
	 * 注入DAO层的类
	 */
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	/**
	 * 分页查询部分的方法
	 */
	@Override
	public PageBean<Department> findAll(Integer currPage) {
		PageBean<Department> pageBean = new PageBean<Department>();
		// 封装当前页数
		pageBean.setCurrPage(currPage);
		// 封装每页显示记录数
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		// 分装总记录数
		int totalCount = departmentDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数
		double tc = totalCount;
		// Math.ceil(tc/pageSize) 向上取整
		Double num = Math.ceil(tc / pageSize);
		// num.intValue() 转化为整型
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示的数据
		int begin=(currPage-1)*pageSize;
		List<Department> list=departmentDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	/**
	 * 业务层保存部门的方法
	 */
	@Override
	public void save(Department department) {
		departmentDao.save(department);
	}
}
