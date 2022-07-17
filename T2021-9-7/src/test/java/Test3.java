public class Test3 {
    public static void main(String[] args) {
        int sum=0;

        for (int i=1;i<=5;i++){
            int sum2=1;
            for (int j=1;j<=i;j++){
                sum2*=j;
            }
            sum+=sum2;
        }

        System.out.println(sum);


    }


}
