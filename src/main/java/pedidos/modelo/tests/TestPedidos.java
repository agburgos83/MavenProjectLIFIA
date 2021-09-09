package pedidos.modelo.tests;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import pedidos.modelo.*;

public class TestPedidos {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// se crea el gestor de persistencia
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		emf = Persistence.createEntityManagerFactory("PedidosLIFIAPlayground");
		manager = emf.createEntityManager();
		
		List <Pedido> pedidos = (List<Pedido>) manager.createQuery("From Pedido").getResultList();
		System.out.println("En esta BD hay "+ pedidos.size()+ " pedidos.");
	}

}