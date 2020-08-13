package pro.edu.mymysql;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/*
*  5 steps to fit Hibernate requirements
*   1.  @Entity over the class declaration
*   2.  @Id  over the field  id.  I use String type for id.
*       In this case I generate the id manually as UUID string in a constructor.
*       in order to autoincrement id use int, Long or UUID
*       and annotation @GeneratedValue(strategy = GenerationType.IDENTITY)
*   3.  Define the class Book, that includes the Category by a composition,
*       as a private Set<Book> books  and the annotation @OneToMany
*   4.  Include books in all constructors as books = new HashSet<Book>
*   5.  Generate in  all constructors an id for a new obiect
*   6.  Create a tricky setter for books
*   7.  books getter as usual
* */


@Entity  // 1st step
public class Category {

    @Id     // 2nd step
    private String id; //

    private String name;
    private String description;

    // 3rd step
    @OneToMany(
            mappedBy = "сategory",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY
    )
    private Set<Book> books;


    public Category() {
        this.id = UUID.randomUUID().toString();  //  5th step - generate an id
        books = new HashSet<>();  //  4th step
    }

    public Category(String name, String desc) {
        this.id = UUID.randomUUID().toString();   //  5th step - generate an id
        this.name = name;
        this.description = desc;
        books = new HashSet<>();   // 4th step
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Book> getBooks() {
        return books;
    }

    // Tricky setter
   public void setBooks(Set<Book> books) {
        this.books = books;
        for (Book book : books) {
            book.setCategory(this);
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", books=" + books +
                '}';
    }
}