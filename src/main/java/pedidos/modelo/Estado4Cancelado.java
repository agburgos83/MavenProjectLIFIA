package pedidos.modelo;

public class Estado4Cancelado extends EstadoDePedido {
	
	public Estado4Cancelado() {
		this.setNombreEstado("Cancelado");
	}

	@Override
	public void enviar() {
	}

	@Override
	public void entregar() {
	}

	@Override
	public void cancelar() {	
	}
}
