package com.hcl.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PET")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long ID;
	@Column(name = "PET_NAME")
	private String PET_NAME;
	@Column(name = "PET_AGE")
	private int PET_AGE;
	@Column(name = "PET_PLACE")
	private String place;
	@ManyToOne
	@JoinColumn(name = "PET_OWNERID")
	private User owner;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getPET_NAME() {
		return PET_NAME;
	}

	public void setPET_NAME(String pET_NAME) {
		PET_NAME = pET_NAME;
	}

	public int getPET_AGE() {
		return PET_AGE;
	}

	public void setPET_AGE(int pET_AGE) {
		PET_AGE = pET_AGE;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
