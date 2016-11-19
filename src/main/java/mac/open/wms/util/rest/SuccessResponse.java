package mac.open.wms.util.rest;

public class SuccessResponse extends Response {
	private Object response;

	public SuccessResponse() {
		super();
	}

	public SuccessResponse(Object response) {
		super();
		this.response = response;
	}

	public SuccessResponse(int status, Object response) {
		super(status);
		this.response = response;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

}
