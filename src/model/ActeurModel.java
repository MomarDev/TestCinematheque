package model;
/***********************************************************************
 * Module:  ActeurModel.java
 * Author:  Lenovo
 * Purpose: Defines the Class ActeurModel
 ***********************************************************************/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import shared.Acteur;
import shared.Cinema;

/** @pdOid f9bd4a78-e1e2-453c-923c-68eab2d069ae */
public class ActeurModel {
	
	static Connection con=new ConnexionDB().connexionBD();
	static Statement statement=null;
   /** @param acteur
    * @pdOid 1ae608ad-64e1-4a0c-833d-4f3f79ff9dc6 */
   public static boolean addActeur(Acteur acteur) {
	   String sql="INSERT into Acteur () VALUES ("+acteur.getNom()+","+acteur.getPrenom()+","+acteur.getNationalite()+","+acteur.getDnaiss()+","+acteur.getLnaiss()+")";
	   boolean res=false;
	   try {
		statement=con.createStatement();
		res=statement.execute(sql);
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
      
      return res;
   }
   
   /** @param acteur
    * @pdOid 0fdbc329-291f-4048-9a42-2fbef0cb0a33 */
   public static boolean modifyActeur(Acteur acteur) {
	   String sql="UPDATE Acteur set nom=?,prenom=?,dateNaissance=?,lieuNaissance=?,nationalite=? where idActeur=?";
	   boolean res=false;
	   try {
		PreparedStatement pstatement=con.prepareStatement(sql);
		pstatement.setString(1, acteur.getNom());
		pstatement.setString(2, acteur.getPrenom());
		pstatement.setDate(3, (java.sql.Date)acteur.getDnaiss());
		pstatement.setString(4, acteur.getLnaiss());
		pstatement.setString(5, acteur.getNationalite());
		pstatement.setInt(6,acteur.idPers);
		res=pstatement.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return res;
   }
   
   /** @param acteur
    * @pdOid f489ed3c-791d-4ffa-95a8-c3225cab61a7 */
   public static boolean deleteActeur(Acteur acteur) {
      String sql="Delete from Acteur where idActeur=?";
      boolean res=false;
      try {
		PreparedStatement pstatement=con.prepareStatement(sql);
		pstatement.setInt(1, acteur.getIdPers());
		res=pstatement.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return res;
   }
   
   /** @pdOid 900c70cf-0cc3-4539-9afc-4efa35a983c5 */
   public static List<Acteur> getActeurs() {
	   List<Acteur> liste=null;
	   String sql="SELECT * FROM Acteur";
	   boolean res=false;
	   try {
		   liste=new ArrayList<Acteur>();
		PreparedStatement pstatement =con.prepareStatement(sql);
		ResultSet resultat=pstatement.executeQuery();
		while(resultat.next()) {
			Acteur acteur=new Acteur();
			acteur.setIdPers(resultat.getInt("adresse"));
			acteur.setDnaiss(resultat.getDate("dnaiss"));
			acteur.setLnaiss(resultat.getString("lnaiss"));
			acteur.setNationalite(resultat.getString("nationalite"));
			acteur.setNom(resultat.getString("nom"));
			acteur.setPrenom(resultat.getString("prenom"));
			liste.add(acteur);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return null;
   }
   
   /** @param idActeur
    * @pdOid 7a448f41-198a-46a1-ae2c-afef46ab76f7 */
   public static Acteur getActeur(int idActeur) {
	   String sql="SELECT * FROM acteur where idCinema=?";
	   PreparedStatement pstatement;
	   Acteur acteur=new Acteur();
	try {
		pstatement = con.prepareStatement(sql);
		pstatement.setInt(1, idActeur);
		
		ResultSet resultat=pstatement.executeQuery();
		while(resultat.next()) {
			acteur.setIdPers(resultat.getInt("adresse"));
			acteur.setDnaiss(resultat.getDate("dnaiss"));
			acteur.setLnaiss(resultat.getString("lnaiss"));
			acteur.setNationalite(resultat.getString("nationalite"));
			acteur.setNom(resultat.getString("nom"));
			acteur.setPrenom(resultat.getString("prenom"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
      return acteur;
   }

}