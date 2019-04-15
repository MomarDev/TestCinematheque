package view;
/***********************************************************************
 * Module:  AfficherActeur.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficherActeur
 ***********************************************************************/

import java.util.*;

import shared.Acteur;

/** @pdOid 23b9ea95-fdd2-4a01-9d46-ff0ca7c53a87 */
public class AfficherActeur {
   /** @pdRoleInfo migr=no name=Acteur assc=Association_14 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Acteur> acteur;
   
   /** @param acteur
    * @pdOid 493a6458-04f6-48f0-b4b4-e33682db7d5f */
   public AfficherActeur(Acteur acteur) {
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