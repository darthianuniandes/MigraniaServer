package co.artsoft.arqui.migrania.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // This tells Hibernate to make a table out of this class
public class Migraine {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date date;
	private int painLevel;
	private String audioFile;	
    private String sleepPattern;
    
    @ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name = "migraine_foods",
		joinColumns = @JoinColumn(name = "migraine_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "food_id", referencedColumnName = "id"))
	private Set<Food> foods = new HashSet<Food>();

	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPainLevel() {
		return painLevel;
	}

	public void setPainLevel(int painLevel) {
		this.painLevel = painLevel;
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	public String getSleepPattern() {
		return sleepPattern;
	}

	public void setSleepPattern(String sleepPattern) {
		this.sleepPattern = sleepPattern;
	}
}
