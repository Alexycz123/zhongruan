public class Test20 {

    public static void main(String[] args) {

        for (int i=2;i<1000;i++){
            int m=0;
            for (int j=1;j<=i/2 ;j++){

                if (i % j ==0){
                    m+=j;
                }

            }
            if (m==i){
                System.out.println("1000以内的完数为："+i);
            }
        }
    }

}
