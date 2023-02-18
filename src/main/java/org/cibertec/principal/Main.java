package org.cibertec.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.cibertec.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DAWI-JPA-02");
		EntityManager manager = factory.createEntityManager();
		
		//Buscar un registro en una tabla de la bdatos
		Usuario user = manager.find(Usuario.class, 1);
		System.out.println(user.getNombre());
		
		
		//Insertar un registro en una tabla de la bdatos
		/*
		 * Usuario userPersist = new Usuario();
		 * 
		 * userPersist.setNombre("Abel"); userPersist.setApellido("Martinez");
		 * userPersist.setClave("ABCDE"); userPersist.setEstado(1);
		 * userPersist.setFnacim(null); userPersist.setTipo(1);
		 * userPersist.setUsuario("amartinez");
		 * 
		 * manager.getTransaction().begin(); manager.persist(userPersist);
		 * manager.getTransaction().commit();
		 */

			/*
			 * Usuario userFind = manager.find(Usuario.class, 1);
			 * System.out.println(userFind.getNombre());
			 */
	
		//Actualizar el objeto Usuario
		/*
		 * Usuario userUpdate = manager.find(Usuario.class, 1);
		 * userUpdate.setNombre("Ricardo");
		 * 
		 * manager.getTransaction().begin(); manager.merge(userUpdate);
		 * manager.getTransaction().commit();
		 */
		 
		 //Eliminar el registro del usuario
			/*
			 * Usuario userDelete = manager.find(Usuario.class, 2);
			 * 
			 * manager.getTransaction().begin(); manager.remove(userDelete);
			 * manager.getTransaction().commit();
			 */
		 
		
	}

}
