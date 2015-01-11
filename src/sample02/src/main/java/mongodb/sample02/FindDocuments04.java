package mongodb.sample02;

import com.mongodb.*;

public class FindDocuments04 extends FindDocument03 {

	public static void main(String[] args) {
		try
		{
			DBCollection collection = getCollection("persons", "samples");
			DBCursor cursor = collection.find();
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
