package mac.open.wms.util.rest;

public class FailureResponse extends Response {
	private String failureMessage;

	public FailureResponse() {
		super();
	}

	public FailureResponse(String failureMessage) {
		super();
		this.failureMessage = failureMessage;
	}

	public FailureResponse(int status, String failureMessage) {
		super(status);
		this.failureMessage = failureMessage;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

}
