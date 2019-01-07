package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        //testNum();
        //testChar();
        //testBigDecimal();

    }

    //region array
    private static void testArray(){
        int i[];
        i = new int[5];
        int[] di;

    }
    //endregion


    private static void testBigDecimal(){
        System.out.println("不要使用 float 和 double 类型");
        System.out.println("小数必须使用BigDecimal，并且在计算的时候，必须使用字符串形式的小数例如：new BigDecimal（\"0.001\"）");
        System.out.println("BigDecimal 类似String，一旦赋值内容不可改变");
        System.out.println("Bigdecimal能表示的最大整数应该是Biginteger的最大值 \n最多能有Integer.MAX_VALUE个小数位");
        BigDecimal b = new BigDecimal(2);
        System.out.println("2:" + b);
        b = b.add(new BigDecimal(0.001));
        System.out.println("2 + 0.001 is wrong : " + b.toString());
        b = new BigDecimal(2);
        b = b.add(new BigDecimal("0.001"));
        System.out.println("b = b + \"0.001\" is right : " + b);
        b = new BigDecimal(1);
        b = b.divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
        System.out.println("1/3 指定保留两位小数四舍五入  b = b.divide(new BigDecimal(3, 2, RoundingMode.HALF_UP)); :" + b);

    }
    private static void testChar(){
        char c = 97;
        System.out.println("char 97 :" + c);
        char c1 = 'a';
        System.out.println("c1:" + c1);
        char c2 = '\"';
        System.out.println("c2 = \"\\\" : " + c2);
    }
    private static void testNum(){
        System.out.println("long int max:" + Long.MAX_VALUE);
        System.out.println("int max:" + Integer.MAX_VALUE);
        System.out.println("shot max:" + Short.MAX_VALUE);
        int i = Integer.MAX_VALUE;
        i++;
        System.out.println("int max ++ :" + i);
    }
}
