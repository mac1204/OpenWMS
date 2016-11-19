package mac.open.wms.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mac.open.wms.model.Category;

public interface CategoryService {

	Page<Category> getAll(Pageable pageable);

	Category save(Category category);

	Category getByIdOrNameOrCode(String categoryCode);
}
