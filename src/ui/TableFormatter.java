package ui;

import static java.lang.System.out;

import java.util.List;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.CellStyle.HorizontalAlign;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import model.Student;

public class TableFormatter {

	public static void tableDisplay(String[] tableHeader,List<Student> data){
		CellStyle cellStyle=new CellStyle(HorizontalAlign.center);
		Table table=new Table(tableHeader.length,BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.ALL);
	
		for(int i=0;i<tableHeader.length;i++){
			table.setColumnWidth(i, 10, 16);
			table.addCell(tableHeader[i],cellStyle);
		}
		
		for(Student stu:data){
			table.addCell(stu.getId()+"",cellStyle);
			table.addCell(stu.getName(),cellStyle);
			table.addCell(stu.getGender(),cellStyle);
			table.addCell(stu.getPhoneNumber(),cellStyle);
			table.addCell(Student.getSchoolName(),cellStyle);
		}
		
		out.println(table.render());
	
	}
}
