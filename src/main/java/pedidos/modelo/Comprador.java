package pedidos.modelo;

public class Comprador extends Usuario {

	// atributos
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
