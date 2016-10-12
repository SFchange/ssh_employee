package com.bianfeng.employee.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bianfeng.employee.dao.EmployeeDao;
import com.bianfeng.employee.domain.Employee;

/**
 * 员工管理DAO实现类
 * 
 * @author sf
 *
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
	/**
	 * 根据用户名和密码查询用户信息
	 */
	@Override
	public Employee findByUsernameAndPassword(Employee employee) {
		String hql = "from Employee where username=? and password=?";
		List<Employee> list = this.getHibernateTemplate().find(hql,
				employee.getUsername(), employee.getPassword());
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

}
