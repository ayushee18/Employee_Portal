package com.ayushee.employeeportal.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name="EMPLOYEE")
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeDTO implements Serializable{
	
	@Id
	@Column(name="EMPLOYEEID")
	@JsonProperty("employeeId")
	@GeneratedValue
	private long employeeId;
	
	@Column(name="FIRSTNAME")
	@JsonProperty("firstname")
	private String firstname;
	
	@Column(name="LASTNAME")
	@JsonProperty("lastname")
	private String lastname;
	
	@Column(name="GENDER")
	@JsonProperty("gender")
	private String gender;
	
	@Column(name="DOB")
	@JsonProperty("DOB")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date DOB;
	
	@Column(name="DEPARTMENT")
	@JsonProperty("department")
	private String department;	
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", DOB=" + DOB + ", Department=" + department + "]";
	}
	
	
}
