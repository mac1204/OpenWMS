package mac.open.wms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import mac.open.wms.model.TaxClass;

public interface TaxClassRepository extends CrudRepository<TaxClass,Long>{
	public TaxClass findOneById(Long id);
	public TaxClass findOneByName(String name);
	public List<TaxClass> findAll();
}