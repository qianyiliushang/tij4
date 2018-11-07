package chapter3;

/**
 * @author zombie
 * 对象等于判断
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf("47");
        Integer n2 = Integer.valueOf("47");
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));
        System.out.println("=============");
        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1.equals(i2));
    }
}
