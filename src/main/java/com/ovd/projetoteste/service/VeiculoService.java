package com.ovd.projetoteste.service;

import java.util.List;

import com.ovd.projetoteste.domain.Veiculo;
import com.ovd.projetoteste.persistence.JpaVeiculoDao;

public class VeiculoService {

	public List<Veiculo> listarVeiculos(){
		JpaVeiculoDao veiculoDao = new JpaVeiculoDao();
		return veiculoDao.listarVeiculos();
	}
	
	public void inserirVeiculo(Integer id, String placa, String marca, String cor) {
		JpaVeiculoDao veiculoDao = new JpaVeiculoDao();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setId(id);
		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setCor(cor);
		
		veiculoDao.inserirVeiculo(veiculo);
		
	}
}
