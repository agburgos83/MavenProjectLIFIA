package pedidos.modelo;

import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class Sistema {

	private long id;
	private LinkedList usuarios;
	private LinkedList proveedores;

	public static void main(String[] args) {

		Sistema soleInstance = new Sistema();
		LinkedList<Usuario> usuarios;
		LinkedList<Proveedor> proveedores;
	}

	// CONSTRUCTOR PUBLICO
	private Sistema() {
		LinkedList<Usuario> usuarios = new LinkedList();
		LinkedList<Proveedor> proveedores = new LinkedList();
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

	public LinkedList getUsuarios() {
		return usuarios;
	}

	public LinkedList getProveedores() {
		return proveedores;
	}

	public void addProvedor(Proveedor unProveedor) {
		proveedores.add(unProveedor);
	}

	public void addUsuario(Usuario unUsuario) {
		usuarios.add(unUsuario);
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
