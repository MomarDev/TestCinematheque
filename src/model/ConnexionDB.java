package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
	
	private  static Connection connect =null;
	   
	//Methode pour la connexion � la base de donn�es
	    public Connection connexionBD() {
	        
	        if (connect == null){
	            String url = "jdbc:mysql://localhost/cinematheque";
	      
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection(url,"root","");
	            System.out.println( "Connexion � la base de donn�es reussie");
	           
	        } catch (Exception e) {
	            String echec = "impossible de se connecter � la base de donn�es !";
	            
	        }
	        }
	        return connect;
	    }
	    
	    //Cette methode ferme la connexion � la base de donn�es
	         public Connection closeConnection(){
	              
	             try {

	                  connect.close();

	              } catch (SQLException ex) {
	                  System.err.println(ex.getMessage());
	              }
	              return connect;
	         }
}
