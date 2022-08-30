package com.vfislk.training.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Plans {

	@Column(length = 20)
	private String planName;
	@Id
	@GeneratedValue(generator = "plan_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "plan_gen",sequenceName = "plan_sequence",initialValue = 1,allocationSize = 1)
	private Integer planId;
	private int age;
	@Column(length = 20)
	private String term;
	@Column(length = 20)
	private double premium;
	private double amount;
	@Column(length = 20)
	private String coverage;
	
	@ManyToMany
	Set<Customer> customers;
	
	@ManyToOne
	Agent agent;

	public Plans() {
		super();
	}

	public Plans(String planName, int age, String term, double premium, double amount, String coverage) {
		super();
		this.planName = planName;
		this.age = age;
		this.term = term;
		this.premium = premium;
		this.amount = amount;
		this.coverage = coverage;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "Plans [planName=" + planName + ", age=" + age + ", term=" + term + ", premium=" + premium + ", amount="
				+ amount + ", coverage=" + coverage + "]";
	}
	
	
	
}
