package chapter4;

/**
 * @author zombie
 * 构造方法和普通方法重载
 */
public class Tree {
    static void print(String s){
        System.out.println(s);
    }
    int height;
    Tree(){
        print("planting seedling");
        height = 0;
    }
    Tree(int i){
        print("tree is " + i + "feet tall");
    }
}
