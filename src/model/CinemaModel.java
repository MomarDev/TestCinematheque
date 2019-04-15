package model;
/***********************************************************************
 * Module:  CinemaModel.java
 * Author:  Lenovo
 * Purpose: Defines the Class CinemaModel
 ***********************************************************************/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import shared.Acteur;
import shared.Cinema;

/** @pdOid 30865480-cff6-49f0-b916-b580782555d7 */
public class CinemaModel {
   public static Connection con=new ConnexionDB().connexionBD();
   public static boolean addCinema(Cinema cinema) {
	   boolean res=false;
	   String sql="INSERT into cinema (nom,adresse,telephone)Values(?,?,?)";
	   try {
		PreparedStatement pStatement=con.prepareStatement(sql);
		pStatement.setString(1, cinema.getNom());
		pStatement.setString(2, cinema.getAdresse());
		pStatement.setString(3, cinema.getTelephone());
		res=pStatement.execute();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      return res;
   }
   
   /** @param cinema
    * @pdOid 8e86e7f6-cef6-4519-bd46-07c295b311fd */
   public static boolean modifyCinema(Cinema cinema) {
	   String sql="UPDATE cinema set nom=?,adresse=?,telephone=? where idCinema=?";
	   boolean res=false;
	   try {
		PreparedStatement pstatement=con.prepareStatement(sql);
		pstatement.setString(1, cinema.getNom());
		pstatement.setString(2, cinema.getAdresse());
		pstatement.setString(3, cinema.getTelephone());
		pstatement.setInt(4, cinema.idCinema);
		res=pstatement.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return res;
   }
   
   /** @param cinema
    * @pdOid caea6a87-548a-4963-b511-7d32c2d28104 */
   public static boolean deleteCinema(Cinema cinema) {
	   String sql="Delete from cinema where idCinema=?";
	      boolean res=false;
	      try {
			PreparedStatement pstatement=con.prepareStatement(sql);
			pstatement.setInt(1, cinema.getIdCinema());
			res=pstatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      return res;
   }
   
   /** @pdOid 794ec9be-3a9d-4357-8ef8-7f8b695b598f */
   public static List<Cinema> getCinemas() {
      List<Cinema> liste=null;
	   String sql="SELECT * FROM cinema";
	   try {
		PreparedStatement pstatement =con.prepareStatement(sql);
		ResultSet resultat=pstatement.executeQuery();
		liste=new ArrayList<Cinema>();
		while(resultat.next()) {
			Cinema cinema=new Cinema();
			cinema.setAdresse(resultat.getString("adresse"));
			cinema.setIdCinema(resultat.getInt("idCinema"));
			cinema.setNom(resultat.getString("nom"));
			liste.add(cinema);
			//cinema.setSalle(new SalleModel().getSalles(resultat.getInt("idCinema")));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return liste;
   }
   
   /** @param idActeur
    * @pdOid 5fc2ff19-3c54-4de4-87d6-4f6bbfab8347 */
   public static Cinema getCinema(int idActeur) {
	   String sql="SELECT * FROM cinema where idCinema=?";
	   PreparedStatement pstatement;
	   Cinema cinema=new Cinema();
	try {
		pstatement = con.prepareStatement(sql);
		pstatement.setInt(1, idActeur);
		
		ResultSet resultat=pstatement.executeQuery();
		while(resultat.next()) {
			cinema.setAdresse(resultat.getString("adresse"));
			cinema.setIdCinema(resultat.getInt("idCinema"));
			cinema.setNom(resultat.getString("nom"));
			//cinema.setSalle(new SalleModel().getSalles(resultat.getInt("idCinema")));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
      return cinema;
   }

}