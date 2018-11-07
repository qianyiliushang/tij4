package chapter3;

/**
 * @author
 * @date 2018/9/7
 * 对象引用别名
 */
public class PassObject {
    /**
     * 方法直接改变了参数传进来的对象
     * @param y Letter对象
     */
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1, x.c: " + x.c);
        f(x);
        System.out.println("2, x.c: " + x.c);
    }
}

class Letter{
    char c;
}
