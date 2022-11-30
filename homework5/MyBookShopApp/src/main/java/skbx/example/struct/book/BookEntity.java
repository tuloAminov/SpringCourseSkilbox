package skbx.example.struct.book;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "INT NOT NULL")
    private Date pubDate;

    @Column(columnDefinition = "INT NOT NULL")
    private short isBestseller;

    @Column(columnDefinition = "INT NOT NULL")
    private String slug;

    @Column(columnDefinition = "INT NOT NULL")
    private String title;

    private String image;

    private String description;

    @Column(columnDefinition = "INT NOT NULL")
    private int price;

    @Column(columnDefinition = "INT NOT NULL  DEFAULT 0")
    private short discount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public short getIsBestseller() {
        return isBestseller;
    }

    public void setIsBestseller(short isBestseller) {
        this.isBestseller = isBestseller;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public short getDiscount() {
        return discount;
    }

    public void setDiscount(short discount) {
        this.discount = discount;
    }
}
