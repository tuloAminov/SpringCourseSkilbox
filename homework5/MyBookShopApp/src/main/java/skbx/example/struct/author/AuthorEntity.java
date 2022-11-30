package skbx.example.struct.author;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String photo;

    @Column(columnDefinition = "INT NOT NULL")
    private String slug;

    @Column(columnDefinition = "INT NOT NULL")
    private String name;

    private String description;
}