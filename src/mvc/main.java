package mvc;

public class main {
	public static void main(String[] args) {

		Student model = retriveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(view, model);

		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		return student;
	}
}
