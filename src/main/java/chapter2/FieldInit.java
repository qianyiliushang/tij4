package chapter2;

/**
 * @author zombie
 * @date 2018/9/7
 */
public class FieldInit {
    int x;

    public static void main(String[] args) {
        // 局部变量(方法中)没有初始值，而类的成员变量是有初始值的
        //下面的y没有初始化，会在编译器报错
        //int y;
        FieldInit baseType = new FieldInit();
        System.out.println(baseType.x);
       // System.out.println(y);
    }
}
