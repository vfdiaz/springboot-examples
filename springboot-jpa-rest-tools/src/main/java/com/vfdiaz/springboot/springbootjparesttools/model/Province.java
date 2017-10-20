package com.vfdiaz.springboot.springbootjparesttools.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String capital;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private List<Town> towns;

	public Province() {
	}
	
	public Province(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

}
