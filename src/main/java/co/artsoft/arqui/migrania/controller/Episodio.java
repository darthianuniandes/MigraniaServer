package co.artsoft.arqui.migrania.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Episodio {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String patronSuenio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatronSuenio() {
		return patronSuenio;
	}

	public void setPatronSuenio(String patronSuenio) {
		this.patronSuenio = patronSuenio;
	}
}
