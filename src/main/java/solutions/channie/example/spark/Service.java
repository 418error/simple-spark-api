package solutions.channie.example.spark;
import static spark.Spark.get;
import static spark.Spark.post;


public class Service{

	public static void main(String[] args) {
		get("/", (req, res) -> "Running...");
		
		get("/hello", (req, res) -> "Hello World");

		// matches "GET /hello/foo" and "GET /hello/bar"
		// request.params(":name") is 'foo' or 'bar'
		get("/hello/:name", (request, response) -> {
		    return "Hello: " + request.params(":name");
		});

	};
}
