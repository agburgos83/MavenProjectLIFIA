package pedidos.modelo;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Comprador extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//	ATRIBUTOS
	@Id
	private Long id;
	private String domicilio;

	public Comprador() {
	}

	// CONSTRUCTOR PUBLICO
	public Comprador(String unDomicilio) {
		setDomicilio(unDomicilio);
	}

	public void realizarPedido() {
		Pedido pedido = new Pedido();
		agregarPedido(pedido);
	}

	public void setDomicilio(String unDomicilio) {
		domicilio = unDomicilio;
	}
	
	public String getDomicilio() {
		return domicilio;
	}

}
