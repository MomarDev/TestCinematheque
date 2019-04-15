package view;
/***********************************************************************
 * Module:  ModifierProjection.java
 * Author:  Lenovo
 * Purpose: Defines the Class ModifierProjection
 ***********************************************************************/

import java.util.*;

import shared.Projection;

/** @pdOid 3fcb72d8-c924-4ff6-9ef8-c3c686396c65 */
public class ModifierProjection {
   /** @pdRoleInfo migr=no name=Projection assc=association18 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Projection> projection;
   
   /** @param projection
    * @pdOid 7a92d87d-a77d-4a90-b8a1-038859bb0a15 */
   public ModifierProjection(Projection projection) {
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