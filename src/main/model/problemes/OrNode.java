package main.model.problemes;

import java.util.Scanner;

public class OrNode extends Node {
	
	protected int iIdEndOrNode;
	protected int iIdOrNode;
	
	/**
     * Cr�e un noeud OU et lui attribue un identifiant
     * @param sc : Scanner parcourant le fichier
     */
	public OrNode(Scanner sc) {
		super();
		// Attribution de l'ID
		this.setiIdNode(sc.nextInt());
		this.setiIdEndOrNode(sc.nextInt());
	}
	
	/**
     * Renvoie l'identifiant du noeud de fin du choix
     * @return ID de noeud de fin du choix
     */
	protected int getiIdEndOrNode() {
		return iIdEndOrNode;
	}
	
	/**
     * Attribue un identifiant au noeud de fin du choix
     * @param ID du noeud de fin du choix
     */
	protected void setiIdEndOrNode(int iIdEndOrNode) {
		this.iIdEndOrNode = iIdEndOrNode;
	}
	
	/**
     * Renvoie l'identifiant du noeud de d�but du choix
     * @return ID du noeud de d�but du choix
     */
	protected int getiIdOrNode() {
		return iIdOrNode;
	}
	
	/**
     * Attribue un identifiant au noeud de d�but du choix
     * @return ID du noeud de d�but du choix
     */
	protected void setiIdOrNode(int iIdOrNode) {
		this.iIdOrNode = iIdOrNode;
	}
	
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments du noeud
     * @return Descriptif des �l�ments
     */
	public String toString() {
		return "Id Node: " + this.getiIdNode() + "; Id End Or Node: " + iIdEndOrNode + ";";
	}
}