package view;
/***********************************************************************
 * Module:  ListeCinemas.java
 * Author:  Lenovo
 * Purpose: Defines the Class ListeCinemas
 ***********************************************************************/

import java.util.*;

import shared.Cinema;

/** @pdOid 85e10dde-15bf-49a8-83a6-9edf10e99e0b */
public class ListeCinemas {
   /** @pdRoleInfo migr=no name=Cinema assc=association23 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Cinema> cinemas;
   
   /** @param cinemas
    * @pdOid bbd9655c-8b4a-4685-a1a9-f9a9b8f201c8 */
   public ListeCinemas(java.util.List<Cinema> cinemas) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Cinema> getCinema() {
      if (cinemas == null)
         cinemas = new java.util.ArrayList<Cinema>();
      return cinemas;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCinema() {
      if (cinemas == null)
         cinemas = new java.util.ArrayList<Cinema>();
      return cinemas.iterator();
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
      if (this.cinemas == null)
         this.cinemas = new java.util.ArrayList<Cinema>();
      if (!this.cinemas.contains(newCinema))
         this.cinemas.add(newCinema);
   }
   
   /** @pdGenerated default remove
     * @param oldCinema */
   public void removeCinema(Cinema oldCinema) {
      if (oldCinema == null)
         return;
      if (this.cinemas != null)
         if (this.cinemas.contains(oldCinema))
            this.cinemas.remove(oldCinema);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCinema() {
      if (cinemas != null)
         cinemas.clear();
   }

}