public class Test11 {

    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<100;i++){
            if (i % 3!=0){ //不能整数的的时候加
                //System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);

    }


}
