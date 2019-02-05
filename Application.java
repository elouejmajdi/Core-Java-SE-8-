package test;

import test.dataaccessobjectDAO.Book;
import test.dataaccessobjectDAO.BookDAO;
import test.dataaccessobjectDAO.BookDAOImpl;
import test.factorypattern.Shape;
import test.factorypattern.ShapeFactory;
import test.frontcontroller.FrontController;
import test.mvc.StudentController;
import test.prototype_pattern.ShapeCache;
import test.singleton.Singleton;
import test.transfer_object_pattern.StudentBO;
import test.transfer_object_pattern.StudentVO;

public class Application {

	public static void main(String[] args) {

//		Singleton instance = new Singleton();
//		System.out.println(instance.getObjectState());

//		
//		StudentController controller = new StudentController(); 
//		controller.setStudentName("John");
//		controller.setStudentRollNo("712819284161");
//		controller.updateView();

//		
//		BookDAO bookDao = new BookDAOImpl();
//
//		for (Book book : bookDao.getAllBooks()) {
//			System.out.println("Book ISBN : " + book.getISBN() + " and the Book's name :" + book.getName());
//
//		}
//
//		// update student
//		Book book = bookDao.getAllBooks().get(1);
//		book.setName("Algorithms");
//		bookDao.saveBook(book);
//
//		ShapeFactory shapeFactory = new ShapeFactory();
//
//		// get an object of Circle and call its draw method.
//		Shape shape1 = shapeFactory.getShape("Circle");
//
//		// call draw method of Circle
//		shape1.draw();
//
//		// get an object of Rectangle and call its draw method.
//		Shape shape2 = shapeFactory.getShape("Rectangle");
//
//		// call draw method of Rectangle
//		shape2.draw();
//
//		// get an object of Square and call its draw method.
//		Shape shape3 = shapeFactory.getShape("Square");
//
//		// call draw method of square
//		shape3.draw();

//		StudentBO studentBusinessObject = new StudentBO();
//
//		// print all students
//		for (StudentVO student : studentBusinessObject.getAllStudents()) {
//			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
//		}
//
//		// update student
//		StudentVO student = studentBusinessObject.getAllStudents().get(0);
//		student.setName("Michael");
//		studentBusinessObject.updateStudent(student);
//
//		// get the student
//		student = studentBusinessObject.getStudent(0);
//		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

//	
//		FrontController frontController = new FrontController();
//	      frontController.dispatchRequest("HOME");
//	      frontController.dispatchRequest("STUDENT");
//	
//		
//		ShapeCache.loadCache();
//
//	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
//	      System.out.println("Shape : " + clonedShape.getType());		
//
//	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
//	      System.out.println("Shape : " + clonedShape2.getType());		
//
//	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
//	      System.out.println("Shape : " + clonedShape3.getType());	

	}
}
