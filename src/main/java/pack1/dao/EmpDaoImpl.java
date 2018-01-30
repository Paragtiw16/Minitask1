package pack1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pack1.model.Employee;

@Repository("dao")
public class EmpDaoImpl implements EmpDao
{
 @Autowired
 HibernateTemplate ht;
 
 public void addEmployee(Employee employee)
 {
	 ht.saveOrUpdate(employee);
 }
 
 public List<Employee> listEmployeess()
 {
	 List<Employee> list=ht.loadAll(Employee.class);
	 return list;
 }
 public void deleteEmployee(Employee employee)
 {
	 ht.delete(employee);
 }


}
