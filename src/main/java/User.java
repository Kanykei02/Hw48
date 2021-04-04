import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class User {
    @GET
    @Path("/{name}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public String check(@PathParam("name") String name, @PathParam("password") String pass){
        if (name.equals("Kanykei02") && pass.equals("aikosha02"))
            return "Right";
        else
            return "False";
    }
}
