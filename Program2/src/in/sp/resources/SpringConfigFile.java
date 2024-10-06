package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student stdId1() {
		
		Student std = new Student();
		std.setName("Naman");
		std.setRollno(20);
		std.setEmail("Naman@g.com");
		
		return std;		
	}
	
	@Bean("stdId2")
	public Student stdId() 
	{
		Student std = new Student();
		std.setName("Vansh");
		std.setRollno(123);
		std.setEmail("Vansh@g.com");
		return std;
	}

}
