package Lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public  static  int someMethod(String str){
        System.out.println("hi "+str);
        return 28;
    }
    public  static  void  main(String args[]){
        SayableImpl sayable=new SayableImpl();
        sayable.say();
        Sayable s1=()->{
            System.out.println("your'e saying something");
        };
        s1.say();

        Predicate<Integer> pr1=(tInt)->(tInt>10);
        System.out.println(pr1.test(19));

        Function<String,Integer> salution=(name)->{
            System.out.println("how are you "+name);
            return 20;
        };
        int val=salution.apply("abdul");
        System.out.println("the value is "+val);
        Function<String ,Integer> sal=LambdaDemo::someMethod;
        int val1=sal.apply("ANSARI");


    }
}
