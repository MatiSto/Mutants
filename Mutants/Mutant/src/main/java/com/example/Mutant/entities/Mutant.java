package com.example.Mutant.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Mutante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Mutant extends Base {
	
	@Column(name="dna")
	
	private String[] dna;
	
}
