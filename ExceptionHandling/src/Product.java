import java.util.Arrays;

public class Product {

    private String name;
    private double price;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new AmountMustBePositiveException();
        }

        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {

        String[] availableCurrencies = {"TL","EUR","USD"};
        if (Arrays.binarySearch(availableCurrencies,currency) == -1){
            throw new CurrencyInvalidException("Para birimi hataldır");
        }
        this.currency = currency;
    }
}
