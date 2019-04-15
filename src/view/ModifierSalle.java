package view;
/***********************************************************************
 * Module:  ModifierSalle.java
 * Author:  Lenovo
 * Purpose: Defines the Class ModifierSalle
 ***********************************************************************/

import java.util.*;

import shared.Salle;

/** @pdOid 767a718f-3bf8-48f8-b13d-b818d4f683eb */
public class ModifierSalle {
   /** @pdRoleInfo migr=no name=Salle assc=association21 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Salle> salle;
   
   /** @param salle
    * @pdOid a5f74339-adec-4834-a0a1-5179e3f55863 */
   public ModifierSalle(Salle salle) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Salle> getSalle() {
      if (salle == null)
         salle = new java.util.ArrayList<Salle>();
      return salle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSalle() {
      if (salle == null)
         salle = new java.util.ArrayList<Salle>();
      return salle.iterator();
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
      if (this.salle == null)
         this.salle = new java.util.ArrayList<Salle>();
      if (!this.salle.contains(newSalle))
         this.salle.add(newSalle);
   }
   
   /** @pdGenerated default remove
     * @param oldSalle */
   public void removeSalle(Salle oldSalle) {
      if (oldSalle == null)
         return;
      if (this.salle != null)
         if (this.salle.contains(oldSalle))
            this.salle.remove(oldSalle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSalle() {
      if (salle != null)
         salle.clear();
   }

}