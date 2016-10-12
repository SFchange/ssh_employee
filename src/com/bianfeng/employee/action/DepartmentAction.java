package com.bianfeng.employee.action;

import java.util.List;

import com.bianfeng.employee.domain.Department;
import com.bianfeng.employee.domain.PageBean;
import com.bianfeng.employee.service.DepartmentService;
import com.bianfeng.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 部门管理Action类
 * 
 * @author sf
 *
 */
public class DepartmentAction extends ActionSupport implements
		ModelDriven<Department> {
	private Department department;

	@Override
	public Department getModel() {
		return department;
	}

	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	/**
	 * 注入service的类
	 */
	private DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * 查询部门信息
	 * 
	 * @return
	 */
	public String findAll() {
		PageBean<Department> pageBean=departmentService.findAll(currPage);
		// 将pageBean存入值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
}
