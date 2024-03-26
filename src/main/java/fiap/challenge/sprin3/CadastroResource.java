package fiap.challenge.sprin3;

import fiap.challenge.sprin3.entities.Cadastro;
import fiap.challenge.sprin3.repositories.CadastroRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Path("cadastro")
public class CadastroResource {

    private static final Logger logger = LogManager.getLogger(CadastroResource.class);
    private CadastroRepository cadastroRepository;

    public CadastroResource() {
        cadastroRepository = new CadastroRepository();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        try {
            List<Cadastro> cadastros = cadastroRepository.getAll();
            return Response.ok(cadastros).build();
        } catch (Exception e) {
            logger.error("Erro ao recuperar todos os cadastros: {}", e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
        try {
            var cadastro = cadastroRepository.get(id);
            return cadastro.map(c -> Response.ok(c).build())
                    .orElse(Response.status(Response.Status.NOT_FOUND).build());
        } catch (Exception e) {
            logger.error("Erro ao recuperar o cadastro com o ID {}: {}", id, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Cadastro cadastro) {
        try {
            cadastroRepository.create(cadastro);
            return Response.status(Response.Status.CREATED).build();
        } catch (IllegalArgumentException e) {
            logger.error("Erro ao criar o cadastro: {}", e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (Exception e) {
            logger.error("Erro interno ao criar o cadastro: {}", e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Cadastro cadastro) {
        try {
            cadastroRepository.update(id, cadastro);
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (IllegalArgumentException e) {
            logger.error("Erro ao atualizar o cadastro com o ID {}: {}", id, e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (Exception e) {
            logger.error("Erro interno ao atualizar o cadastro com o ID {}: {}", id, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        try {
            cadastroRepository.delete(id);
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (Exception e) {
            logger.error("Erro ao deletar o cadastro com o ID {}: {}", id, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
