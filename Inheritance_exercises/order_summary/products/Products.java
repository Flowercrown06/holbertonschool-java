package products;

public abstract class Products {
    String title;
    int year;
    String country;
    double grossPrice;

    public abstract double getNetPrice();

    public Products(String title, int year, String country, double grossPrice){
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice = grossPrice;
    }

}