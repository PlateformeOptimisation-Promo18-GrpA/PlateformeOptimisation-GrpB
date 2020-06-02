package main.model.problemes;

import java.util.Scanner;

public class Resource implements Cloneable {
	
	protected int iIdResource;
	protected double dQuantity;
	
	/**
     * Renvoie l'identifiant de la ressource
     * @return ID de ressource
     */
	public int getiIdResource() {
		return iIdResource;
	}
	
	/**
     * Renvoie la quantit� de la ressource
     * @return Quantit� de la ressource
     */
	public double getdQuantity() {
		return dQuantity;
	}
	
	/**
     * Cr�e un ressource
     * @param sc : Scanner parcourant le fichier
     */
	public Resource(Scanner sc) {
		iIdResource = sc.nextInt();
		dQuantity = sc.nextDouble();
	}
	
	/**
     * Cr�e une ressource
     * @param sc : Scanner parcourant le fichier
     * @param gp : GraphProject de la ressource
     */
	public Resource(Scanner sc, GraphProject gp) throws Exception {
		
	}
	
	/**
     * Cr�e une ressource � partir d'une autre ressource
     * @param resource : Ressource � copier
     */
	public Resource(Resource resource) {
		iIdResource = resource.getiIdResource();
		dQuantity = resource.getdQuantity();
	}
	
	/**
     * R�duit la quantit� de la ressource
     * @param dQuantity : Quantit� � retirer
     */
	public void removeQuantity(double dQuantity) {
		this.dQuantity -= dQuantity;
	}
	
	/**
     * Augmente la quantit� de la ressource
     * @param dQuantity : Quantit� � ajouter
     */
	public void addQuantity(double dQuantity) {
		this.dQuantity += dQuantity;
	}
	
	/**
     * Clone une ressource
     * @return Clone de la resource
     */
	protected Resource clone() {
		return new Resource(this);
	}
}