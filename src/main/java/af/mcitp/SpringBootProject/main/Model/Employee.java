package af.mcitp.SpringBootProject.main.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Table
@Entity
@Setter
@Getter
public class Employee {
	 @Id
	   @Column
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long ID;
	   @Column
		private String name;
	   @Column
		private String lastName;
	   @Column
		private String fatherName;
	   @Column
		private String phone;
}