import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sum")
public class Sum {
    @GET
    @Path("/{num1}/{num2}")
    @Produces(MediaType.APPLICATION_JSON)
    public Finish sum(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2){
        return new Finish(num1 + num2);
    }
}
