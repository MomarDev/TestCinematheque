package shared;
/***********************************************************************
 * Module:  Cinema.java
 * Author:  Lenovo
 * Purpose: Defines the Class Cinema
 ***********************************************************************/

import java.util.*;


/** @pdOid 29ea2295-0610-4890-a971-141c45bcc53f */
public class Cinema {
   /** @pdOid a5e0b264-ff10-45ee-9ec6-2828d46e070e */
   public int idCinema;
   /** @pdOid c1702eca-96fa-4201-b25d-d5060fbfd240 */
   public String nom;
   /** @pdOid fd7a07f9-8190-4197-87e8-b1aaed113605 */
   public String adresse;
   /** @pdOid 67a27f02-1707-4374-92f5-4f10cc105760 */
   public String telephone;
   
   /** @pdRoleInfo migr=no name=Salle assc=Association_7 coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition */
   public java.util.List<Salle> salle;
   
   
   /** @pdGenerated default getter */
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