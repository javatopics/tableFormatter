import java.util.ArrayList;
import java.util.List;
import model.Student;
import ui.TableFormatter;

public class TableDemo {

	private static final String[] TABLE_HEADER={"ID","Name","Gender","Phone Number","School"};
	
	public static void main(String[] args) {
		//add table to list
		List<Student> studentList=new ArrayList<>();
		Student.setSchoolName("KSHRD");
		for(int i=0;i<15;i++){
			studentList.add(new Student(i,"Kok Data","male","012 89 89 77"));
		}
		// call table display and add data to table
		TableFormatter.tableDisplay(TABLE_HEADER,studentList);
	}
}
