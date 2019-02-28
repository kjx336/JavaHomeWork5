/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
public class Calculator {  
    public static float x,y;
    Calculator(float a,float b){
        this.x = a;
        this.y = b;
    }
    public static float Add(){
        return (x+y);
    }
    public static float Minus(){
        return (x-y);
    }
    public static float Multiply(){
        return (x*y);
    }
    public static float Divide(){
        return (x/y);
    }
}
