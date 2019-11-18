package com.nagarro.training.entity;

import org.springframework.stereotype.Component;
/**
 * User Entity Class
 * @author mohammadirshad
 *
 */
@Component

public class User {

	@Override
	public String toString() {
		return "User [uniqueId=" + uniqueId + ", custName=" + custName + ", custDob=" + custDob + ", custContact="
				+ custContact + ", custEmail=" + custEmail + ", custIdProof=" + custIdProof + ", custAccountBalance="
				+ custAccountBalance + ", custBlockedAmt=" + custBlockedAmt + "]";
	}

	String uniqueId;
	String custName;
	String custDob;
	String custContact;
	String custEmail;
	String custIdProof;
	int custAccountBalance;
	int custBlockedAmt;

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustDob() {
		return custDob;
	}

	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustIdProof() {
		return custIdProof;
	}

	public void setCustIdProof(String custIdProof) {
		this.custIdProof = custIdProof;
	}

	public int getCustAccountBalance() {
		return custAccountBalance;
	}

	public void setCustAccountBalance(int custAccountBalance) {
		this.custAccountBalance = custAccountBalance;
	}

	public int getCustBlockedAmt() {
		return custBlockedAmt;
	}

	public void setCustBlockedAmt(int custBlockedAmt) {
		this.custBlockedAmt = custBlockedAmt;
	}

}