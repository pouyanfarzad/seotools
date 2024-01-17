package startup.ir.seotools.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

    public Category(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Category() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int weight;
    private String iconPath;

    @OneToOne(mappedBy = "category")
    private News news;


}
