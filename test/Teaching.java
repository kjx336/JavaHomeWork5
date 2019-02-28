/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
class Teacher{
    static String TeacherName;
    static String Title;
    Teacher(String a,String b){
        TeacherName = a;
        Title = b;
    }
}
class Class{
    static String ClassName;
    static int Score;
    Class(String a,int b){
        ClassName = a;
        Score = b;
    }
}
public class Teaching {
    public int Number;
    public String Place;
    Teaching(String a,String b,String c,int d,int e,String f){
        Teacher myTeacher = new Teacher(a,b);
        Class myClass = new Class(c,d);
        this.Number = e;
        this.Place = f;
    }
    public String GetTeacherName(){
            return Teacher.TeacherName;
        }
    public String GetTitle(){
            return Teacher.Title;
        }
    public String GetClassName(){
            return Class.ClassName;
        }
    public int GetScore(){
            return Class.Score;
        }
    
}
