package control;
/***********************************************************************
 * Module:  ActeurControl.java
 * Author:  Lenovo
 * Purpose: Defines the Class ActeurControl
 ***********************************************************************/

import java.util.*;

import model.ActeurModel;
import shared.Acteur;
import view.*;

/** @pdOid ada98af5-e68e-4220-a468-f30d3df53ab3 */
public class ActeurControl {
   /** @param acteur
    * @pdOid bddb169f-4449-4084-95cd-0ca29fd31772 */
	
	
   public static void afficher(Acteur acteur) {


	AfficherActeur fen = new AfficherActeur(acteur);
	      JMain.afficher(fen);
	   
   }
   
   /** @param acteur
    * @pdOid a0ca1096-3752-4fd0-8ce3-b289dcd98569 */
   public static void modifier(Acteur acteur) {

	   ModifierActeur fen = new ModifierActeur(acteur);
	      JMain.afficher(fen);

   }
   
   /** @pdOid 28fb4525-4e37-401c-ad96-1016ef2e16ae */
   public static void lister() {
	   
	   ArrayList<Acteur> acteurs = (ArrayList<Acteur>) ActeurModel.getActeurs();
	   ListeActeurs fen = new ListeActeurs(acteurs);
	      JMain.afficher(fen,true);
	   
   }
   
   /** @param acteur
    * @pdOid 59357c88-4079-4316-9c7e-09cf6e2d88ff */
   public static void ajouterNouveau(Acteur acteur) {
      // TODO: implement
	   if(!ActeurModel.addActeur(acteur)) {
		   JMain.afficherErreur("Erreur lors de l'ajout! ");
	   }
	   else {
		   lister();
	   }
	  
   }
   
   /** @param acteur
    * @pdOid f40763a7-f595-41f4-a1a8-4b13ba20bccf */
   public static void enregistrerModification(Acteur acteur) {
		   if(!ActeurModel.modifyActeur(acteur)) {
			   JMain.afficherErreur("Erreur lors de la modification ");
		   }
		   else {
			   lister();
		   }
   }
   
   /** @param acteur
    * @pdOid ac4cbceb-cd09-40cf-b064-8247a4ad702b */
   public static void supprimer(Acteur acteur) {


	   if(!ActeurModel.deleteActeur(acteur)) {
		   JMain.afficherErreur("Erreur lors de la suppression ");
	   }
	   else {
		   JMain.afficherInformation("Suppression reussie ");
	   }
   }
   
   

}
