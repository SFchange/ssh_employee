package com.bianfeng.employee.action;

import com.bianfeng.employee.domain.Department;
import com.bianfeng.employee.domain.PageBean;
import com.bianfeng.employee.service.DepartmentService;
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
	private Department department=new Department();

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
		PageBean<Department> pageBean = departmentService.findAll(currPage);
		// 将pageBean存入值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	/**
	 * 跳转添加部门添加界面
	 */
	public String saveUI() {
		return "saveUI";
	}

	/**
	 * 添加部门的方法
	 */
	public String saveDep() {
		departmentService.save(department);
		return "saveSuccess";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
