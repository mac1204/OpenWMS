package mac.open.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mac.open.wms.dao.CategoryRepository;
import mac.open.wms.model.Category;
import mac.open.wms.service.CategoryService;
import mac.open.wms.util.CommonUtils;

public class CategoryServiceImpl implements CategoryService {

	@Override
	public Page<Category> getAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}
	
	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}
	
	@Override
	public Category getByIdOrNameOrCode(String categoryCode) {
		Category category  = new Category();
		if(CommonUtils.isLong(categoryCode)) {
			category = categoryRepository.findOneById(Long.parseLong(categoryCode));
		} else {
			category = categoryRepository.findOneByCode(categoryCode);
			if(CommonUtils.isBlank(category)) {
				category = categoryRepository.findOneByName(categoryCode);
			}
		}
		return category;
	}
	
	@Autowired
	private CategoryRepository categoryRepository;

}
