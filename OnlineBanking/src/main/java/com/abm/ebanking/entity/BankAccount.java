package com.abm.ebanking.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_bankaccount")
public class BankAccount {
	
	@Id
	@GeneratedValue 
	@Column(name ="acc_no")
	private long accountNo;
	
	@Column(name ="title")
	private String title;
	
	@Column(name ="first_name")
	private String first_Name;
	
	@Column(name ="middle_name")
	private String middleName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="father_name")
	private String fatherName;
	
	@Column(name ="mob_no")
	private long mob_No;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="aadhar")
	private long aadhar;
	
	@Column(name ="dob")
	private LocalDate dob;
	
	@Column(name ="present_add")
	private long present_Add;
	
	@Column(name ="permanent_add")
	private long permanent_Add;
	
	@Column(name ="occup_type")
	private String occupation_Type;
	
	@Column(name ="source_inc")
	private String source_Income;
	
	@Column(name ="gross_inc")
	private String gross_Income;
	
	@Column(name ="debit_card")
	private boolean debit_Card;
	
	@Column(name ="opt_nb")
	private boolean opt_Netbanking;
	
}
