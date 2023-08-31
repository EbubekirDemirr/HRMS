package JavaHRMS.JavaHRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaHRMS.JavaHRMS.business.abstracts.JobTitleService;
import JavaHRMS.JavaHRMS.dataaccess.abstracts.JobTitleDao;
import JavaHRMS.JavaHRMS.entities.concrete.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll();
	}

}
