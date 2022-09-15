package com.xworkz.nirmala.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "nirmala_details")
@ToString(callSuper = true)

public class NirmalaEntity extends ParentNirmalaEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Min(value = 1)
	@Column(name="id")
	private Integer id;
	@NotNull
	@Column(name="location")
	private String location;
	@NotNull
	@Column(name="gender")
	private String gender;
	@NotNull
	@Column(name="type")
	private String type;
	@NotNull
	@Column(name="cost")
	private Double cost;

	public NirmalaEntity(String location, String gender, String type, Double cost, String createdBy,
			LocalDate ceratedDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, ceratedDate, updatedBy, updatedDate);
		// this.id = id;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
	}

}
