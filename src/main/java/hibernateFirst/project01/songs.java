package hibernateFirst.project01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class songs {

	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name= "songName")
	private String name;
	@Column(name= "songsArtis")
	private String artils;
	
	
	
	public songs(int id, String name, String artils) {
		super();
		this.id = id;
		this.name = name;
		this.artils = artils;
	}
	public songs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtils() {
		return artils;
	}
	public void setArtils(String artils) {
		this.artils = artils;
	}
	@Override
	public String toString() {
		return "songs [id=" + id + ", name=" + name + ", artils=" + artils + "]";
	}
	
	
	
}
