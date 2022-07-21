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

package _1nbetw33n._1NSIDE_STYX.MISC;
/*
1nbetw33n
12.Apr.2022
*/


import java.math.BigDecimal;
import java.math.BigInteger;

public class Fib_IterativeVsExplicit {

    private static class
    FibException extends Exception{
        private static final long serialVersionUID = 1L;
        public FibException(){
            super("n needs to be equal or greater than 0");
        }
    }

@SuppressWarnings("UnusedReturnValue")
private static long fibIterative(int n) throws FibException {
    if (n < 0) {
        throw new FibException();
    } else {
        long fib0 = 0,
                fib1 = 1,
                fibN = 1;
        for (int i = 1; i < n; i++) {
            fibN = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibN;
        }
        return fibN;
    }
}

@SuppressWarnings("UnusedReturnValue")
private static BigInteger fibIterativeBIG(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        BigInteger   fib0 = BigInteger.valueOf(0),
                            fib1 = BigInteger.valueOf(1),
                            fibN = BigInteger.valueOf(1);
        for (int i = 1; i < n; i++){
            fibN = fib0.add(fib1);
            fib0 = fib1;
            fib1 = fibN;
        }
        return fibN;
    }
}

    /*
            double firstTerm = 1 / Math.sqrt(5);
            double leftInnerTerm = (1 + Math.sqrt(5)) / 2;
            double rightInnerTerm = (1 - Math.sqrt(5)) / 2;
            double rightTerm = Math.pow(leftInnerTerm, n) - Math.pow(rightInnerTerm, n);
            return (long) (firstTerm * rightTerm);
*/
@SuppressWarnings("UnusedReturnValue")
private static long fibExplicit(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        return (long) (((1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n))));
    }
}

/*
        BigDecimal firstTerm = BigDecimal.valueOf(1 / Math.sqrt(5));
        BigDecimal leftInnerTerm = BigDecimal.valueOf((1 + Math.sqrt(5)) / 2);
        BigDecimal rightInnerTerm = BigDecimal.valueOf((1 - Math.sqrt(5)) / 2);
        BigDecimal rightTerm = leftInnerTerm.pow(n).subtract(rightInnerTerm.pow(n));
        return firstTerm.multiply(rightTerm).toBigInteger();
 */
@SuppressWarnings("UnusedReturnValue")
private static BigInteger fibExplicitBIG(int n) throws FibException {
    if(n < 0){
        throw new FibException();
    } else {
        return BigDecimal.valueOf(1 / Math.sqrt(5)).multiply(BigDecimal.valueOf((1 + Math.sqrt(5)) / 2).pow(n).subtract(BigDecimal.valueOf((1 - Math.sqrt(5)) / 2).pow(n))).toBigInteger();
    }
}

    private static void iterativeVsExplicit(int n) throws FibException {
        long time0,
                time1 = 0,
                time2 = 0;
        for(int i = 0; i < 50; i++){
            time0 = System.nanoTime();
            fibIterative(n);
            time1 += System.nanoTime() - time0;
            time0 = System.nanoTime();
            fibExplicit(n);
            time2 += System.nanoTime() - time0;
        }
        System.out.println("iterative: " + time1 + " ns | explicit: " + time2 + " ns");
    }

private static void iterativeBIGVsExplicitBIG(int n) throws FibException {
    long time0,
            time1 = 0,
            time2 = 0;
    for(int i = 0; i < 50; i++){
        time0 = System.nanoTime();
        fibIterativeBIG(n);
        time1 += System.nanoTime() - time0;
        time0 = System.nanoTime();
        fibExplicitBIG(n);
        time2 += System.nanoTime() - time0;
    }
    System.out.println("iterativeBIG: " + time1 + " ns | explicitBIG: " + time2 + " ns");
}

    @SuppressWarnings("CommentedOutCode")
    public static void main(String[] args) throws Exception {
        int n = 39;
        iterativeVsExplicit(n);
        iterativeBIGVsExplicitBIG(n);
        //System.out.println(fibIterative(n));
        //System.out.println(fibExplicit(n));
        //System.out.println(fibIterativeBIG(n));
        //System.out.println(fibExplicitBIG(n));
    }
}
