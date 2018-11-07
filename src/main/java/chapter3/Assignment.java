package chapter3;

/**
 * @author zombie
 * @date 变量赋值及对象引用
 */
public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1, n1.i:" + n1.i + "\t"
                + "n2.i:" + n2.i
        );

        n1 = n2;
        System.out.println("2, n1.i:" + n1.i + "\t"
                + "n2.i:" + n2.i
        );
        n1.i = 27;
        System.out.println("3, n1.i:" + n1.i + "\t"
                + "n2.i:" + n2.i
        );
    }
}

class Number {
    int i;
}
