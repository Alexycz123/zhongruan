public class Test6 {
    public static void main(String[] args) {

        int[] ints={72,89,65,58,87,91,53,82,71,93,76,68};
        int[] counts={0,0,0,0,0};
        for (int i = 0; i < ints.length; i++) {
            int num=ints[i]/10;
            switch (num){
                case 9: counts[4]++;break;
                case 8:counts[3]++;break;
                case 7:counts[2]++;break;
                case 6:counts[1]++;break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:counts[0]++;break;
                default:
                    System.out.println("错误");
            }
        }
        System.out.println("不及格的为"+counts[0]+"个人");
        System.out.println("60-69为"+counts[1]+"个人");
        System.out.println("70-79为"+counts[2]+"个人");
        System.out.println("80-89为"+counts[3]+"个人");
        System.out.println("90-100为"+counts[4]+"个人");
    }
}
