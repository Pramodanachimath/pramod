package com.vfislk.training.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Customer {

	@Column(length = 20)
	private String firstName;
	private String lastName;
	@Id
	@GeneratedValue(generator = "customer_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "customer_gen",sequenceName = "customer_sequence",initialValue = 1,allocationSize = 1)
	private Integer customerId;
	@Column(length = 20)
	private String dateOfBirth;
	@Column(length = 20)
	private String email;
	@Min(10)
	@Max(12)
	private long phoneNumber;	
	@Min(21)
	@Max(60)
	private int age;
	@Column(length = 20)
	private String occupation;
	
	@ManyToOne
	Agent agent;
	
	@ManyToMany
	Set<Plans> plan;
	
	@OneToMany
	Set<Nominee> nominees;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String dateOfBirth, String email, long phoneNumber, int age,
			String occupation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.occupation = occupation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Agent getAgents() {
		return agent;
	}

	public void setAgents(Agent agents) {
		this.agent = agents;
	}

	public Set<Plans> getPlans() {
		return plan;
	}

	public void setPlans(Set<Plans> plans) {
		this.plan = plans;
	}

	public Set<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(Set<Nominee> nominees) {
		this.nominees = nominees;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", age=" + age + ", occupation=" + occupation
				+ "]";
	}
	
	
	
}
