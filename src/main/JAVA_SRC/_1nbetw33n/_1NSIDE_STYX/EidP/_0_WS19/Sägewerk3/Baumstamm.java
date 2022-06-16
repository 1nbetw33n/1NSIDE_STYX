 
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
 package _1nbetw33n._1NSIDE_STYX.EidP._0_WS19.Sägewerk3;

 public abstract class Baumstamm {

  private double laenge;
  private String name;

  public Baumstamm(double laenge) {this.laenge = laenge;}

  void kuerzen(double laenge){this.laenge -= laenge;}

  abstract double gewicht();

  public double getLaenge(){return laenge;}

  public void setName(String name){this.name = name;}

  public String getName(){return name;}
 }