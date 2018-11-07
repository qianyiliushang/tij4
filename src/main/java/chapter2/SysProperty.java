package chapter2;

import java.util.Date;
import java.util.Properties;

/**
 * @author zombie
 * @date 2018/9/7
 * 获取系统属性
 */
public class SysProperty {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties properties = System.getProperties();
        properties.list(System.out);
        System.out.println("Memory usage: ");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("total memory:" + runtime.totalMemory()/1024/1024 + "M\n"
                + "Free memory:" + runtime.freeMemory()/1024/1024 + "M\n"
        );
    }
}
