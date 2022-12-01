package com.abm.ebanking.entity;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_address")
public class AddressDetail {
	
	@Id
	@GeneratedValue 
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private long addressId;
	
	@Column(name ="address_1")
	private String address1;
	
	@Column(name ="address_2")
	private String address2;
	
	@Column(name ="landmark")
	private String landmark;
	
	@Column(name ="city")
	private String city;
	
	@Column(name ="state")
	private String state;
	
	@Column(name ="pincode")
	private long pincode;
	
}
