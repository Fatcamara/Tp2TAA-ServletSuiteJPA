package jpa;

import jpa.DAO.EtdDAO;
import jpa.DAO.ProfDAO;
import jpa.DAO.UserDAO;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
//import javax.persistence.PersistenceContext;

public class JpaTest {


	public static void main(String[] args) {

	/**	EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		 manager.persist( new ProfJPA("lArgo"));
		 manager.persist(new ProfJPA("Algo"));
		 manager.persist (new ProfJPA("Reseaux"));
		 manager.persist(new EtdJPA( 2026,"informatique"));
		 manager.persist(new EtdJPA(2028,"informatique"));**/

	//why en comment, ils st ds la bdd??????

		/**try {
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		EtdDAO dao = new EtdDAO();
		EtdJPA etd = new EtdJPA();
		etd.setName("Mani");
		dao.save(etd);

		ProfDAO dao1 = new ProfDAO();
		ProfJPA etd1 = new ProfJPA();
		etd1.setName("Kalou");
		dao1.save(etd1);

		EtdDAO dao2 = new EtdDAO();
		EtdJPA etd2 = new EtdJPA();
		etd.setName("Mora");
		dao2.save(etd2);

		EtdDAO dao3 = new EtdDAO();
		EtdJPA etd3 = new EtdJPA();
		etd.setName("Makhira");
		dao3.save(etd3);

		UserDAO dao4 = new UserDAO();
		UserJPA etd4 = new UserJPA();
		etd4.setName("Makourra");
		dao4.save(etd4);

		UserDAO dao5 = new UserDAO();
		UserJPA etd5 = new UserJPA();
		etd5.setName("Mama");
		dao5.save(etd5);

		UserDAO dao6 = new UserDAO();
		UserJPA etd6 = new UserJPA();
		etd6.setName("Tata");
		dao6.save(etd6);

//why ils vont tous ds user table????
	/**	tx.commit();

		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();*/
	}

}
