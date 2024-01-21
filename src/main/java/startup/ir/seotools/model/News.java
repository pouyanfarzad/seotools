package startup.ir.seotools.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class News {

    public News() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    private String newsUrl;
    private String title;
    private String newsImage;
    private int value;
    private int totalValue;
}
