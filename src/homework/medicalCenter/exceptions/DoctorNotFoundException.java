package homework.medicalCenter.exceptions;

public class DoctorNotFoundException extends RuntimeException {

    public DoctorNotFoundException() {
    }

    public DoctorNotFoundException(String message) {
        super(message);
    }

    public DoctorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoctorNotFoundException(Throwable cause) {
        super(cause);
    }

    public DoctorNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
