package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\"=== TEST 1: Department findById ===\"");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println();
		System.out.println("\"=== TEST 2: Department findAll ===\"");
		List<Department> list = departmentDao.findAll();

		for (Department x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("\"=== TEST 3: Department insert ===\"");
		departmentDao.insert(new Department(10, "igreja"));
		System.out.println("Insert sucess");
		
		System.out.println();
		System.out.println("\" ==== TEST 4: Department UPdate ===\"");
		dep = departmentDao.findById(7);
		dep.setName("Templo");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("\" ==== TEST 5: Department Delete ====\"");
		departmentDao.deleteById(8);
		System.out.println("Delete completed");
		
		
		sc.close();
	}

}
