public class CurrencyInvalidException extends RuntimeException {
    public CurrencyInvalidException(String message) {
        super(message);
    }

    public CurrencyInvalidException() {
        super("Para birimi hatalı!");
    }
}
