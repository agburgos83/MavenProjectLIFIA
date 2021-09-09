package pedidos.modelo;

import java.util.*;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EstadoDePedido {

	@Id
	private Long id;

	private String nombreEstado;

	public static void main(String[] args) {
	}

	public abstract void enviar();{
	}

	public abstract void entregar();{
	}

	public abstract void cancelar();{
	}

	public void setNombreEstado(String unNombre) {
		nombreEstado = unNombre;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
