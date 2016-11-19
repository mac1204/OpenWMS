package mac.open.wms.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import mac.open.wms.model.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{
	public Category findOneById(Long id);
	public Category findOneByName(String name);
	public Category findOneByCode(String code);
	public List<Category> findAll();
	public Page<Category> findAll(Pageable pageable);
}