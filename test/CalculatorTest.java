/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kjx33
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Begin(){
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入两个数"+"\n"+"请输入第一个数：");
        try{
            //Junit不支持从控制台输入的方法
            //int a = Integer.parseInt(bufferedReader.readLine());
            //String str2 = bufferedReader.readLine();
            //int b = Integer.parseInt(str2);
            float a=2;
            float b=5;
            Calculator Cal = new Calculator(a,b);
            System.out.println(Cal.Add());
            System.out.println(Cal.Minus());
            System.out.println(Cal.Multiply());
            System.out.println(Cal.Divide());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void begin(){
        try{
            String a,b,c,f;
            int d,e;
            a = "张建林";
            b = "讲师";
            c = "信管";
            d = 100;
            e = 30;
            f = "510";
            Teaching teach = new Teaching(a,b,c,d,e,f);
            System.out.println(teach.GetTeacherName());
            System.out.println(teach.GetTitle());
            System.out.println(teach.GetClassName());
            System.out.println(teach.GetScore());
        }catch(Exception e){
            e.printStackTrace();
        }
}
    
    
    
}
