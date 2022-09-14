package com.xworkz.metro.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="metro_info")
public class MetroEntity implements Serializable {
	
	@Id
	private Integer id;
	private String name;
	private String location;
	private Double price;
	private String source;
	private String destination;

}
