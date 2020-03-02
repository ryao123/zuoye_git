package service;

import java.util.List;

import dao.StudentDao;
import entity.student;

public class StuService {

	StudentDao sd=new StudentDao();
	
	public List<student> getShow() {
		
		List<student> stu=sd.getShow();
		if(stu!=null) {
			return stu;
		}else {
			return null;
		}
		
	}

}
