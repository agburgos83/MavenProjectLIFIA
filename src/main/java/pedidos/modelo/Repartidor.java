package pedidos.modelo;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Repartidor extends Usuario implements Serializable {

	// CONSTRUCTOR PUBLICO
	public Repartidor() {
	}

	public void entregarPedido(Pedido unPedido) {
		Pedido pedido = new Pedido();
		agregarPedido(pedido);
		pedido.entregar();
	}

}