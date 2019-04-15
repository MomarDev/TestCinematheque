package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
	
	private  static Connection connect =null;
	   
	//Methode pour la connexion à la base de données
	    public Connection connexionBD() {
	        
	        if (connect == null){
	            String url = "jdbc:mysql://localhost/cinematheque";
	      
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection(url,"root","");
	            System.out.println( "Connexion à la base de données reussie");
	           
	        } catch (Exception e) {
	            String echec = "impossible de se connecter à la base de données !";
	            
	        }
	        }
	        return connect;
	    }
	    
	    //Cette methode ferme la connexion à la base de données
	         public Connection closeConnection(){
	              
	             try {

	                  connect.close();

	              } catch (SQLException ex) {
	                  System.err.println(ex.getMessage());
	              }
	              return connect;
	         }
}
