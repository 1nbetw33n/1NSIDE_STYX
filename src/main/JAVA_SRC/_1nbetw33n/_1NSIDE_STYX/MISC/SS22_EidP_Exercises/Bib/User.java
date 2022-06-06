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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_EidP_Exercises.Bib;

/*
 * Created by 0x1nbetw33n on 06/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import _1nbetw33n._1NSIDE_STYX.MISC.SS22_EidP_Exercises.Person;

public class User extends Person {

    private static int objectCounter = 1;
    private int id;
    private final Media[] lentObjects = new Media[10];

    public User(String name, int birthyear) {
        super(name, birthyear);
        id = objectCounter++;
    }

    public Media[] lentList(){return lentObjects;}

    public void lendMedia(Media media) {
        if (media.getOwner() != null) {throw new IllegalStateException("Media cant lent because somebody else already lent it");}
        for (int i = 0; i < lentObjects.length; i++) {
            if (lentObjects[i] == null) {lentObjects[i] = media;}
            media.setOwner(this);
            break;
        }
    }

    private boolean containsMedia(Media media){
        for (Media m : lentObjects){if (m.equals(media)){return true;}}
        return false;
    }

    public void returnMedia(Media media){
        if (!containsMedia(media)){throw new IllegalStateException("Media cant be returned that ain't lent");}
        for (int i = 0; i < lentObjects.length; i++){
            if (lentObjects[i].equals(media)){
                media.setOwner(null);
                lentObjects[i] = null;
                break;
            }
        }
    }

    public void returnAllMedia(Media media){
        for (int i = 0; i < lentObjects.length; i++){
            if (lentObjects[i] != null){
                media.setOwner(null);
                lentObjects[i] = null;
            }
        }
    }

    public void printLentObjects(){for(Media m : lentObjects){System.out.println(m);}}

}