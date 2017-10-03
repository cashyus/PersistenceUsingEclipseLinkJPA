package View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.ListItem;

public class StartProgram {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("OnlineShoppingListJPA");

	public void addItem(ListItem insertItem) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListItem toAdd = new ListItem("Target", "Coffee");
		em.persist(toAdd);
		em.getTransaction().commit();

		// find item
		ListItem found = em.find(ListItem.class, 3);
		System.out.println(found.getStore() + ":" + found.getItem());

		// update item
		ListItem toUpdate = em.find(ListItem.class, 13);
		toUpdate.setItem("shampoo");
		em.getTransaction().commit();

		// remove item
		ListItem toRemove = em.find(ListItem.class, 3);
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
}
