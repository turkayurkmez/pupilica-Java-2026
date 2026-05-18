public class AmountMustBePositiveException extends RuntimeException {
    public AmountMustBePositiveException(String message) {
        //String message ="Fiyat negatif olamaz";
        super(message);
    }

    public AmountMustBePositiveException(){
        super("Fiyat 0 ya da negatif olamaz");
    }
}
