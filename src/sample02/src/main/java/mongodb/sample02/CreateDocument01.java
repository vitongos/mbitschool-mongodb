package mongodb.sample02;

import com.mongodb.*;

public class CreateDocument01 {
	public static void main( String[] args )
    {
		DBObject document = getAurora();
        System.out.println( document );
    }
	
	public static BasicDBObject getAurora()
	{
		BasicDBObject document = 
		  new BasicDBObject("name","Aurora")
			.append("sex","F")
		    .append("birth", 
	    		new BasicDBObject("place","NYC")
	      			.append("year",1980)
		    );
		return document;
	}
}
