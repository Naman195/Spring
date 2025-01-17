package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address addr() 
	{
		Address adr = new Address();
		adr.setHouseno(83);
		adr.setStreetname("Post Colony");
		adr.setPincode(246731);
		return adr;
		
	}
	
	@Bean
	public Subjects addSubj() {
		Subjects subs = new Subjects();
		List<String> subsList = new ArrayList<String>();
		subsList.add("Python");
		subsList.add("C++");
		subsList.add("Java");
		subs.setSubjects(subsList);
		return subs;
	}
	
	@Bean
	public Student stdId1() 
	{
		Student std = new Student();
		std.setName("Aditya");
		std.setRollno(22);
//		std.setAddress(addr());  # Manually DI
//		std.setSubjects(addSubj()); manually DI
		
		return std;
	}

}
