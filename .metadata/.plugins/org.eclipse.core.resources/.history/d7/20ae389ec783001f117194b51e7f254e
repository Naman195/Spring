package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddObj() 
	{
		Address adr = new Address(254, "KailashStreet", 246731);
		
		return adr;
		
	}
	
	@Bean
	public Student createStdObj() 
	{
		Student std = new Student("Rahul", 25, createAddObj());
		return std;
	}

}
