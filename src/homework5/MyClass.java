/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author kjx33
 */
class Value {
    private int x, y;
    public void setValue(int a, int b) {
        x=a;
        y=b;
    }
    public int getTotal(){
        return x+y;
    }
}

public class MyClass {
    static int num=0;
    public static void main(String args[]) {
        int total;
        System.out.println(num);
        Value v = new Value();
        v.setValue(24, 65);
        total=v.getTotal();
        System.out.println("add="+total);
        getNum();
        System.out.println(num);
    }
    public static int getNum() {
        num ++;
        return num;
    }
}

