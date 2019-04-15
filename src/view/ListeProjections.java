package view;
/***********************************************************************
 * Module:  ListeProjections.java
 * Author:  Lenovo
 * Purpose: Defines the Class ListeProjections
 ***********************************************************************/

import java.util.*;

import shared.Projection;

/** @pdOid dccf8fcc-56f6-4bc0-a965-552d5add6037 */
public class ListeProjections {
   /** @pdRoleInfo migr=no name=Projection assc=association17 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Projection> projections;
   
   /** @param projections
    * @pdOid f2dc779f-89a5-4d9b-8856-900fd1997d4f */
   public ListeProjections(java.util.List<Projection> projections) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Projection> getProjection() {
      if (projections == null)
         projections = new java.util.ArrayList<Projection>();
      return projections;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProjection() {
      if (projections == null)
         projections = new java.util.ArrayList<Projection>();
      return projections.iterator();
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
      if (this.projections == null)
         this.projections = new java.util.ArrayList<Projection>();
      if (!this.projections.contains(newProjection))
         this.projections.add(newProjection);
   }
   
   /** @pdGenerated default remove
     * @param oldProjection */
   public void removeProjection(Projection oldProjection) {
      if (oldProjection == null)
         return;
      if (this.projections != null)
         if (this.projections.contains(oldProjection))
            this.projections.remove(oldProjection);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProjection() {
      if (projections != null)
         projections.clear();
   }

}