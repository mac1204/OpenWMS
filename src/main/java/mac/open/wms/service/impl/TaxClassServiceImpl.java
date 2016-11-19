package mac.open.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mac.open.wms.dao.TaxClassRepository;
import mac.open.wms.model.TaxClass;
import mac.open.wms.service.TaxClassService;

public class TaxClassServiceImpl implements TaxClassService{

	@Override
	public List<TaxClass> getAll() {
		return taxClassRepository.findAll();
	}
	
	@Override
	public List<TaxClass> saveAll(List<TaxClass> taxClasses) {
		return (List<TaxClass>) taxClassRepository.save(taxClasses);
	}
	
	@Autowired
	private TaxClassRepository taxClassRepository;

}
