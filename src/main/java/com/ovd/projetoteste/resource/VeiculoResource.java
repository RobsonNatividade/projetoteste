package com.ovd.projetoteste.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ovd.projetoteste.domain.Veiculo;
import com.ovd.projetoteste.service.VeiculoService;

@Path("/")
public class VeiculoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("veiculos")
	public List<Veiculo> listarVeiculos(){
		VeiculoService veiculoService = new VeiculoService();
		return veiculoService.listarVeiculos();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("veiculos")
	public void inserirVeiculo(@QueryParam("id") Integer id, 
			@QueryParam("placa") String placa, @QueryParam("marca") String marca, 
			@QueryParam("cor") String cor) {
		
		VeiculoService veiculoService = new VeiculoService();
		veiculoService.inserirVeiculo(id, placa, marca, cor);
	}
}
