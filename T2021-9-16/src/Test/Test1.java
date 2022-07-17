package Test;/*
 @author ycz
 @date 2021-09-16-16:29  
*/

import com.ycz.pojo.Cat;
import com.ycz.pojo.Dog;
import com.ycz.pojo.Person;
import com.ycz.pojo.Pet;

import java.util.ArrayList;
import java.util.List;

public class Test1 {


    public static void main(String[] args) {
        Pet cat=new Cat("wjb",22);
        Pet dog=new Dog("cqs",22);

        cat.eat();
        dog.eat();

        List<Pet> petList=new ArrayList<>();
        petList.add(cat);
        petList.add(dog);

        Person person=new Person("ycz",petList);

        person.feed();
    }


}
