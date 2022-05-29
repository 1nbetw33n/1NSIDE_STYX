 
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
//created by 0x1nbetw33n on 29/05/2022
//
 package _1nbetw33n._1NSIDE_STYX.MISC.Sägewerk2;

 public class Saegewerk {


     public static void main(String[] args) {

         Saege stichsaege = new Stichsaege();
         Saege kettensaege = new Kettensaege();
         Baumstamm eiche = new Eichenstamm(5.);
         Baumstamm buche = new Buchenstamm(7.);

         stichsaege.saegen(eiche, 1.);
         kettensaege.saegen(buche, 2.);

         System.out.println("Eiche hat ein Restgewicht von " + eiche.gewicht());
         System.out.println("Eiche hat ein Restgewicht von " + buche.gewicht());
     }

 }