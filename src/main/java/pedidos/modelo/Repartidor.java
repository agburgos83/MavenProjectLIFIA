package pedidos.modelo;

import java.util.LinkedList;

public class Repartidor extends Usuario {

	// atributos
	private LinkedList<Pedido> pedidos;

	// CONSTRUCTOR PUBLICO
	public Repartidor() {
	}

	public void entregarPedido(Pedido unPedido) {
		Pedido pedido = new Pedido();
		agregarPedido(pedido);
		pedido.entregar();
	}

}