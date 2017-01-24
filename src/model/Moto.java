package src.model;

import java.time.LocalDate;

public class Moto {
	
	//Attributs
	private int id;
	
	//Methodes
	public String model;
	public LocalDate DateConstruction;
	public String picture;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	public LocalDate getDateConstruction() {
		return DateConstruction;
	}

	public void setDateConstruction(LocalDate DateConstruction) {
		this.DateConstruction = DateConstruction;
	}
	
	
	
	public String getPicture() {
		return picture;
	}

	public void setNom(String picture) {
		this.picture = picture;
	}

}
