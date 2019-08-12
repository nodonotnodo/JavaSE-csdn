package extens;

public class Solution {

    public static void main(String[] args) {

        Son son = new Son();

//        子类拥有父类的公有属性，并且可以调用父类的公有方法
        System.out.println(son.fpublic);
        son.fbprint();

//        尝试打印父类的私有属性，并且调用父类的私有方法
//        System.out.println(son.fprivate);//子类对象无法调用父类的私有属性
//        son.fprivate;//子类对象无法调用父类私有方法

        //使用getter方法调用父类私有属性，使用子类对象可调用的父类公有方法调用父类私有方法
        System.out.println(son.getFprivate());
        son.usePrivate();

    }

}
