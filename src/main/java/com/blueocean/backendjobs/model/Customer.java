package com.blueocean.backendjobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Column(name="title")
    private String title;
}
