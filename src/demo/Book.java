package demo;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by KyleV_000 on 14/11/2016.
 */

@Path("/book")
public class Book {
    String title;
    String description;
    String author;
    int year;


    public Book() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessages() {
        Gson gson = new Gson();
        Book book = new Book();
        String json = gson.toJson(book);
        return json;
    }

}