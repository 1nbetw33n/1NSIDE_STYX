 
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
 import java.util.function.Function;

 public class ACAT4_2 {

     private static double x0;
     private static double eps;


     private static void setUpDelta() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter x0\n");
         x0 = sc.nextDouble();
         System.out.println("Enter epsilon\n");
         eps = sc.nextDouble();
     }


     private static void tearDownDeltas() {
         x0 = 0;
         eps = 0;
     }

     private static double delta1(double x0, double eps) {
         if (!(eps > 0)) {
             throw new IllegalArgumentException("eps shall be >0");
         }
         return Math.min(1, eps / (19 + 18 * Math.abs(x0)));
     }

     private static double delta2(double x0, double eps) {
         if (!(x0 > 0) || !(eps > 0)) {
             throw new IllegalArgumentException("x0 shall be ∈ ℝ+ AND eps shall be > 0");
         }
         return Math.min(1, (eps * Math.sqrt(19 * x0 + 18)) / 19);
     }

     private double eval(double x) {
         return 0.;
     }

     private static void testDelta1() {
         setUpDelta();
         System.out.println(delta1(x0, eps));
         tearDownDeltas();
     }

     private static void testDelta2() {
         setUpDelta();
         System.out.println(delta2(x0, eps));
         tearDownDeltas();
     }

     public static void main(String[] args) {
         //testDelta1();
         // testDelta2();
         double a = 1e-6;
         double b = 1E-6;
         System.out.println(a + " | " + b);
         //System.out.println(nullstelleIterative());
     }
 }




