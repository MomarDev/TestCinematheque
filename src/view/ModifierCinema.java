package view;
/***********************************************************************
 * Module:  ModifierCinema.java
 * Author:  Lenovo
 * Purpose: Defines the Class ModifierCinema
 ***********************************************************************/


import java.util.*;

import shared.Cinema;

/** @pdOid 88f53cc7-42e2-4871-abf8-89e07d353e9d */
public class ModifierCinema {
   /** @pdRoleInfo migr=no name=Cinema assc=association24 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Cinema> cinema;
   
   /** @param cinema
    * @pdOid 9bcb99ea-960b-46ac-af2c-5d36bab31ca6 */
   public ModifierCinema(Cinema cinema) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Cinema> getCinema() {
      if (cinema == null)
         cinema = new java.util.ArrayList<Cinema>();
      return cinema;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCinema() {
      if (cinema == null)
         cinema = new java.util.ArrayList<Cinema>();
      return cinema.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCinema */
   public void setCinema(java.util.List<Cinema> newCinema) {
      removeAllCinema();
      for (java.util.Iterator iter = newCinema.iterator(); iter.hasNext();)
         addCinema((Cinema)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCinema */
   public void addCinema(Cinema newCinema) {
      if (newCinema == null)
         return;
      if (this.cinema == null)
         this.cinema = new java.util.ArrayList<Cinema>();
      if (!this.cinema.contains(newCinema))
         this.cinema.add(newCinema);
   }
   
   /** @pdGenerated default remove
     * @param oldCinema */
   public void removeCinema(Cinema oldCinema) {
      if (oldCinema == null)
         return;
      if (this.cinema != null)
         if (this.cinema.contains(oldCinema))
            this.cinema.remove(oldCinema);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCinema() {
      if (cinema != null)
         cinema.clear();
   }

}