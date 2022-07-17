package Test;/*
 @author ycz
 @date 2021-09-16-16:46  
*/

import com.ycz.pojo.car.Benz;
import com.ycz.pojo.car.Bmw;
import com.ycz.pojo.car.Bsj;
import com.ycz.pojo.car.car;

public class carTest {

    public static void main(String[] args) {

       car car= getRandomCar();
        car.move();

    }

    private static car getRandomCar() {
        int num=(int)Math.round(Math.random()*2);

        if (num==1){
            Benz benz=new Benz("benz","红色");
            return benz;
        }else if(num==2){
            Bsj bsj=new Bsj("Bsj","黄色");
            return bsj;
        }else {
            Bmw bmw=new Bmw("Bmw","白色");
            return bmw;
        }

    }


}
