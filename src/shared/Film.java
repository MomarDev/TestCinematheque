package shared;
/***********************************************************************
 * Module:  Film.java
 * Author:  Lenovo
 * Purpose: Defines the Class Film
 ***********************************************************************/

import java.util.*;


/** @pdOid 9c5defd9-78f1-4f91-b750-e0ad4d386cf7 */
public class Film {
   /** @pdOid 6e7589f6-b416-466a-890d-cb78fd6f513e */
   public int idFilm;
   /** @pdOid e080aba8-c02f-40da-8272-fd2babe17e35 */
   public String titre;
   /** @pdOid 12bc3f3b-f082-4700-bb3b-d886704e120e */
   public short annee;
   
   /** @pdRoleInfo migr=no name=Realisateur assc=Association_9 coll=java.util.List impl=java.util.ArrayList mult=0..* type=Aggregation */
   public java.util.List<Realisateur> realisateur;
   /** @pdRoleInfo migr=no name=Acteur assc=association9 coll=java.util.List impl=java.util.ArrayList mult=0..* type=Aggregation */
   public java.util.List<Acteur> acteur;
   
   
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