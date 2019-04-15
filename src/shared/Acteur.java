package shared;
/***********************************************************************
 * Module:  Acteur.java
 * Author:  Lenovo
 * Purpose: Defines the Class Acteur
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid cd6998cc-8e02-4654-b0ee-ba3c55ce7a17 */
public class Acteur implements Serializable{
   public int idPers;
   public String nom;
   public String prenom;
   public String nationalite;
   public java.util.Date dnaiss;
   public String lnaiss;
   
   
   
   
public Acteur() {
}


public Acteur(int idPers, String nom, String prenom, String nationalite, Date dnaiss, String lnaiss) {
	super();
	this.idPers = idPers;
	this.nom = nom;
	this.prenom = prenom;
	this.nationalite = nationalite;
	this.dnaiss = dnaiss;
	this.lnaiss = lnaiss;
}


public int getIdPers() {
	return idPers;
}
public void setIdPers(int idPers) {
	this.idPers = idPers;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNationalite() {
	return nationalite;
}
public void setNationalite(String nationalite) {
	this.nationalite = nationalite;
}
public java.util.Date getDnaiss() {
	return dnaiss;
}
public void setDnaiss(java.util.Date dnaiss) {
	this.dnaiss = dnaiss;
}
public String getLnaiss() {
	return lnaiss;
}
public void setLnaiss(String lnaiss) {
	this.lnaiss = lnaiss;
}
   
   
   
   

}