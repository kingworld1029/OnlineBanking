package com.abm.ebanking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_beneficiary")
public class Beneficiary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "beneficiary_id")
	private long id;

	@Column(name = "from_account")
	private long from_acc;

	@Column(name = "name")
	private String name;

	@Column(name = "to_account")
	private long to_acc;

	@Column(name = "nick_name")
	private String nick_name;

}
