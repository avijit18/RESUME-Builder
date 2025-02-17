package ai.createResume.Backend;

import ai.createResume.Backend.Services.ResumeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class CreateResumeApplicationTests {

	@Autowired
	private ResumeService resumeService;

	@Test
	void contextLoads() throws IOException {
		resumeService.generateResumeResponse("I am Avijit Patra with 3 years of experience in spring boot and servicenow.");
	}

}
