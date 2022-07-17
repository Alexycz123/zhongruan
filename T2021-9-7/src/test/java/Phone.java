public class Phone {


    private String brand;

    private String color;

    private double price;

    private String level;

    public  Phone(){

    }
    public Phone(String brand, String color, double price, String level) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.level = level;
    }
    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
       this.level=getLevelByPrice(price);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", level='" + level + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.level=getLevelByPrice(price);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevelByPrice(double price){
        if (price>=500 && price<=1000){
            this.level="初级";
        }else if (price>=2000 && price<=3000){
            this.level="中级";
        }else if (price>=8000 && price<=10000){
            this.level="高级";
        }else {
            this.level="其他";
        }
        return this.level;
    }
}
