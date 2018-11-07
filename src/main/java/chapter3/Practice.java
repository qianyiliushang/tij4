package chapter3;

/**
 * @author zombie
 * 第三章练习题
 */
public class Practice {
    static void print100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void printWithBreak() {
        for (int i = 1; i <= 100; i++) {
            if (i == 47) {
                break;
            }
            System.out.println(i);
        }
    }

    static void printWithReturn(){
        for (int i = 1; i <= 100; i++) {
            if (i == 47) {
                return;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printWithReturn();
    }
}
