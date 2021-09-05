package pedidos.modelo;

public class Estado1Pendiente extends EstadoDePedido {

	public Estado1Pendiente() {
		this.setNombreEstado("Pendiente");
	}

	@Override
	public void enviar() {
		new Estado2Preparado();
	}

	@Override
	public void entregar() {
		System.out.println("no se puede pasar de 'estado pendiente' a 'estado entregado'.");	
	}

	@Override
	public void cancelar() {
		new Estado4Cancelado();		
	}

}
