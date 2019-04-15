package view;
/***********************************************************************
 * Module:  ListeRealisateurs.java
 * Author:  Lenovo
 * Purpose: Defines the Class ListeRealisateurs
 ***********************************************************************/

import java.util.*;

import shared.Realisateur;

/** @pdOid feb53c77-d898-4c36-a732-a5dfa78fd8de */
public class ListeRealisateurs {
   /** @pdRoleInfo migr=no name=Realisateur assc=association11 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Realisateur> realisateurs;
   
   /** @param realisateurs
    * @pdOid 8c3dbceb-5933-47d1-bde5-efd3acc22516 */
   public ListeRealisateurs(java.util.List<Realisateur> realisateurs) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Realisateur> getRealisateur() {
      if (realisateurs == null)
         realisateurs = new java.util.ArrayList<Realisateur>();
      return realisateurs;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRealisateur() {
      if (realisateurs == null)
         realisateurs = new java.util.ArrayList<Realisateur>();
      return realisateurs.iterator();
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
      if (this.realisateurs == null)
         this.realisateurs = new java.util.ArrayList<Realisateur>();
      if (!this.realisateurs.contains(newRealisateur))
         this.realisateurs.add(newRealisateur);
   }
   
   /** @pdGenerated default remove
     * @param oldRealisateur */
   public void removeRealisateur(Realisateur oldRealisateur) {
      if (oldRealisateur == null)
         return;
      if (this.realisateurs != null)
         if (this.realisateurs.contains(oldRealisateur))
            this.realisateurs.remove(oldRealisateur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRealisateur() {
      if (realisateurs != null)
         realisateurs.clear();
   }

}