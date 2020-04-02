package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: department insert ====");
		department = new Department(null, "Marketing");
		departmentDao.insert(department);
		System.out.println(department);
		
		System.out.println("\n=== TEST 4: department update ====");
		department = departmentDao.findById(8);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: department deleteById ====");
		departmentDao.deleteById(9);
		System.out.println("Delete completed");
		
	}

}
