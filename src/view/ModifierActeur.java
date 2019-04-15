package view;
/***********************************************************************
 * Module:  ModifierActeur.java
 * Author:  Lenovo
 * Purpose: Defines the Class ModifierActeur
 ***********************************************************************/


import java.util.*;

import shared.Acteur;

/** @pdOid dcb8ec83-9099-46c6-8ae4-c8d61bd4ad31 */
public class ModifierActeur {
   /** @pdRoleInfo migr=no name=Acteur assc=Association_15 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Acteur> acteur;
   
   /** @param acteur
    * @pdOid 49a76cf9-dc2f-4ac9-b779-a2f18c0a1cd9 */
   public ModifierActeur(Acteur acteur) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Acteur> getActeur() {
      if (acteur == null)
         acteur = new java.util.ArrayList<Acteur>();
      return acteur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorActeur() {
      if (acteur == null)
         acteur = new java.util.ArrayList<Acteur>();
      return acteur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newActeur */
   public void setActeur(java.util.List<Acteur> newActeur) {
      removeAllActeur();
      for (java.util.Iterator iter = newActeur.iterator(); iter.hasNext();)
         addActeur((Acteur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newActeur */
   public void addActeur(Acteur newActeur) {
      if (newActeur == null)
         return;
      if (this.acteur == null)
         this.acteur = new java.util.ArrayList<Acteur>();
      if (!this.acteur.contains(newActeur))
         this.acteur.add(newActeur);
   }
   
   /** @pdGenerated default remove
     * @param oldActeur */
   public void removeActeur(Acteur oldActeur) {
      if (oldActeur == null)
         return;
      if (this.acteur != null)
         if (this.acteur.contains(oldActeur))
            this.acteur.remove(oldActeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllActeur() {
      if (acteur != null)
         acteur.clear();
   }

}