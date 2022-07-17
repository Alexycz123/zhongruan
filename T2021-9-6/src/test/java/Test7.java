import org.junit.Test;

public class Test7 {
    @Test
    public void Max() {
        int[] ints = {1, 2, -39, 90, 30, -90};
        int MaxNumber = MaxMethod(ints);
        System.out.println("最大值为" + MaxNumber);
    }

    public static int MaxMethod(int[] array) {
        int MaxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (MaxNumber < array[i]) {
                MaxNumber = array[i];
            }
        }
        return MaxNumber;
    }

    @Test
    public void test2333() {
        System.out.println("5" + 2);
        System.out.println(getValue(2));

        int num = 90;

        System.out.println(num++);

        double a = 89.5;

        int b = (int) a + 10;

        System.out.println(b);

        System.out.println(2 / 5 * 9);
    }

    public static int getValue(int i) {

        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;

    }
    @Test
    public void test2(){




    }

}
