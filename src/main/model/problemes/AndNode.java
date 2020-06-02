package main.model.problemes;

import java.util.Scanner;

public class AndNode extends Node {
	
	protected int iIdEndAndNode;
	
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments du noeud
     * @return Descriptif des �l�ments
     */
	public String toString() {
		return "Id Node: " + this.getiIdNode() + "; Id End And Node: " + iIdEndAndNode + ";";
	}
	
	/**
     * Cr�e un noeud ET, lui attribue un identifiant
     * @param sc : Scanner parcourant le fichier
     */
	public AndNode(Scanner sc) {
		super();
		// Attribution de l'ID
		this.setiIdNode(sc.nextInt());
		this.setiIdEndAndNode(sc.nextInt());
	}
	
	/**
     * Attribue un identifiant au noeud ET cloturant le double chemin
     * @param Id du noeud de fin
     */
	protected void setiIdEndAndNode(int iIdEndAndNode) {
		this.iIdEndAndNode = iIdEndAndNode;
	}
	
	/**
     * Renvoie l'identifiant du noeud ET de fin
     * @return Id du noeud de fin
     */
	protected int getiIdEndAndNode() {
		return iIdEndAndNode;
	}
}