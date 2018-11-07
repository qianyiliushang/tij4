package chapter3;

/**
 * @author zombie
 * 字面值，不同进制表示
 */
public class Literals {
    public static void main(String[] args) {
        //最大字符
        char c = 0xffff;
        //最大byte
        byte b = 0x7f;
        //最大short
        short s = 0x7fff;
        int i1 = 0x2f;
        int i2 = 0X2f;
        int i3 = 0177;
        //八进制和十六进制对long类型也生效
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1f;
        float f3 = 3F;
        float f4 = 1e-45f;
        float f5 = 1e+9f;
        double d1 = 1d;
        double d2 = 1D;
        double d3 = 47e47d;


        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
