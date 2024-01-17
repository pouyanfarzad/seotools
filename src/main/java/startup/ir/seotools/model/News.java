package startup.ir.seotools.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class News {

    public News() {
    }

    public News(Category category, String newsUrl) {
        this.category = category;
        this.newsUrl = newsUrl;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String newsUrl;
    private String title;
    private String newsImage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
}
