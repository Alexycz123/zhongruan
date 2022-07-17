import com.ycz.utils.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        String str1="语文,数学,英语,法语,语文,德语,数学,阿拉伯语";

        String str2="语文,法语,体育,美术,德语";

        List<String> stringList1= ListUtil.storageList(str1);
        List<String> stringList2=ListUtil.storageList(str2);
        System.out.println("str1变为集合的结果："+stringList1);
        System.out.println("str1变为集合的结果："+stringList2);

        List<String> stringList=ListUtil.mergeList(stringList1,stringList2);

        System.out.println("去重后的结果："+stringList);

    }





}
