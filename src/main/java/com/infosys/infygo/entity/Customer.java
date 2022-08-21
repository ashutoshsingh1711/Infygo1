package com.infosys.infygo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class Customer {
	@Id
	private String userId;

	private String password;

	private String name;

	private String city;

	private String email;

	private String phone;

	public Customer(Customer user) {
		this.userId = user.userId;
		this.name = user.name;
		this.city = user.city;
		this.email = user.email;
		this.password = user.password;
		this.phone = user.phone;
	}

	public Customer() {
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", password=" + password + ", name=" + name + ", city=" + city
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "UserTicket",
	joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userId"),
	inverseJoinColumns = @JoinColumn(name="ticket_pnr", referencedColumnName = "pnr"))
	private List<Ticket> list;

}
