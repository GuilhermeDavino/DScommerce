package com.devsuperior.dscommerce.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_payment")
public class Payment {
	private Instant moment;
	@OneToOne
	@MapsId
	private Order order;
	
	public Payment() {
		
	}

	public Payment(Instant moment, Order order) {
		this.moment = moment;
		this.order = order;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
