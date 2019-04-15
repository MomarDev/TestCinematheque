package view;
/***********************************************************************
 * Module:  AfficheProjection.java
 * Author:  Lenovo
 * Purpose: Defines the Class AfficheProjection
 ***********************************************************************/

import java.util.*;

import shared.Projection;

/** @pdOid 38d8c904-d750-4669-b15f-c6a5e8ad6ea7 */
public class AfficheProjection {
   /** @pdRoleInfo migr=no name=Projection assc=association19 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Projection> projection;
   
   /** @param projection
    * @pdOid dcff6246-e7e0-4ab5-b4da-94d9989fe113 */
   public AfficheProjection(Projection projection) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Projection> getProjection() {
      if (projection == null)
         projection = new java.util.ArrayList<Projection>();
      return projection;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProjection() {
      if (projection == null)
         projection = new java.util.ArrayList<Projection>();
      return projection.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProjection */
   public void setProjection(java.util.List<Projection> newProjection) {
      removeAllProjection();
      for (java.util.Iterator iter = newProjection.iterator(); iter.hasNext();)
         addProjection((Projection)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProjection */
   public void addProjection(Projection newProjection) {
      if (newProjection == null)
         return;
      if (this.projection == null)
         this.projection = new java.util.ArrayList<Projection>();
      if (!this.projection.contains(newProjection))
         this.projection.add(newProjection);
   }
   
   /** @pdGenerated default remove
     * @param oldProjection */
   public void removeProjection(Projection oldProjection) {
      if (oldProjection == null)
         return;
      if (this.projection != null)
         if (this.projection.contains(oldProjection))
            this.projection.remove(oldProjection);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProjection() {
      if (projection != null)
         projection.clear();
   }

}