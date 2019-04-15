package view;
/***********************************************************************
 * Module:  ModifierFilm.java
 * Author:  Lenovo
 * Purpose: Defines the Class ModifierFilm
 ***********************************************************************/


import java.util.*;

import shared.Film;

/** @pdOid 507618fe-c796-40e4-91a1-df921a740924 */
public class ModifierFilm {
   /** @pdRoleInfo migr=no name=Film assc=association15 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Film> film;
   
   /** @param film
    * @pdOid cc6693fc-a00e-44a8-8a51-8245e884e73a */
   public ModifierFilm(Film film) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Film> getFilm() {
      if (film == null)
         film = new java.util.ArrayList<Film>();
      return film;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFilm() {
      if (film == null)
         film = new java.util.ArrayList<Film>();
      return film.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFilm */
   public void setFilm(java.util.List<Film> newFilm) {
      removeAllFilm();
      for (java.util.Iterator iter = newFilm.iterator(); iter.hasNext();)
         addFilm((Film)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFilm */
   public void addFilm(Film newFilm) {
      if (newFilm == null)
         return;
      if (this.film == null)
         this.film = new java.util.ArrayList<Film>();
      if (!this.film.contains(newFilm))
         this.film.add(newFilm);
   }
   
   /** @pdGenerated default remove
     * @param oldFilm */
   public void removeFilm(Film oldFilm) {
      if (oldFilm == null)
         return;
      if (this.film != null)
         if (this.film.contains(oldFilm))
            this.film.remove(oldFilm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFilm() {
      if (film != null)
         film.clear();
   }

}