package startup.ir.seotools.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class News {

    public News() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int category;
    private String newsUrl;
    private String title;
    private String newsImage;
    private int value;
    private int totalValue;
}
