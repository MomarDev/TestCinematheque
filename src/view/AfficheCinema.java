package view;
/***********************************************************************
 * Module:  AfficheCinema.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficheCinema
 ***********************************************************************/

import java.util.*;

import shared.Cinema;

/** @pdOid 2eb8927d-165b-4d7d-90db-6e8a1a193782 */
public class AfficheCinema {
   /** @pdRoleInfo migr=no name=Cinema assc=association25 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Cinema> cinema;
   
   /** @param cinema
    * @pdOid 170d5d82-a649-483d-874c-523beabd9999 */
   public AfficheCinema(Cinema cinema) {
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