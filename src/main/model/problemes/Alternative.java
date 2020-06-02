package main.model.problemes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternative{
	
	protected String sName;
	protected List<Double> listValueOfObjectif;
	protected List<Resource> listResources;
	protected int iNbRessources;
	
	/**
     * Cr�e une alternative et lui attribue des valeurs d'objectif et des ressources
     * @param sc : Scanner parcourant le fichier
     * @param graph : GraphProject contenant les objectifs
     */
	public Alternative(Scanner sc, GraphProject graph) {
		// Chargement du nom de l'alternative
		sName = sc.next();
		
		// Initialisation des listes
		listValueOfObjectif = new ArrayList<Double>();
		listResources = new ArrayList<Resource>();
		
		// Chargement des valeurs des objectifs
		for(int i = 0; i<graph.getNbObjectives(); i++) {
			listValueOfObjectif.add(sc.nextDouble());
		}
		
		// Chargement des ressources
		this.iNbRessources = sc.nextInt();
		for(int i = 0; i<iNbRessources; i++) {
			addResources(new Resource(sc));
		}
	}
	
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments de l'alternative
     * @return Descriptif des �l�ments
     */
	public String toString() {
		String msg = "Name: " + sName + "; ";
		// Ajout de chaque objectif au String
		for(int i=0; i<listValueOfObjectif.size(); i++) {
			msg += "Objective " + (i+1) + ": " + listValueOfObjectif.get(i) +"; ";
		}
		// Ajout de chaque ressource au String
		for(int i=0; i<iNbRessources; i++) {
			msg += "Resource " + listResources.get(i).getiIdResource() + ": " + listResources.get(i).getdQuantity() +"; ";
		}
		return msg;
	}
	
	/**
     * Renvoie le nom de l'alternative
     * @return Nom
     */
	public String getName() {
		return sName;
	}
	
	/**
     * Renvoie une r�f�rence � la liste de ressources utilis�es par l'alternative
     * @return Liste de ressources
     */
	public List<Resource> getListResources() {
		return listResources;
	}
	
	/**
     * Ajoute un ressource � la liste des ressources utilis�es par l'alternative
     * @param resource : ressource � ajouter
     */
	public void addResources (Resource resource) {
		listResources.add(resource);
	}
	
	/**
     * Renvoie le co�t de l'alternative
     * @return Co�t
     */
	public double getCost() {
		return listValueOfObjectif.get(0);
	}
	
	/**
     * Renvoie la dur�e de l'aternative
     * @return Dur�e
     */
	public double getDuration() {
		return listValueOfObjectif.get(1);
	}
	
	public boolean isResourcesAvailable(List<Resource> listAvailableResources) {
		return false;
	}
}