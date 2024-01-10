package startup.ir.seotools.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    private int id;
    private String name;
    private int weight;


}
