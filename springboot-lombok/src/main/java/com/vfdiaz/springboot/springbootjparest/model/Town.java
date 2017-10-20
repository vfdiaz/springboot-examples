package com.vfdiaz.springboot.springbootjparest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude="province")
public class Town {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	private String zipCode;

	@ManyToOne
	private Province province;

}
