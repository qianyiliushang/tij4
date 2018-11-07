package chapter2;

public class GetThirdArgs {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("no args");
        }else if (args.length < 3){
            System.out.println("less than 3 args");
        }else {
            System.out.println(args[2]);
        }
    }
}
