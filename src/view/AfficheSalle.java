package view;
/***********************************************************************
 * Module:  AfficheSalle.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficheSalle
 ***********************************************************************/

import java.util.*;

import shared.Salle;

/** @pdOid 8d52d39a-25f7-4870-a779-66e4c517a8c6 */
public class AfficheSalle {
   /** @pdRoleInfo migr=no name=Salle assc=association22 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Salle> salle;
   
   /** @param salle
    * @pdOid 72fb7304-9db9-412e-a353-4e613c3be978 */
   public AfficheSalle(Salle salle) {
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