package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setIdentityNumber("1234");
		student.setName("Hüseyin");
		student.setStudentNumber("456");

		
		Instructor instructor = new Instructor();
		instructor.setIdentityNumber("1111");
		instructor.setName("Engin");
		instructor.setSalary(3000);
		
		InstructorManager instructorManager = new InstructorManager(instructor);
		instructorManager.register();
		StudentManager studentManager = new StudentManager(student);
		studentManager.register();
		

	}

}
