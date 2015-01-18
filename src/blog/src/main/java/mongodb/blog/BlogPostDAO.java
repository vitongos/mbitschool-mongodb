package mongodb.blog;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.mongodb.*;

public class BlogPostDAO {
	DBCollection postsCollection;

    public BlogPostDAO(final DB blogDatabase) {
        postsCollection = blogDatabase.getCollection("posts");
    }
    
    private DBObject fakePost() {
    	DBObject post = new BasicDBObject("title", "My very first post")
    	.append("author", "Victor")
    	.append("body", "<p> This is my first post<p> Please share with your friends")
		.append("permalink", "first-post")
    	.append("tags", Arrays.asList("commercial","startup"))
    	.append("comments", Arrays.asList(
			new BasicDBObject("author", "Concha").append("body", "Me gusta"),
			new BasicDBObject("author", "Lidia").append("body", "Me encanta")
		))
		.append("date", new Date());


    	return post;
    }

    public DBObject findByPermalink(String permalink) {
        return fakePost();
    }

    public List<DBObject> findByDateDescending(int limit) {
        return Arrays.asList(fakePost());
    }

    public List<DBObject> findByTagDateDescending(final String tag) {
    	return Arrays.asList(fakePost());
    }

    public String addPost(String title, String body, List<String> tags, String username) {

        System.out.println("inserting blog entry " + title + " " + body);

        String permalink = title.replaceAll("\\s", "_"); // whitespace becomes _
        permalink = permalink.replaceAll("\\W", ""); // get rid of non alphanumeric
        permalink = permalink.toLowerCase();

        return permalink;
    }

    public WriteResult addPostComment(final String name, final String email, final String body, final String permalink) {
        return null;
    }
}
