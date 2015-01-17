package mongodb.sample02;

import com.mongodb.*;

public class SortPaginate07 extends FindDocument03 {

	public static void main(String[] args) {
		try
		{
			DBCollection collection = getCollection("coordinates", "samples");
			DBCursor cursor = collection.find().sort(new BasicDBObject("rank", 1));
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error: " + exception.getMessage());
		}

	}

}
