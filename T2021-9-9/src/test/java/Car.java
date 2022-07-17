public class Car {
    public static void main(String[] args) {

        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aClass1 = new Car().getClass();
        Class<? extends Car> aClass2 = new Car().getClass();
        Class<? extends Car> aClass3 = new Car().getClass();

        System.out.println(aClass1.hashCode());
        System.out.println(aClass3.hashCode());
        System.out.println(aClass2.hashCode());

        System.out.println("类加载器"+aClass1.getClassLoader());
        System.out.println("类加载器的parent"+aClass1.getClassLoader().getParent());
        System.out.println("类加载器parent的parent"+aClass1.getClassLoader().getParent().getParent());


    }
}
