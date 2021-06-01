/*
 *  copyright (c) 2021 se1_team20.
 *  Planet Earth, Milky Way, Virgo Supercluster.
 *  All rights reserved.
 *
 *  part of team20:
 *
 *  1nbetw33n
 *  Masternuss
 *  Preet149
 *  Rahgawi
 *
 * This software is the confidential and proprietary information of
 * se1_team20. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * se1_team20.
 *
 */

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO3;

import java.util.Arrays;

public class Person implements StringToObjectTransformable {

    private String salutation;
    private String title;
    private String firstName;
    private String lastName;
    private String organisation;
    private String department;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String town;


    Person (@org.jetbrains.annotations.NotNull final String INPUT){
        /*QUICK AND DIRTY*/
        String[] inputs                  = INPUT.split(",");

        /* removing leading whitespaces */
        for (int i = 1; i < inputs.length; i++){
            inputs[i] = inputs[i].replaceFirst(" ", "");
        }

        String[] personalInfos           = inputs[0].split(" ");
        String[] organisationInfosP1     = inputs[3].split(" ");
        String[] organisationInfosP2     = inputs[4].split(" ");
        String[] townInfosWithoutZIPCODE = Arrays.copyOfRange(organisationInfosP2, 1, organisationInfosP2.length);
        String   townName                = "";

        /* removing leading whitespaces */
        for (int i = 0; i < personalInfos.length; i++){
            personalInfos[i] = personalInfos[i].replaceFirst(" ", "");
        }

        /* removing zip code */
        for (int j = 0; j < townInfosWithoutZIPCODE.length; j++){
            townName = (j < townInfosWithoutZIPCODE.length - 1) ? townName + townInfosWithoutZIPCODE[j] + " " : townName + townInfosWithoutZIPCODE[j];
        }

        this.salutation  = personalInfos[0];
        this.title       = personalInfos[1];
        this.firstName   = personalInfos[2];
        this.lastName    = personalInfos[3];
        this.organisation= inputs[1];
        this.department  = inputs[2];
        this.street      = organisationInfosP1[0];
        this.houseNumber = organisationInfosP1[1];
        this.zipCode     = organisationInfosP2[0];
        this.town        = townName;
    }


    final public String getSalutation() {
        return this.salutation;
    }


    final public String getTitle() {
        return this.title;
    }


    final public String getFirstName() {
        return this.firstName;
    }


    final public String getLastName() {
        return this.lastName;
    }


    final public String getOrganisation() {
        return this.organisation;
    }


    public String getDepartment() {
        return this.department;
    }


    final public String getStreet() {
        return this.street;
    }


    final public String getHouseNumber() {
        return this.houseNumber;
    }


    final public String getZIPCode() {
        return this.zipCode;
    }


    final public String getTown() {
        return this.town;
    }
}
