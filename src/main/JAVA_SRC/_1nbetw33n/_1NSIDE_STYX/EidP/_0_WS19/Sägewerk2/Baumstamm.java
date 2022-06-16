 
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

 //
//created by 0x1nbetw33n on 29/05/2022
//

 package _1nbetw33n._1NSIDE_STYX.EidP._0_WS19.Sägewerk2;

 public class Baumstamm {

     private final double laenge;
     private final double dicke;
     private double bruchfestigkeit;
     private double gewicht;


     public Baumstamm(double laenge, double dicke){
         this.laenge = laenge;
         this.dicke = dicke;
     }

     public double kuerzen(double laenge, double dicke){
         return laenge * dicke * getGewicht();
     }

     public double getLaenge(){return this.laenge;}

     public double getDicke(){return this.dicke;}

     public void setBruchfestigkeit(double bruchfestigkeit) {this.bruchfestigkeit = bruchfestigkeit;}

     public double getBruchfestigkeit() {return this.bruchfestigkeit;}

     public void setGewicht(double gewicht){this.gewicht = gewicht;}

     public double getGewicht() {return gewicht;}

 }