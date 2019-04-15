package view;
/***********************************************************************
 * Module:  NouvelActeur.java
 * Author:  Lenovo
 * Purpose: Defines the Class NouvelActeur
 ***********************************************************************/


import java.util.*;

import shared.Acteur;

/** @pdOid 50ea8623-a6cf-49d5-ae70-8e71b200247f */
public class NouvelActeur {
   /** @pdRoleInfo migr=no name=Acteur assc=Association_12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Acteur> acteur;
   
   /** @pdOid c26c1eb9-abad-4b22-9004-aa9bd8bc3541 */
   public NouvelActeur() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Acteur> getActeur() {
      if (acteur == null)
         acteur = new java.util.HashSet<Acteur>();
      return acteur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorActeur() {
      if (acteur == null)
         acteur = new java.util.HashSet<Acteur>();
      return acteur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newActeur */
   public void setActeur(java.util.Collection<Acteur> newActeur) {
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
         this.acteur = new java.util.HashSet<Acteur>();
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