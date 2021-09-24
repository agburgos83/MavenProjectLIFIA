package pedidos.modelo;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Producto implements Serializable {

	@Id
	@Column(name = "ID_PRODUCTO")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PESO")
	private float peso;
	
	@Column(name = "PRECIO")
	private float precio;
	
//	SI FECHA INICIO Y FECHA FIN SON PARTE DEL HISTORIAL - CREAR NUEVA TABLA DE HISTORIAL
	private LinkedList<Float> historial;
	
	@Column(name = "FECHA_PRECIO_INICIO")
	private Date fechaPrecioInicio;
	
	@Column(name = "FECHA_PRECIO_FINAL")
	private Date fechaPrecioFin;

	public Producto() {
	}

	public Producto(Long unId, String unNombre, float unPeso, float unPrecio, LinkedList<Float> unHistorial,
			Date unaFechaPrecioInicio, Date unaFechaPrecioFin) {
		setId(unId);
		setNombre(unNombre);
		setPeso(unPeso);
		setPrecio(unPrecio);
		setHistorial(unHistorial);
		setFechaPrecioInicio(unaFechaPrecioInicio);
		setFechaPrecioFin(unaFechaPrecioFin);
	}

	// instancia un producto e inicializa el historial
	public static void main(String[] args) {
		Producto producto = new Producto();
		LinkedList<Float> historial = new LinkedList<Float>();
	}

	public void setNombre(String unNombre) {
		nombre = unNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPeso(Float unPeso) {
		peso = unPeso;
	}

	public float getPeso() {
		return peso;
	}

	public void setPrecio(Float unPrecio) {
		precio = unPrecio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setHistorial(LinkedList<Float> unHistorial) {
		historial = unHistorial;
	}

	public void getHistorial() {
		historial.forEach(System.out::println);
	}

	public void setFechaPrecioInicio(Date unaFecha) {
		fechaPrecioInicio = unaFecha;
	}

	public Date getFechaPrecioInicio() {
		return fechaPrecioInicio;
	}

	public void setFechaPrecioFin(Date unaFecha) {
		fechaPrecioFin = unaFecha;
	}

	public Date getFechaPrecioFin() {
		return fechaPrecioFin;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}