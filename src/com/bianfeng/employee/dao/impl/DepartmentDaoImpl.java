package com.bianfeng.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bianfeng.employee.dao.DepartmentDao;
import com.bianfeng.employee.domain.Department;
import com.opensymphony.xwork2.ActionContext;

/**
 * 部门管理的DAO的实现类
 * 
 * @author sf
 *
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements
		DepartmentDao {
	/**
	 * 查询总记录数
	 */
	@Override
	public int findCount() {
		String hql = "select count(*) from Department";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	/**
	 * 分页查询部门信息
	 */
	@Override
	public List<Department> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
		List<Department> list=this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

}
