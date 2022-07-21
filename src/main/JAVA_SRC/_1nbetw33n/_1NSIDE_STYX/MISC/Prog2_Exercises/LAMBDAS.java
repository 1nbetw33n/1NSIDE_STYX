
/*
 *
 * copyright (c) 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 * All rights reserved
 *
 * This software is the confidential and proprietary information of
 * 1nbetw33n Labs. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * 1nbetw33n Labs.
 *
 */

package _1nbetw33n._1NSIDE_STYX.MISC.Prog2_Exercises;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.*;
import java.util.function.Predicate;

public class LAMBDAS{

    static int ggT(int no1, int no2){
        int max = Math.max(no1, no2);
        int min = Math.min(no1, no2);
        int remainder = 0;
        while (min > 0 ){
            remainder = Math.max(min, max) % Math.min(min, max);
            max = Math.min(min, max);
            min = remainder;
        }
        return max;
    }

    static boolean isPrime(int possiblePrime){
        for (int i = 2; i < possiblePrime; i++) {
            if(ggT(possiblePrime, i) != 1){
                return false;
            }
        }
        return true;
    }

    static void printPrimes(List<? extends Integer> list){
        list.stream().filter(LAMBDAS::isPrime).forEach(System.out::println);
    }

    static void printNotPrimes(List<? extends Integer> list){
        list.stream().filter(((Predicate<Integer>) LAMBDAS::isPrime).negate()).forEach(System.out::println);
    }

    static void greet(List<? super String> list){
        list.forEach(name -> System.out.println("hello " + name));
    }

    //copy datastructure from source to target
    static <T> void copyDatastructure(List<? extends T> source, List<? super T> target){
        for (T t : source) {
            target.add(t);
        }
    }

    static void copyLighterThan(List<? extends Portable> source, List<? super Portable> target, double threshold){
        for (Portable portable : source) {
            if(portable.getWeight() < threshold){target.add(portable);}
        }
    }

    public static void main(String[] args) {

        Integer[] ints = new Integer[100];
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 1;
        }
        printPrimes(Arrays.asList(ints));
        printNotPrimes(Arrays.asList(ints));

        List<? super String> names = Arrays.asList("purp", "pinq", "cyan");
        greet(names);

        Map<? super String, ? super Integer> data = new HashMap<>();
        data.put("purp", 932);
        data.put("pinq", 23);
        data.put("cyan", 523);
        data.forEach((name, no) -> System.out.println(name + " | "  + no));

        Pen pen = new Pen();
        pen.setWeight(10.);
        Cup cup = new Cup();
        cup.setWeight(100.);


        List<? extends Portable> src = Arrays.asList(pen, cup);
        List<? super Portable> dst = new ArrayList<>();

        copyLighterThan(src, dst, 20.);
        System.out.println(dst.size());
        Object result = dst.get(0);

        Integer[] source = {1, 2, 3, 4};
        Integer[] target = new Integer[4];
        List<? extends Integer> intList1 = Arrays.asList(source);
        List<? extends Integer> intList2 = Arrays.asList(target);


        //copyDatastructure(intList1, intList2);

       intList2.forEach(System.out::println);


    }




}

