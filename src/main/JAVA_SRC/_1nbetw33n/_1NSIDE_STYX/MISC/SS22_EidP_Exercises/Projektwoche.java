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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_EidP_Exercises;

@SuppressWarnings("FieldMayBeFinal")
public class Projektwoche {

    private String name;
    private Person projektleitung;
    private int maxParticipants;
    private boolean intern;

    public Projektwoche(String name, Person projektleitung){
        this.name = name;
        this.projektleitung = projektleitung;
    }

    public Projektwoche(String name, Person projektleitung, int maxParticipants, boolean intern){
        this(name, projektleitung);
        this.maxParticipants = maxParticipants;
        this.intern = intern;
    }

    protected void setMaxParticipants(int maxParticipants){this.maxParticipants = maxParticipants;}

    protected void setIntern(boolean intern){this.intern = intern;}

    protected boolean checkIfBigEnough(int NoOfStudents){return this.maxParticipants <= NoOfStudents;}

    public String toString(){return this.name + " | " + this.projektleitung;}

}
