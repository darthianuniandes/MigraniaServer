package co.artsoft.arqui.migrania.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MigraniaViewModel {
	
	  	private Integer id;
		private int painLevel;
		private String audioFile;	
	    private String sleepPattern;
	    private Set<FoodViewModel> foods = new HashSet<FoodViewModel>();
	    	        	    
	    public Integer getId() {
			return id;
		}

		public Set<FoodViewModel> getFoods() {
			return foods;
		}

		public void setFoods(Set<FoodViewModel> foods) {
			this.foods = foods;
		}

		public void setId(Integer id) {
			this.id = id;
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
