package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import model.Etape;


@Repository
public class EtapeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public Etape getEtape(long etapeId) {
		return em.find(Etape.class, etapeId);
	}
	
	public List<Etape> getAllEtapes() {
		return em.createQuery("select e from Etape e order by e.nom", Etape.class).getResultList();
	}

	public void addEtape(Etape etape) {
		em.persist(etape);
	}

	public void deleteEtape(long etapeId) {
		em.createQuery("delete from Etape e where e.id = :idetape")
		  .setParameter("idetape", etapeId)
		  .executeUpdate();
	}

}
