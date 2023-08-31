package JavaHRMS.JavaHRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaHRMS.JavaHRMS.entities.concrete.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
