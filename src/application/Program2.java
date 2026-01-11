package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ====");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: findAll ====");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		for(Department d: list) {
			System.out.println(d);
		}
		
		System.out.println("=== TEST 3: insert ====");
		//depDao.insert(new Department(null,"Maquina"));
		
		System.out.println("=== TEST 4: delete ====");
			depDao.deleteById(7); //lança exceção
		
		System.out.println("=== TEST 4: update ====");
		dep = depDao.findById(1);
		dep.setName("Bikes");
		depDao.update(dep);
	}

}
