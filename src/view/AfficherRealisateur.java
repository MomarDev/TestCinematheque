package view;
/***********************************************************************
 * Module:  AfficherRealisateur.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficherRealisateur
 ***********************************************************************/

import java.util.*;

import shared.Realisateur;

/** @pdOid 9acf1486-2ed1-41f7-aec4-c1b2d6b0c9ec */
public class AfficherRealisateur {
   /** @pdRoleInfo migr=no name=Realisateur assc=association13 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Realisateur> realisateur;
   
   /** @param realisateur
    * @pdOid e1a98ce1-4217-4176-ac72-9119eca563dd */
   public AfficherRealisateur(Realisateur realisateur) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Realisateur> getRealisateur() {
      if (realisateur == null)
         realisateur = new java.util.ArrayList<Realisateur>();
      return realisateur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRealisateur() {
      if (realisateur == null)
         realisateur = new java.util.ArrayList<Realisateur>();
      return realisateur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRealisateur */
   public void setRealisateur(java.util.List<Realisateur> newRealisateur) {
      removeAllRealisateur();
      for (java.util.Iterator iter = newRealisateur.iterator(); iter.hasNext();)
         addRealisateur((Realisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRealisateur */
   public void addRealisateur(Realisateur newRealisateur) {
      if (newRealisateur == null)
         return;
      if (this.realisateur == null)
         this.realisateur = new java.util.ArrayList<Realisateur>();
      if (!this.realisateur.contains(newRealisateur))
         this.realisateur.add(newRealisateur);
   }
   
   /** @pdGenerated default remove
     * @param oldRealisateur */
   public void removeRealisateur(Realisateur oldRealisateur) {
      if (oldRealisateur == null)
         return;
      if (this.realisateur != null)
         if (this.realisateur.contains(oldRealisateur))
            this.realisateur.remove(oldRealisateur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRealisateur() {
      if (realisateur != null)
         realisateur.clear();
   }

}