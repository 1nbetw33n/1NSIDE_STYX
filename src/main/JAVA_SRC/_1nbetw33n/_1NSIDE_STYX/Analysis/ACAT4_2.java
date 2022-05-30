 
 /*
  *  copyright (c) 2021 1nbetw33n Labs.
  *  Planet Earth, Milky Way, Virgo Supercluster.
  *  All rights reserved.
  *
  * This software is the confidential and proprietary information of
  * 1nbetw33n Labs. ("Confidential Information"). You shall not disclose
  * such Confidential Information and shall use it only in accordance
  * with the terms of the license agreement you entered into with
  * 1nbetw33n Labs.
  *
  */

 //
//created by 0x1nbetw33n on 30/05/2022
//

 package _1nbetw33n._1NSIDE_STYX.Analysis;

 import java.util.Scanner;

 public class ACAT4_2 {

     private static double x0;
     private static double eps;


     private static void setUp(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter x0\n");
         eps = sc.nextDouble();
         System.out.println("Enter epsilon\n");
         x0 = sc.nextDouble();
     }

     private static void tearDown(){
         x0 = 0;
         eps = 0;
     }

     private static double delta1(double x0, double eps){
         if (!(eps > 0)){
             throw new IllegalArgumentException("eps shall be >0");
         }
         return Math.min(1, eps / (23 + 10 * Math.abs(x0)));
     }

     private static double delta2(double x0, double eps){
         if(!(x0 > 0) || !(eps > 0)){
             throw new IllegalArgumentException("x0 shall be ∈ ℝ+ AND eps shall be > 0");
         }
         return Math.min(1, (eps * Math.sqrt(11 * x0 + 9)) / 11);
     }

     private double eval(double x){
         return 0.;
     }

     /*
     private static double nullstelleRecursive(Function f, double a, double b){
        if (Math.abs(a-b) < 10E-6){
            if(f.eval((a - b) / 2) * f.eval(b) < 0){
                return nullstelleRecursive(f, (a + b) / 2, b);
            } else {
                return nullstelleRecursive(f, a, (a + b) / 2);
            }
        }
         return (a + b) / 2;
     }
      */

     /*
     private static double nullstelleIterative(Function f, double a, double b){
        while(Math.abs(a - b) < 10E-6){
            if(f.eval((a - b) / 2) * f.eval(b) < 0){}
                a = (a + b) / 2;
            } else {
                b = (a + b) / 2;
            }
        }
        return (a + b) / 2;
     }
      */

     private static void testDelta1(){
         setUp();
         System.out.println(delta1(x0, eps));
         tearDown();
     }

     private static void testDelta2(){
         setUp();
         System.out.println(delta2(x0, eps));
         tearDown();
     }

     public static void main(String[] args){
         //testDelta1();
         testDelta2();
     }

 }




