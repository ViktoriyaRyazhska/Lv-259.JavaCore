package regina.com;

import org.omg.CORBA.UNKNOWN;

public enum HttpError {

    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOVED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    UNKNOWN(-1, "Unknown");


    HttpError(int errorCode, String errorType) {
        this.errorCode = errorCode;
        this.errorType = errorType;
    }

    private int errorCode;
    private String errorType;

    public static HttpError valueOf(int errorCode) {
        for (HttpError error : values()) {
            if (error.errorCode == errorCode) return error;
        }
        return UNKNOWN;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorType() {
        return errorType;
    }
}
