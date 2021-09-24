package pedidos.modelo;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@MappedSuperclass
@Table
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;
	private String password;
	private String nombre;
	private String mail;
	private Date fechaNacimiento;
	private LinkedList<Pedido> pedidos;

	public Usuario() {
	}

	// CONSTRUCTOR PUBLICO
	public Usuario(Long id, String username, String password, String nombre, String mail, Date fechaNacimiento) {

		this.id = id;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.mail = mail;
		this.fechaNacimiento = fechaNacimiento;
		this.setPedidos(new LinkedList<Pedido>());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
