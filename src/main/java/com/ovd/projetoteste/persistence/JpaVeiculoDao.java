package com.ovd.projetoteste.persistence;

import java.util.List;

import com.ovd.projetoteste.domain.Veiculo;

public class JpaVeiculoDao extends JpaDao {

	@SuppressWarnings("unchecked")
	public List<Veiculo> listarVeiculos(){
		return getEntityManager().createQuery("from Veiculo").getResultList();
	}
	
	public void inserirVeiculo(Veiculo veiculo) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(veiculo);
		getEntityManager().getTransaction().commit();
	}
}
