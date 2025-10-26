//idhi (6)

package com.chandu.spring.springhibernate.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.spring.springhibernate.entities.Employee;

@Component //automatic ga configuration chesukuntadhi
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional (readOnly = false)
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(employee);
	}
	@Transactional (readOnly = false)
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
	}
	@Transactional (readOnly = false)
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Employee emp = hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Employee.class);
	}

}
