package Hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="job_positions")
public class JobPosition {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")	
private int id;

@Column(name="job_positions_name")
private String name;

public JobPosition() {
	
}
public JobPosition(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
} 
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
