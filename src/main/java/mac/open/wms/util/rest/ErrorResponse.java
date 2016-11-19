package mac.open.wms.util.rest;

public class ErrorResponse extends Response {
	private String errorMessage;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ErrorResponse(int status, String errorMessage) {
		super(status);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
