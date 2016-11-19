package mac.open.wms.dao;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import mac.open.wms.model.Shipment;

public interface ShipmentRepository extends CrudRepository<Shipment,Long>{
	public Shipment findOneById(Long id);
	public Shipment findOneByShipmentCode(String shipmentCode);
	public List<Shipment> findAllByDisplayOrderCode(String displayOrderCode);
	public List<Shipment> findAllByStatus(String status);
	public List<Shipment> findAllByCreatedAt(Timestamp createdAt);
	public List<Shipment> findAllByInvoiceNo(String invoiceNo);
	public List<Shipment> findAllByShipmentMethod(String shipmentMethod);
	public List<Shipment> findAllByShipmentCarrier(String shipmentCarrier);
	public List<Shipment> findAllByAwbNo(String awbNo);
	public List<Shipment> findAllByPicklistId(Long picklistId);
	public List<Shipment> findAllByDispatchedDate(Timestamp dispatchedDate);
	public List<Shipment> findAllByParentPackageCode(String parentPackageCode);
	public List<Shipment> findAllByReturnManifestCode(String returnManifestCode);
	public List<Shipment> findAllByShipmentManifestCode(String shipmentManifestCode);
	public List<Shipment> findAllByCourierStatus(String courierStatus);
	public List<Shipment> findAllByDeliveryDate(Timestamp deliveryDate);
	public List<Shipment> findAllByZone(String zone);
	public List<Shipment> findAllByReshipmentOrderCode(String reshipmentOrderCode);
	public List<Shipment> findAllByCustomizationStatus(String customizationStatus);
	public List<Shipment> findAllByCustomizationAssignedTo(String customizationAssignedTo);
	public List<Shipment> findAllByShelfCode(String shelfCode);
	public Page<Shipment> findAll(Pageable pageable);
	public Shipment findTopByDisplayOrderCodeOrderByIdDesc(String displayOrderCode);
}