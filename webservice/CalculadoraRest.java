import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

package webservice;

@Path("calculadora")
public class CalculadoraRest {   

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/somarInt/{a}/{b}")
    public static Calculadora  somarInt(@PathParam("a") int a, @PathParam("b") int b){
        return new Calculadora(a,b,"+");
        
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/multiplicarInt/{a}/{b}")
    public static Calculadora multiplicarInt(@PathParam("a") int a, @PathParam("b") int b){
        return new Calculadora(a,b,"*");
    }

}
