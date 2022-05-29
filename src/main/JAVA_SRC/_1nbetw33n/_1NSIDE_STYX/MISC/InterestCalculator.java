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
24.Mar.2022
*/

public class InterestCalculator {

    @SuppressWarnings("unused")
    private static double calculateInterest(final double TOTAL_AMOUNT, final double ANNUAL_INTEREST_RATE, final double ANNUAL_REPAYMENT_RATE){
        double annualInterestRatePercentage = ANNUAL_INTEREST_RATE / 100;
        double annualRepaymentAmount = TOTAL_AMOUNT * ANNUAL_REPAYMENT_RATE / 100;
        double remainingAmount = TOTAL_AMOUNT;
        double compoundedInterest = 0.;
        int yearCounter = 0;
        while (remainingAmount > 0.001) {
            compoundedInterest += (remainingAmount * annualInterestRatePercentage);
            remainingAmount -= annualRepaymentAmount;
            yearCounter++;
            if (yearCounter == 20){
                annualRepaymentAmount *= 2;
            }
        }
        return compoundedInterest;
    }

    @SuppressWarnings("SameParameterValue")
    private static double calculateCompoundedInterest(final double ANNUAL_INTEREST_RATE , final double INVESTMENT, final int INVESTMENT_HORIZON) {
        int yearCounter = 0;
        double compoundedInterest = INVESTMENT;
        while(yearCounter < INVESTMENT_HORIZON) {
            yearCounter++;
            compoundedInterest *= ANNUAL_INTEREST_RATE;
        }
        return compoundedInterest;
    }

    public static void main(String[] args) {
        //System.out.println(calculateInterest(1000000., 1.5, 2.));
        System.out.println(calculateCompoundedInterest(1.15, 10000., 10));
    }

}
