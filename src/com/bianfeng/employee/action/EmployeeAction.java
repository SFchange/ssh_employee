package com.bianfeng.employee.action;

import com.bianfeng.employee.domain.Employee;
import com.bianfeng.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.recompile;

/**
 * 员工管理Action类
 * 
 * @author sf
 *
 */
public class EmployeeAction extends ActionSupport implements
		ModelDriven<Employee> {
	// 模型驱动使用的对象（实例化）
	private Employee employee = new Employee();

	@Override
	public Employee getModel() {
		return employee;
	}

	/**
	 * 注入service的类
	 */
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * 登录执行的方法
	 * 
	 * @return
	 */
	public String login() {
		Employee existEmployee = employeeService.login(employee);
		if (existEmployee == null) {
			// 登录失败
			this.addActionError("用户名或密码错误！");
			return INPUT;
		} else {
			// 登录成功
			ActionContext.getContext().getSession()
					.put("existEmployee", existEmployee);
			return SUCCESS;
		}
	}
}
