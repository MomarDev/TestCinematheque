package shared;
/***********************************************************************
 * Module:  Projection.java
 * Author:  Lenovo
 * Purpose: Defines the Class Projection
 ***********************************************************************/


import java.util.*;


/** @pdOid b3eabe6c-a499-48a4-be9b-c57d009b7ee2 */
public class Projection {
   /** @pdOid 58a2cf38-d61f-4d83-9605-d670625a5f12 */
   public java.util.Date jour;
   /** @pdOid 6d85a049-4838-4ef3-84f2-c6613c889265 */
   public String heure;
   
   /** @pdRoleInfo migr=no name=Film assc=association7 mult=0..1 side=A */
   public Film film;
   /** @pdRoleInfo migr=no name=Salle assc=association8 mult=0..1 side=A */
   public Salle salle;

}