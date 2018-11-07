package chapter3;

import java.util.Random;

/**
 * @author zombie
 * 数值计算
 */
public class MathOps {
    static void prt(String s){
        System.out.println(s);
    }

    static void pInt(String s, int i){
        prt(s + "=" + i);
    }

    static void pFlt(String s, float f){
        prt(s + "=" + f);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int i, j, k;
        j = random.nextInt() % 100;
        k = random.nextInt() % 100;
        pInt("j",j);
        pInt("k",k);
        i=j+k;
        pInt("j + k",i);
        i = j-k;
        pInt("j-k",i);
        i = k/j;
        pInt("k/j",i);
        i = k*j;
        pInt("k*j",i);
        i = k %j;
        pInt("k%j",i);
        j %= k;
        pInt("j%=k",j);

        float u, v,w;
        v = random.nextFloat();
        w = random.nextFloat();
        pFlt("v",v);
        pFlt("w",w);
        u = v + w;
        pFlt("v + w",u);
        u = v-w;
        pFlt("v-w",u);
        u=v*w;
        pFlt("v*w",u);
        u=v/w;
        pFlt("v/w",u);

        u+=v;
        pFlt("u+=v",u);
        u-=v;
        pFlt("u-=v",u);
        u*=v;
        pFlt("u*=v",u);
        u/=v;
        pFlt("u/=v",u);
    }
}
