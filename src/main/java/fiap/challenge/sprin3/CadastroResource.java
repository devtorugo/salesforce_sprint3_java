package fiap.challenge.sprin3;
import fiap.challenge.sprin3.entities.Cadastro;
import fiap.challenge.sprin3.repositories.CadastroRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("cadastro")
public class CadastroResource {

    private CadastroRepository cadastroRepository;

    public CadastroResource() {
        cadastroRepository = new CadastroRepository();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        List<Cadastro> cadastros = cadastroRepository.getAll();
        return Response.ok(cadastros).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
        var cadastro = cadastroRepository.get(id);
        return cadastro.map(c -> Response.ok(c).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Cadastro cadastro) {
        try {
            cadastroRepository.create(cadastro);
            return Response.status(Response.Status.CREATED).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
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
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        cadastroRepository.delete(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
