package control;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/echo")
public class echo {
	//echo?frase=unilasalle
//	/echo?frase1=unilasalle&frase2=%20niteroi
	@GET
	@Produces("text/plain")
	public String Echo(@QueryParam("frase1")String frase1, @QueryParam("frase2")String frase2) {
		return "Echo: " + frase1 + "" + frase2;
	}
}
