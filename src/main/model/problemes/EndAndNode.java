package main.model.problemes;

import java.util.Scanner;

public class EndAndNode extends Node {
		
	protected int iIdBeginAndNode;
		
	/**
     * Cr�e un noeud ET de fin de double chemin et lui attribue son identifiant
     * @param IdEndAndNode : Identifiant du noeud
     * @param IdBeginAndNode : Identifiant du noeud de d�but de double chemin
     */
	public EndAndNode (int IdEndAndNode, int IdBeginAndNode) {
		super();
		// Attribution de l'ID
		this.setiIdNode(IdEndAndNode);
		this.setiIdBeginAndNode(IdBeginAndNode);
	}
		
	/**
     * Renvoie l'identifiant du noeud de d�but du double chemin
     * @return ID du noeud
     */
	protected int getiIdBeginAndNode() {
		return iIdBeginAndNode;
	}
		
	/**
     * Attribue un identifiant au noeud de d�but du double chemin
     * @param iBeginAndNode : ID du noeud
     */
	protected void setiIdBeginAndNode(int iBeginAndNode) {
		this.iIdBeginAndNode = iBeginAndNode;
	}
		
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments du noeud
     * @return Descriptif des �l�ments
     */
	public String toString() {
		return "Id Node: " + this.getiIdNode() + "; Id Begin And Node: " + iIdBeginAndNode + ";";
	}
}