
public class MVCPatternDemo {
	//fetch student record based on his ID from the database
	private static Student retrieveStudentFromDB() {
		Student student = new Student();
		//assume we retrieve a student record like ("Jack", "001")
		student.setName("Jack");
		student.setId("001");
		return student;
	}
	public static void main(String[] args) {
		Student model = retrieveStudentFromDB();
		
		//Create a view: to write student details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		//update model data
		controller.setStudentName("Tom");
		controller.setStudentId("002");
		
		controller.updateView();
	}
}
