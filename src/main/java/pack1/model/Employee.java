package pack1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable
{
  @Id
  @Column(name="empid")
  private Integer empId;
  
  @Column(name="empname", length=10)
  private String empName;
  
  @Column(name="empage")
  private Integer empAge;
  
  @Column(name="empaddress",length=10)
  private String empAddress;
  
  @Column(name="salary")
  private Long salary;

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Integer getEmpAge() {
	return empAge;
}

public void setEmpAge(Integer empAge) {
	this.empAge = empAge;
}

public String getEmpAddress() {
	return empAddress;
}

public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}

public Long getSalary() {
	return salary;
}

public void setSalary(Long salary) {
	this.salary = salary;
}
  
  
  
  
		

}
