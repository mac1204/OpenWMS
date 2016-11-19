package mac.open.wms.util.rest;

import org.springframework.http.HttpStatus;

public class ResponseFactory {

	public static SuccessResponse success(Object responseObject) {
		return new SuccessResponse(HttpStatus.OK.value(), responseObject);
	}

	public static FailureResponse failure(String failureMessage) {
		return new FailureResponse(HttpStatus.UNPROCESSABLE_ENTITY.value(), failureMessage);
	}

	public static ErrorResponse error(String errorMessage) {
		return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
	}
}
