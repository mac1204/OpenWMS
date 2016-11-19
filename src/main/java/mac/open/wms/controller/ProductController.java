package mac.open.wms.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiBodyObject;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.annotation.ApiVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mac.open.wms.model.Category;
import mac.open.wms.model.TaxClass;
import mac.open.wms.service.CategoryService;
import mac.open.wms.service.TaxClassService;
import mac.open.wms.util.CommonUtils;

/**
 * 
 * @author Mahak</br>
 *         This is a Controller which control all product related things</br>
 */
@Api(name = "Product APIs", description = "API which control all product related things like category, product, tax classes", group = "Product API")
@ApiVersion(since = "1.0", until = "2.0")
@RequestMapping(value = "/product")
@RestController
public class ProductController {
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/tax-class/list/all", method = RequestMethod.GET)
	public @ApiResponseObject List<TaxClass> listAllTaxClasses() throws Exception {
		
		return taxClassService.getAll();
	}
	
	/**
	 * 
	 * @param taxClasses
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/tax-class/save/all", method = RequestMethod.POST)
	public @ApiResponseObject List<TaxClass> saveAllTaxClasses(@RequestBody List<TaxClass> taxClasses) throws Exception {
		if(CommonUtils.isBlank(taxClasses)) {
			logger.error("Request body is empty.");
			throw new Exception("Request body is empty.");
		}
		return taxClassService.saveAll(taxClasses);
	}
	
	/**
	 * 
	 * @param taxClass
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/tax-class/save", method = RequestMethod.POST)
	public @ApiResponseObject List<TaxClass> saveTaxClass(@RequestBody TaxClass taxClass) throws Exception {
		if(CommonUtils.isBlank(taxClass)) {
			logger.error("Request body is empty.");
			throw new Exception("Request body is empty.");
		}
		List<TaxClass> taxClasses = new ArrayList<TaxClass>();
		taxClasses.add(taxClass);
		return taxClassService.saveAll(taxClasses);
	}
	
	/**
	 * 
	 * @param pageable
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/category/all", method = RequestMethod.GET)
	public @ApiResponseObject Page<Category> listAllCategories(@ApiBodyObject Pageable pageable) throws Exception {
		return categoryService.getAll(pageable);
	}
	
	/**
	 * 
	 * @param category
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/category/save", method = RequestMethod.POST)
	public @ApiResponseObject Category save(@RequestBody Category category) throws Exception {
		if(CommonUtils.isBlank(category)) {
			logger.error("Request body is empty.");
			throw new Exception("Request body is empty.");
		}
		return categoryService.save(category);
	}
	
	/**
	 * 
	 * @param categoryCode
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/category/{category_code}", method = RequestMethod.GET)
	public @ApiResponseObject Category getCategory(@PathVariable("category_code") String categoryCode) throws Exception {
		if(StringUtils.isBlank(categoryCode)) {
			logger.error("Pathvariable category code is empty.");
			throw new Exception("Pathvariable category code is empty.");
		}
		return categoryService.getByIdOrNameOrCode(categoryCode);
	}
	
	private Logger logger = Logger.getLogger(ProductController.class.getName());
	
	@Autowired
	private TaxClassService taxClassService;
	
	@Autowired
	private CategoryService categoryService;

}
