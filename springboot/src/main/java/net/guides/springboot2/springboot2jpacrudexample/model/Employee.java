package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String departmentId;
	private String SupervisorId;
	private Double Salary;
	private String Position;
	private String Status;
	private String Address;
	private Double Contact;
	private String nic;
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId,String departmentId,String SupervisorId,Double Salary,String Position,String Status,String Address,Double Contact,String nic) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.departmentId = departmentId;
		this.SupervisorId = SupervisorId;
		this.Salary = Salary;
		this.Position = Position;
		this.Status = Status;
		this.Address = Address;
		this.Contact = Contact;
		this.nic = nic;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getSupervisorId() {
		return SupervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		SupervisorId = supervisorId;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Double getContact() {
		return Contact;
	}

	public void setContact(Double contact) {
		Contact = contact;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +", emailId=" + emailId +
				", departmentId=" + departmentId +", SupervisorId=" + SupervisorId +", Salary=" + Salary +
				", Position=" + Position +", Status=" + Status +", Address=" + Address +
				", Contact=" + Contact +", nic=" + nic + "]";
	}
	
}
