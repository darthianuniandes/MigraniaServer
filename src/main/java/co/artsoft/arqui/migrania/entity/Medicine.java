package co.artsoft.arqui.migrania.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity // This tells Hibernate to make a table out of this class
public class Medicine {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "migraine_meds", 
		joinColumns = @JoinColumn(name = "med_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "migraine_id", referencedColumnName = "id"))
	private Set<Migraine> migraine = new HashSet<Migraine>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Migraine> getMigraine() {
		return migraine;
	}

	public void setMigraine(Set<Migraine> migraine) {
		this.migraine = migraine;
	}
	

}
