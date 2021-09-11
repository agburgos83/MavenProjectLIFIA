package pedidos.modelo;

import java.util.LinkedList;
import java.util.*;
import javax.persistence.*;


@SuppressWarnings("rawtypes")
@Entity
public class Sistema {

	@Id
	private Long id;
	
	private LinkedList<Comprador> compradores;
	
	private LinkedList<Repartidor> repartidores;
	
	private LinkedList<Proveedor> proveedores;

	public static void main(String[] args) {

		Sistema soleInstance = new Sistema();
		LinkedList<Comprador> compradores;
		LinkedList<Repartidor> repartidores;
		LinkedList<Proveedor> proveedores;
	}

	// CONSTRUCTOR PUBLICO
	private Sistema() {
		LinkedList<Comprador> compradores = new LinkedList<Comprador>();
		LinkedList<Comprador> repartidores = new LinkedList<Comprador>();
		LinkedList<Proveedor> proveedores = new LinkedList<Proveedor>();
	}

	public static Sistema getInstance() {
		Object soleInstance = null;
		{
			if (soleInstance == null) {
				soleInstance = new Sistema();
			}
			return (Sistema) soleInstance;
		}
	}

	public LinkedList getCompradores() {
		return compradores;
	}

	public LinkedList getRepartidores() {
		return repartidores;
	}
	
	public LinkedList getProveedores() {
		return proveedores;
	}

	public void addProvedor(Proveedor unProveedor) {
		proveedores.add(unProveedor);
	}

	public void addComprador(Comprador unComprador) {
		compradores.add(unComprador);
	}
	
	public void addRepartidor(Repartidor unRepartidor) {
		repartidores.add(unRepartidor);
	}


	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
