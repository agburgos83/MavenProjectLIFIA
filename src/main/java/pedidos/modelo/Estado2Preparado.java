package pedidos.modelo;

public class Estado2Preparado extends EstadoDePedido {
	
	public Estado2Preparado() {
		this.setNombreEstado("Preparado");
	}

	@Override
	public void enviar() {
		System.out.println("El pedido ya se encuentra en camino.");
	}

	@Override
	public void entregar() {
		new Estado3Entregado();
	}

	@Override
	public void cancelar() {
		System.out.println("no se puede cancelar un estado preparado.");	
	}

}
