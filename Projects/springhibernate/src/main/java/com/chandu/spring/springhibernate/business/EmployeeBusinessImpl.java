//idhi (4)

package com.chandu.spring.springhibernate.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chandu.spring.springhibernate.dao.EmployeeDao;
import com.chandu.spring.springhibernate.entities.Employee;

@Component  //automatic ga configuration chesukuntadhi
public class EmployeeBusinessImpl implements EmployeeBusiness {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update(employee);
	}

	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.delete(employee);
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

}
