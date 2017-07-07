package package2;

// import package1
import package1.Student;

    	// class extends the class Student
	public class School extends Student{
		
		public static void main(String[]args){
			School sc = new School();
			// calling protected method
			sc.display();
		}
	}