package mvc;

public class StudentController {

	private StudentView studentView;
	private Student studentModel;

	public StudentController(StudentView studentView, Student studentModel) {
		this.studentView = studentView;
		this.studentModel = studentModel;
	}

	public void updateView() {
		studentView.printStudent(this.studentModel);
	}

}
