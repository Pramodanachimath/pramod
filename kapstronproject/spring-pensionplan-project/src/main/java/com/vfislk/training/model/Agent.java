package com.vfislk.training.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Agent {

	@Column(name = "agentname",length = 20)
	private String agentName;
	@Id
	@GeneratedValue(generator = "agent_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "agent_gen",sequenceName = "agent_sequence",initialValue = 1,allocationSize = 1)
	private Integer agentId;
	@Column(length = 20)
	private String state;
	@Min(10)
	@Max(12)
	private long phoneNumber;
	
	@OneToMany
	Customer customer;
	
	@OneToMany
	Plans plan;

	public Agent() {
		super();
	}

	public Agent(String agentName, String state, long phoneNumber) {
		super();
		this.agentName = agentName;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Plans getPlans() {
		return plan;
	}

	public void setPlans(Plans plans) {
		this.plan = plans;
	}

	@Override
	public String toString() {
		return "Agent [agentName=" + agentName + ", state=" + state + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
