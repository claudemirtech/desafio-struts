package br.com.atomicweb.repository.impl;

import java.util.List;
import javax.persistence.EntityManager;

import br.com.atomicweb.model.Contato;
import br.com.atomicweb.repository.ContatoRepository;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class ContatoRepositoryImpl implements ContatoRepository {


	//https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
	//https://docs.oracle.com/javaee/6/tutorial/doc/bnbrg.html
	//https://gist.github.com/mlecoutre/4088178

	public final EntityManager em;

	@Override
	public List<Contato> listaContato() {
		return em.createQuery("select c from Contato c", Contato.class).getResultList();
	}

	@Override
	public Contato getContato(@NotNull Contato contato) {
		return (Contato) em.createQuery("select c from Contato c where id = :id")
			.setParameter("id", contato.getId())
			.getSingleResult();
	}

	@Override
	public void salvaContato(Contato contato) {
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
//		em.close();
	}
	@Override
	public void editaContato(Contato contato) {
		em.getTransaction().begin();
		em.merge(contato);
		em.flush();
		em.getTransaction().commit();
//		em.close();
	}
	@Override
	public void deletaContato(Contato contato) {
		em.getTransaction().begin();
		em.remove(em.contains(contato) ? contato : em.merge(contato));
		em.getTransaction().commit();
//		em.close();
	}

}
