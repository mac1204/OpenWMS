package mac.open.wms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import mac.open.wms.model.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{
	public Product findOneById(Long id);
	public Product findOneBySkuCode(String skuCode);
	public Product findOneByScanableIdentifier(String scanableIdentifier);
	public List<Product> findAllByName(String name);
	public List<Product> findAllByCategoryId(Long categoryId);
	public List<Product> findAllByBasePrice(Double basePrice);
	public List<Product> findAllByMaxRetailPrice(Double maxRetailPrice);
	public List<Product> findAllByType(String type);
	public List<Product> findAllByBrand(String brand);
	public List<Product> findAllByEnabled(Integer enabled);
}