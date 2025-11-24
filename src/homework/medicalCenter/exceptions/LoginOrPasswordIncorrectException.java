package homework.medicalCenter.exceptions;

public class LoginOrPasswordIncorrectException extends RuntimeException {
    public LoginOrPasswordIncorrectException() {
    }

    public LoginOrPasswordIncorrectException(String message) {
        super(message);
    }

    public LoginOrPasswordIncorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginOrPasswordIncorrectException(Throwable cause) {
        super(cause);
    }

    public LoginOrPasswordIncorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
