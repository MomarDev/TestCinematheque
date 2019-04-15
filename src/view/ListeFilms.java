package view;
/***********************************************************************
 * Module:  ListeFilms.java
 * Author:  Lenovo
 * Purpose: Defines the Class ListeFilms
 ***********************************************************************/

import java.util.*;

import shared.Film;

/** @pdOid ce72d66b-c436-49a6-8847-42fcb15b84a1 */
public class ListeFilms {
   /** @pdRoleInfo migr=no name=Film assc=association14 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Film> films;
   
   /** @param films
    * @pdOid 2a1f3c72-eec6-4122-8729-799cab178b9d */
   public ListeFilms(java.util.List<Film> films) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Film> getFilm() {
      if (films == null)
         films = new java.util.ArrayList<Film>();
      return films;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFilm() {
      if (films == null)
         films = new java.util.ArrayList<Film>();
      return films.iterator();
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
      if (this.films == null)
         this.films = new java.util.ArrayList<Film>();
      if (!this.films.contains(newFilm))
         this.films.add(newFilm);
   }
   
   /** @pdGenerated default remove
     * @param oldFilm */
   public void removeFilm(Film oldFilm) {
      if (oldFilm == null)
         return;
      if (this.films != null)
         if (this.films.contains(oldFilm))
            this.films.remove(oldFilm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFilm() {
      if (films != null)
         films.clear();
   }

}