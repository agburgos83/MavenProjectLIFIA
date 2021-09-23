package pedidos.modelo;

import java.util.LinkedList;
import java.util.*;
import javax.persistence.*;

@Entity
public class Repartidor extends Usuario {

	// CONSTRUCTOR PUBLICO
	public Repartidor() {
	}

	public void entregarPedido(Pedido unPedido) {
		Pedido pedido = new Pedido();
		agregarPedido(pedido);
		pedido.entregar();
	}

}