package JavaHRMS.JavaHRMS.entities.concrete;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="job_titles")


public class JobTitle {
	
	
	@Column(name="id")
	@Id
	@GeneratedValue
	private int id;
	
	
	@Column(name="title")
	private String title;
	
	public JobTitle() {}


	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}
