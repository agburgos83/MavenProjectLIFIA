/**
 * 
 */
package pedidos.modelo;

import java.util.*;

/**
 * @author agus
 *
 */
public class Pedido {

	/**
	 * @param args
	 */
	
	private long id;
	private Integer cantidad;
	private EstadoDePedido estadoActual;
	private Producto producto;
	
	public Pedido () {
	}
	
	public Pedido (Producto unProducto, Integer unaCantidad) {
		producto = unProducto;
		cantidad = unaCantidad;
		Estado1Pendiente estadoActual = new Estado1Pendiente();
	}
	
	// instancia un pedido e inicializa el estado como "pendiente"
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
	}
	
	public void setCantidad (Integer unaCantidad) {
		cantidad = unaCantidad;
    }

	public Integer getCantidad() {
		return cantidad;
}

	public void seleccionarProducto (Producto unProducto) {
		producto = unProducto;
    }
	
	public Float calcularPeso() {
		return (getCantidad() * getProducto().getPeso());
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public String getEstado() {
		return estadoActual.getNombreEstado();
	}
	
	public void enviar() {
		estadoActual.enviar();
	}
	
	public void entregar() {
		estadoActual.entregar();
	}
	
	public void cancelar() {
		estadoActual.cancelar();
	}
	
	public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

}
