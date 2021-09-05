package pedidos.modelo;

public class Estado3Entregado extends EstadoDePedido {
	
	public Estado3Entregado() {
		this.setNombreEstado("Entregado");
	}

	@Override
	public void enviar() {
		// TODO Auto-generated method stub
		System.out.println("El pedido ya se entregó.");
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cancelar() {
		// TODO Auto-generated method stub
		System.out.println("no se puede cancelar un estado entregado.");	
	}

}
