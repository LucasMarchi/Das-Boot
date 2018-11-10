package com.boot.dasboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipwreck {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	String name;
	String description;
	String condition;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer yearDiscovered;

}
