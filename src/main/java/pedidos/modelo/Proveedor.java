package pedidos.modelo;

import java.util.LinkedList;
import java.util.*;
import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Proveedor {

	@Id
	private Long id;
	private String nombre;
	private int cuil;
	private String direccion;
	private Integer coordenadaX;
	private Integer coordenadaY;
	private LinkedList<Producto> productos;

	public Proveedor() {
		LinkedList<Producto> productos = new LinkedList();
	}

	// CONSTRUCTOR PUBLICO
	public Proveedor(Long unId, String unNombre, int unCuil, String unaDireccion, Integer unaCoordenadaX, Integer unaCoordenadaY) {

		id = unId;
		nombre = unNombre;
		cuil = unCuil;
		direccion = unaDireccion;
		coordenadaX = unaCoordenadaX;
		coordenadaY = unaCoordenadaY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombreP(String unNombre) {
		nombre = unNombre;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int unCuil) {
		cuil = unCuil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String unaDireccion) {
		direccion = unaDireccion;
	}

	public Integer getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(Integer unaCoordenadaX) {
		coordenadaX = unaCoordenadaX;
	}

	public Integer getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(Integer unaCoordenadaY) {
		coordenadaY = unaCoordenadaY;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long unId) {
		this.id = unId;
	}
	
	public LinkedList<Producto> getProductosY() {
		return productos;
	}


}
