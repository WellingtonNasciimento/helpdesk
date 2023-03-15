package com.wdsystems.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

	private List<Order> orders = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(Integer id, String name, String cpf, String email, String password) {
		super(id, name, cpf, email, password);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
