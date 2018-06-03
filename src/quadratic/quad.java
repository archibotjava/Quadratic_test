package quadratic;

import java.io.*;
import  java.util.*;

public class quad {
   void quad(int a, int b, int c){
       //a*x^2+b*x^2+c =0 - квадратное уровнение
// Вычисляем дискрименант
       double res = (b*b) - (4*(a*c));
// есть вариант переработки с использованием swith case
// три переключатедя будут содержать три условия
// ну и если не совпадает одно из них, то будет либо прирывыние или
// выполнение условию по дефолту

       if (res>0){
           System.out.println("D>0, значит уравнение имеет два корня");
           double x1 = (-b + Math.sqrt(res))/2*a;
           double x2 = (-b - Math.sqrt(res))/2*a;
           System.out.println("Корень x1 = "+x1+" | "+"Корень x2 = "+x2);
       } else if (res==0) {
           System.out.println("D=0, значит уравнение имеет один корень");
           double x3 = -b/2*a;
           System.out.println("Корень x = "+x3);
       } else if (res<0){
           System.out.println("D<0, значит уравнение не имеет корней");
       }
       System.out.println(res);
   }
    public static void main(String[] args) {
            quad discr = new quad();
            Scanner in = new Scanner(System.in);
        System.out.println("Enter A");
        int w = in.nextInt();
        System.out.println("Enter B");
        int e = in.nextInt();
        System.out.println("Enter C");
        int r = in.nextInt();
            discr.quad(w,e,r);
    }
}
