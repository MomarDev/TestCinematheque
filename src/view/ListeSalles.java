package view;
/***********************************************************************
 * Module:  ListeSalles.java
 * Author:  Lenovo
 * Purpose: Defines the Class ListeSalles
 ***********************************************************************/

import java.util.*;

import shared.Salle;

/** @pdOid cdc04862-9333-4d32-b552-2bd012b2c251 */
public class ListeSalles {
   /** @pdRoleInfo migr=no name=Salle assc=association20 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Salle> salles;
   
   /** @param salles
    * @pdOid dc1cf6c2-3271-4880-95fd-ff0966da453e */
   public ListeSalles(java.util.List<Salle> salles) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Salle> getSalle() {
      if (salles == null)
         salles = new java.util.ArrayList<Salle>();
      return salles;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSalle() {
      if (salles == null)
         salles = new java.util.ArrayList<Salle>();
      return salles.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSalle */
   public void setSalle(java.util.List<Salle> newSalle) {
      removeAllSalle();
      for (java.util.Iterator iter = newSalle.iterator(); iter.hasNext();)
         addSalle((Salle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSalle */
   public void addSalle(Salle newSalle) {
      if (newSalle == null)
         return;
      if (this.salles == null)
         this.salles = new java.util.ArrayList<Salle>();
      if (!this.salles.contains(newSalle))
         this.salles.add(newSalle);
   }
   
   /** @pdGenerated default remove
     * @param oldSalle */
   public void removeSalle(Salle oldSalle) {
      if (oldSalle == null)
         return;
      if (this.salles != null)
         if (this.salles.contains(oldSalle))
            this.salles.remove(oldSalle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSalle() {
      if (salles != null)
         salles.clear();
   }

}