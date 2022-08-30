package com.vfislk.training.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Nominee {

	@Column(length = 20)
	private String nomineeName;
	@Id
	@GeneratedValue(generator = "nominee_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "nominee_gen",sequenceName = "nominee_sequence",initialValue = 1,allocationSize = 1)
	private Integer nomineeId;
	@Min(21)
	@Max(60)
	private int age;
	@Min(10)
	@Max(12)
	private long number;
	@Column(length = 20)
	private String  relationship;
	
	@OneToOne
	@JoinColumn(name= "customer_id")
	Customer customer;

	public Nominee() {
		super();
	}

	public Nominee(String nomineeName, int age, long number, String relationship) {
		super();
		this.nomineeName = nomineeName;
		this.age = age;
		this.number = number;
		this.relationship = relationship;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public Integer getNomineeId() {
		return nomineeId;
	}

	public void setNomineeId(Integer nomineeId) {
		this.nomineeId = nomineeId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Nominee [nomineeName=" + nomineeName + ", age=" + age + ", number=" + number + ", relationship="
				+ relationship + "]";
	}
	
	
	
	
}
