package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-15-16:00  
*/

import java.util.List;

public interface RedEnvelopes {
     void  sendRedEnvelopes(double money, List<Member> memberList);

     void ReceiveRedEnvelopes(String username,double money);
}
