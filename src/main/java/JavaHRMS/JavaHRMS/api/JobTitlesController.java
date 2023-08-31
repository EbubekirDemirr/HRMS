package JavaHRMS.JavaHRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaHRMS.JavaHRMS.business.abstracts.JobTitleService;
import JavaHRMS.JavaHRMS.entities.concrete.JobTitle;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {

	@Autowired
	private JobTitleService jobTitleService; 
	
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getAll")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
	}
	
}
