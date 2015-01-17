package mongodb.sample01;

import static spark.Spark.get;

import java.io.*;
import java.util.*;

import com.mongodb.*;

import freemarker.template.*;

public class FreemarkerSample extends App {

	public static void main(String[] args) {
		FreemarkerSample app = new FreemarkerSample();
		get("/mongo/sample01", (req, res) -> { return app.getIndex(app.getDog()); });
	}
	
	public String getIndex(DBObject dog)
	{
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(FreemarkerSample.class, "/");
		try {
			// Creamos el template
			Template template = configuration.getTemplate("index.ftl");
			
			// Para procesar el template necesitamos un StringWriter y un Map
			StringWriter stringWriter = new StringWriter();
			Map<String, Object> map = new HashMap<String, Object>();
			
			// Poblamos el Map
			map.put("dog", dog.get("name"));
			
			// Procesamos el template
			template.process(map, stringWriter);
			
			return stringWriter.toString();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
