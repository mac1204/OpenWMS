package mac.open.wms.service;

import java.util.List;

import mac.open.wms.model.TaxClass;

public interface TaxClassService {

	List<TaxClass> getAll();
	
	List<TaxClass> saveAll(List<TaxClass> taxClasses);

}
