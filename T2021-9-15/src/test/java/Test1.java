import com.ycz.pojo.Manager;
import com.ycz.pojo.Member;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        Manager manager=new Manager("老板",100000);

        List<Member> memberList=new ArrayList<>();

        for (int i=0;i<4;i++){
            Member member1=new Member("小弟"+i,0);
            memberList.add(member1);
        }

        manager.sendRedEnvelopes(10000,memberList);

        manager.ViewBalance();

        for (int i = 0; i < memberList.size(); i++) {
            memberList.get(i).ViewBalance();
        }
    }



}
