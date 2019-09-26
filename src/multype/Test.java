package multype;

/**
 * Created by sunnyDay on 2019/9/26 17:11
 * 匿名内部类栗子
 */
public class Test {
    public static void main(String[] args) {

         //1、 new 抽象类
        new Animal(){
            @Override
            void run() {
                System.out.println("1");
            }
        }.run();

        //2、 new 接口
        new MyInterface(){
            @Override
            public void doSome() {
                System.out.println("接口的实现");
            }
        }.doSome();

        //3、 new 普通类
       new Fish(){
           @Override
           void run() {
               System.out.println("2");
           }
       }.run();


       // demo
       class Person extends Animal{//继承方式
           @Override
           void run() {
               System.out.println("人可以走可以跑");
           }
       }

       Person person  = new Person();

      /*  书写方式：
        1、new 抽象类构造器 实现抽象方法（直接带方法体，方法体内实现）
        2 、new 接口 ，实现接口的方法（（直接带方法体，方法体内实现））
        3、new 某一个普通类的构造器，后跟方法体。

        以上三种方式和 继承（如上demo）或者实现接口创建子类的区别：

         1、 两种类都是局部内部类，只是匿名内部类属于“特殊的局部内部类”
         2、  局部内部类有类名，匿名内部类没有。
        */

    }
}
