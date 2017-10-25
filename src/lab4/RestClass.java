package lab4;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/main")
public class RestClass {
    @EJB MainBean mainBean;
    @POST
    public Response login(){
        try {
            return Response.status(200).entity("1").build();
        }catch (Exception e){ return null;}
    }
    @GET
    public Response get() {
        return Response.ok("1", MediaType.APPLICATION_JSON).build();
    }
    @Path("/getTable")
    @GET
    public String getTable(){
        return "<tr><td>X</td> <td>Y</td> <td> R </td> <td>Result</td></tr>";
    }
    @Path("/removeTable")
    @DELETE
    public void removeTable(){

    }
    @Path("/out")
    @POST
    public void endSession(){

    }
}