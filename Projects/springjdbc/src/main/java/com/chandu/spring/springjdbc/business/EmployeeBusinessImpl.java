package com.chandu.spring.springjdbc.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chandu.spring.springjdbc.dao.Employeedao;
import com.chandu.spring.springjdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	@Autowired
	private Employeedao employeedao;
	
	

	public Employeedao getEmployeedao() {
		return employeedao;
	}



	public void setEmployeedao(Employeedao employeedao) {
		this.employeedao = employeedao;
	}



	public void printEmployeeHikes() {
		
		//ask dao for employee data
		   List<Employee> employees = employeedao.findAllEmployees();
		
		//check each employee and print hike
		if(employees!=null)
		{
			for(Employee employee : employees)
			{
				if(employee.getExp()>15)
				{
					System.out.println("Employee  id is "+employee.getId()+" and name is "+employee.getName()+" with expireance "+employee.getExp()+" got 30% hike ");
				}
				else if(employee.getExp()>10)
				{
					System.out.println("Employee  id is "+employee.getId()+" and name is "+employee.getName()+" with expireance "+employee.getExp()+" got 25% hike ");
				}
				else if(employee.getExp()>5)
				{
					System.out.println("Employee  id is "+employee.getId()+" and name  is "+employee.getName()+" with expireance "+employee.getExp()+" got 20% hike ");
				}
				else
				{
					System.out.println("Employee  id is  "+employee.getId()+" and name  is "+employee.getName()+" with expireance "+employee.getExp()+" got 15% hike ");
				}
			}
		}

	}



	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeedao.insertEmployee(employee);
		
	}

}
