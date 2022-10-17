package hibernate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prueba")
public class prueba {
	@Id
	private int id;
	@Column(name="nombre")
	private String nombre;
	
	//constructor
	public prueba(String nombre, int id) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public prueba() {
		super();
		this.id = -1;
		this.nombre = null;
	}
	
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		prueba other = (prueba) obj;
		return id == other.id;
	}
	
	
}
