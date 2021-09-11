package pedidos.modelo.tests;

import java.util.List;
import javax.persistence.Persistence;
import pedidos.modelo.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class TestPedidos {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// CREACION DEL GESTOR DE PERSISTENCIA
		
		emf = Persistence.createEntityManagerFactory("PedidosLIFIAPlayground");
		manager = emf.createEntityManager();
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		List <Pedido> pedidos = (List<Pedido>) manager.createQuery("FROM Pedido").getResultList();
		System.out.println("En esta BD hay "+ pedidos.size()+ " pedidos.");
	}

}