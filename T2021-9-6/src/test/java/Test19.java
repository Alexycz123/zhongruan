public class Test19 {

    public static void main(String[] args) {

        for (int i=2;i<1000;i++){

            int bai=i/100%10;
            int shi=i/10%10;
            int ge=i%10;

            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i);
            }


        }



    }
}
