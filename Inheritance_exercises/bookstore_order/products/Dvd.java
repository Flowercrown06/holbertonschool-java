package products;

public class Dvd extends Products {
     String director;
     String genre;
     int duration;

    public Dvd(String title, int year, String country, double grossPrice, String director, String genre, int duration){
        super(title, year, country, grossPrice);
        this.director = director;
        this.genre = genre;
        this.duration = duration;
    }


    @Override
    public double getNetPrice() {
        return getGrossPrice()  * 1.2;
    }
}
