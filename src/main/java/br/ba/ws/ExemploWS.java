/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.ws;

import br.ba.pojo.Aluno;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author dado
 */
@Path("exemplos")
public class ExemploWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ExemploWS
     */
    public ExemploWS() {
    }

    /**
     * Retrieves representation of an instance of br.ba.ws.ExemploWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "Meus queridos Alunos";
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/somar")
    public String getText(@QueryParam("v1")String v1, @QueryParam("v2") String v2) {
        double vl1 = Double.parseDouble(v1);
        double vl2 = Double.parseDouble(v2);
        double res = vl1+vl2;
        return String.valueOf(res);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/objeto")
    public Aluno getObjeto(@QueryParam("nome")String nome, @QueryParam("idade") int idade) {
        
        return new Aluno(nome,idade);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/objeto2")
    public Aluno getObjeto(Aluno al) {
        
        return al;
    }
    /**
     * PUT method for updating or creating an instance of ExemploWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
