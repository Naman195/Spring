package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Student stdId1() 
	{
		Student std = new Student();
		std.setName("Aditya");
		std.setRollno(22);
//		std.setAddress();
		
		return std;
	}

}
