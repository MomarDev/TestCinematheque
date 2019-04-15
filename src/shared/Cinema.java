package shared;
/***********************************************************************
 * Module:  Cinema.java
 * Author:  Lenovo
 * Purpose: Defines the Class Cinema
 ***********************************************************************/

import java.util.*;


/** @pdOid 29ea2295-0610-4890-a971-141c45bcc53f */
public class Cinema {
   public int idCinema;
   public String nom;
   public String adresse;
   public String telephone;public java.util.List<Salle> salle;
   
   
   
   public Cinema() {}
   



public Cinema(int idCinema, String nom, String adresse, String telephone, List<Salle> salle) {
	super();
	this.idCinema = idCinema;
	this.nom = nom;
	this.adresse = adresse;
	this.telephone = telephone;
	this.salle = salle;
}




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
   
   public int getIdCinema() {
	return idCinema;
}




public void setIdCinema(int idCinema) {
	this.idCinema = idCinema;
}




public String getNom() {
	return nom;
}




public void setNom(String nom) {
	this.nom = nom;
}




public String getAdresse() {
	return adresse;
}




public void setAdresse(String adresse) {
	this.adresse = adresse;
}




public String getTelephone() {
	return telephone;
}




public void setTelephone(String telephone) {
	this.telephone = telephone;
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