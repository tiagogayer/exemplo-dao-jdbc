package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("=== TEST 2: department findAll ====");
		System.out.println("=== TEST 3: department insert ====");
		System.out.println("=== TEST 4: department update ====");
		System.out.println("=== TEST 5: department deleteById ====");
		
	}

}
