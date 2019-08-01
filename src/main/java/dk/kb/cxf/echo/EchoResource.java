package dk.kb.cxf.echo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("")
public class EchoResource {

    @POST
    @Path("echo")
    @Consumes({"application/xml; charset=UTF-8", "application/json"})
    @Produces({"application/xml; charset=UTF-8", "application/json"})
    public String echo(final String message) {
        return "Echo" + message;
    }

    @GET
    @Path("ping")
    public String ping() {
        return "pong";
    }
}
