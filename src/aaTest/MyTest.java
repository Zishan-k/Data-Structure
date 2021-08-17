package aaTest;

import Util.Util;

public class MyTest {
    String str1;
    MyTest(){}
    MyTest(String str){
        this.str1 = str;
    }

    @Override
    public String toString() {
        return "Object name :" + this.str1;
    }

    private void printCombinations(String str, int i){
        if(i == str.length()-1){
            System.out.println(str);
            return;
        }

        for (int j = i; j < str.length(); j++) {
            str = Util.swap(str, i, j);
            printCombinations(str, i+1);
            str = Util.swap(str, i, j);
        }
    }

    public static void main(String[] args) {
        MyTest mt = new MyTest("mtobject");
        MyTest mt1 = new MyTest("mtobject222222");
        mt.printCombinations("ABC", 0);

        System.out.println(mt);
        System.out.println(mt1);
    }
}
