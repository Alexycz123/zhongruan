public class AirConditioner {
    private String brand;
    private double price;
    private String type;

    public AirConditioner() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    @Override
    public String toString() {
        return "AirConditioner{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 三个参数的构造方法
     * @param brand
     * @param price
     * @param type
     */
    public AirConditioner(String brand, double price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        heating();
        refrigeration();
        TimingHeating();
        TimingRefrigeration();
    }

    /**
     * 两个参数的构造方法
     * @param brand
     * @param price
     */
    public AirConditioner(String brand, double price) {
        this.brand = brand;
        this.price = price;
        heating();
        refrigeration();
        TimingHeating();
        TimingRefrigeration();
    }

    public void  heating(){
        System.out.println("制热方法");
    }

    public void refrigeration(){
        System.out.println("制冷方法");
    }
    public void TimingRefrigeration(){
        System.out.println("定时制冷方法");
    }
    public void TimingHeating(){
        System.out.println("定时制热方法");
    }

}
