package in.sp.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Subjects {
	
	
	private List<String> subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subjects.toString();
	}
}