package mac.open.wms.util.rest;

public class Response {

	private int status;

	public Response() {
		super();
	}

	public Response(int status) {
		super();
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
