package view;
/***********************************************************************
 * Module:  AfficherFilm.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficherFilm
 ***********************************************************************/

import java.util.*;

import shared.Film;

/** @pdOid a6e83bb6-6f94-4933-b3dc-9aa18668dcea */
public class AfficherFilm {
   /** @pdRoleInfo migr=no name=Film assc=association16 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Film> film;
   
   /** @param film
    * @pdOid ba458c8d-7007-4095-947b-dea35e7794a9 */
   public AfficherFilm(Film film) {
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