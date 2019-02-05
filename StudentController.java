package test.mvc;

public class StudentController {

	Student student = new Student();
	StudentView studentView = new StudentView();

	public void setStudentName(String name) {
		student.setName(name);

	}

	public String getStudentName() {

		return student.getName();
	}

	public void setStudentRollNo(String no) {
		student.setRollno(no);

	}

	public String getStudentRollNo() {
		return student.getRollno();
	}

	public void updateView() {
		studentView.printStudentDetails(student);
	}
}
