package com.projetoteste.resource;

/*
import com.projetoteste.util.ProdutoDao;
import com.projetoteste.util.Produtos;
import java.util.List;
import javax.ws.rs.core.MediaType;
*/
import javax.ws.rs.*;

@Path("/produtos") 
public class ProdutoResource { 

    /*
    ProdutoDao produtoDao = new ProdutoDao();
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produtos> findAll() {

        System.out.println("Método GET 'findAll'");
        return produtoDao.buscaTodosProdutos();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Produtos find(@PathParam("id") int id) {

        System.out.println("Método GET 'find'");
        return produtoDao.buscaProduto(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Produtos create(Produtos produto) {

        System.out.println("Método POST 'create'");
        return produtoDao.criaProduto(produto);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Produtos update(Produtos produto) {

        System.out.println("Método PUT 'update'");
        return produtoDao.atualizaProduto(produto);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam("id") long id) {

        System.out.println("Método DELETE 'remove'");
        produtoDao.removeProduto(id);
    }
    */
}
