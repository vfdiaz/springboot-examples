package com.vfdiaz.springboot.springbootjparest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String capital;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private List<Town> towns;

}
