import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Phone[] phones=new Phone[4];
        for (int i = 0; i < phones.length; i++) {
            Phone phone=new Phone();
            System.out.print("请输入手机品牌");
            phone.setBrand(new Scanner(System.in).nextLine());
            System.out.print("请输入手机颜色");
            phone.setColor(new Scanner(System.in).nextLine());
            System.out.print("请输入手机价格");
            double price=new Scanner(System.in).nextDouble();
            phone.setPrice(price);
            phones[i]=phone;
        }

        for (int i = 0; i < phones.length; i++) {
            for(int j=0;j< phones.length-i-1;j++){
                if (phones[j].getPrice()>phones[j+1].getPrice()){
                    double temp=phones[j].getPrice();
                    phones[j].setPrice(phones[j+1].getPrice());
                    phones[j+1].setPrice(temp);
                }
            }
        }

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i]);
        }
        MaxAndMinIndex(phones);

        //输入手机品牌首字母  查询出满足条件的手机 并打印到控制带

        System.out.println("请输入手机品牌的首字母");
        String write=new Scanner(System.in).nextLine();
        for (int i = 0; i < phones.length; i++) {
            if (write.equals(phones[i].getBrand().substring(0,1))){
                System.out.println("找到了"+phones[i]);
                break;
            }
        }

    }

    public static void MaxAndMinIndex(Phone[] phones){
        double maxNumber=phones[0].getPrice();
        double minNumber=phones[0].getPrice();
        for (int i = 0; i < phones.length; i++) {
            if (maxNumber<phones[i].getPrice()){
                maxNumber=phones[i].getPrice();
            }
            if (minNumber>phones[i].getPrice()){
                minNumber=phones[i].getPrice();
            }
        }
        System.out.println("最大值为+"+maxNumber);
        System.out.println("最小值为+"+minNumber);

    }

}
