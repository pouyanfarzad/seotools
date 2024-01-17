package startup.ir.seotools.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import startup.ir.seotools.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
