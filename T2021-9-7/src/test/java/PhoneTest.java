public class PhoneTest {
    public static void main(String[] args) {

        Phone phone=new Phone("华为","red",500);

        Phone phone1=new Phone();
        phone1.setPrice(10000);
        phone1.setBrand("huawei");
        phone1.setColor("red");
        System.out.println(phone);
        System.out.println(phone1);


    }
}
