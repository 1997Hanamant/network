package com.xworkz.nirmala.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class ParentNirmalaEntity {
	
	@NotNull
	@Column(name="createdBy")
	private String createdBy;
	@PastOrPresent
	@Column(name="ceratedDate")
	private LocalDate ceratedDate;
	@NotNull
	@Column(name="updatedBy")
	private String updatedBy;
	@PastOrPresent
	@Column(name="updatedDate")
	private LocalDate updatedDate;
	
	

}
