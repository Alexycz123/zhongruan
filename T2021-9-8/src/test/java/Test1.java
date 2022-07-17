public class Test1 {
    public static void main(String[] args) {

        String str="hello123ABCheheQy";
        int bigLetter=0;
        int smallLetter=0;
        int num=0;

        for(int i=0;i<str.length();i++){

            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                num++;
            }else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                smallLetter++;
            }else if (str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                bigLetter++;
            }
        }

        System.out.println("大写字母"+bigLetter);
        System.out.println("小写字母"+smallLetter);
        System.out.println("数字"+num);


    }


}
