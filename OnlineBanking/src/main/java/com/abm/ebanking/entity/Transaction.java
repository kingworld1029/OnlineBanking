package com.abm.ebanking.entity;


	

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private long id;
	
	@Column(name="from_account")
	private long from_acc;
	
	
	@Column(name="to_account")
	private long to_acc;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="transaction_date")
	private LocalDate trans_date;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="mode")
	private String mode;

}



