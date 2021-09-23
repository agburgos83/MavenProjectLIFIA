package pedidos.modelo;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@MappedSuperclass
public abstract class EstadoDePedido implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nombreEstado;

	public static void main(String[] args) {
	}

	public abstract void enviar();

	public abstract void entregar();


	public abstract void cancelar();
	
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
