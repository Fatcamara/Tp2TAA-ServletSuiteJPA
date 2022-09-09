package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
//import javax.persistence.PersistenceContext;

public class JpaTest {


	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		 manager.persist( new ProfJPA("lArgo"));
		 manager.persist(new ProfJPA("Algo"));
		 manager.persist (new ProfJPA("Reseaux"));
		 manager.persist(new EtdJPA( 2026,"informatique"));
		 manager.persist(new EtdJPA(2028,"informatique"));

		/**try {
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		tx.commit();

		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}

}
