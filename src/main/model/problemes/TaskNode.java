package main.model.problemes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskNode extends Node {
	
	protected List<Alternative> listAlternatives;
	protected int iIdTask;
	protected String sName;
	protected int iNbAlternatives;
	
	/**
     * Cr�e un noeud de tache et ses alternatives
     * @param sc : Scanner parcourant le fichier
     * @param gp : GraphProject contenant le noeud
     */
	public TaskNode(Scanner sc, GraphProject graph) {
		super();
		// Chargement du nom de la tache
		this.sName = sc.next();
		this.setiIdNode(sc.nextInt());
		this.iNbAlternatives = sc.nextInt();
		this.listAlternatives = new ArrayList<Alternative>();
		// Chargement des alternatives
		for(int i=0; i<iNbAlternatives; i++) {
			listAlternatives.add(new Alternative(sc, graph));
		}
	}
	
	/**
     * Renvoie l'identifiant de tache du noeud
     * @return ID de tache
     */
	protected int getiIdTask() {
		return iIdTask;
	}
	
	/**
     * Attribue un indentifiant de tache au noeud
     * @param iIdTask : ID de la tache
     */
	protected void setiIdTask(int iIdTask) {
		this.iIdTask = iIdTask;
	}
	
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments du noeud
     * @return Descriptif des �l�ments
     */
	public String toString() {
		String msg = "Name: " + sName + "; IdTask: " + iIdTask + "; ";
		for(int i=0; i<listAlternatives.size(); i++) {
			msg += "Alternative " + (i+1) + ": "+listAlternatives.get(i) + "; ";
		}
		return msg;
	}
	
	/**
     * Renvoie le cout de l'alternative s�l�ctionn�e
     * @param iSelectedTaskNodeAlternative : index de l'alternative s�l�ctionn�e
     * @return Co�t de l'alternative
     */
	public double getCost(int iSelectedTaskNodeAlternative) {
		return listAlternatives.get(iSelectedTaskNodeAlternative).getCost();
	}
	
	/**
     * Renvoie la dur�e de l'alternative s�l�ctionn�e
     * @param iSelectedTaskNodeAlternative : index de l'alternative s�l�ctionn�e
     * @return Dur�e de l'alternative
     */
	public double getDuration(int iSelectedTaskNodeAlternative) {
		return listAlternatives.get(iSelectedTaskNodeAlternative).getDuration();
	}
	
	/**
     * 
     * @return 
     */
	public boolean isResourcesAvailable(List<Resource> listAvailableResources, int iSelectedTaskNodeAlternative) {
		return false;
	}
	
	/**
     * Renvoie la liste des ressources utilis�s par l'alternative s�l�ctionn�e
     * @param iSelectedTaskNodeAlternative : index de l'alternative s�l�ctionn�e
     * @return Liste des ressources
     */
	public List<Resource> getListResourcesofSelectedAlternative(int iSelectedTaskNodeAlternative){
		return listAlternatives.get(iSelectedTaskNodeAlternative).getListResources();
	}
	
	/**
     * 
     * @return 
     */
	public Alternative getAlternativeExtremum(boolean bIsMinCalculated) {
		return null;
	}
	
	/**
     * 
     * @return 
     */
	public boolean isResourcesAvailable(List<Resource> listAvailableResources, boolean bIsMinCalculated) {
		return false;
	}
	
	/**
     * Renvoie le nombre d'alternatives de la tache
     * @return Nombre d'alternatives
     */
	public int getNbAlternatives() {
		return iNbAlternatives;
	}
}

class ComparatorAlternativeDuration implements Comparator<Alternative>{
	/**
     * Compare les dur�es de deux alternatives
     * @param alt1 : Premi�re alternative � comparer
     * @param alt2 : Seconde alternative � comparer
     * @return Entier d�crivant � la relation de superiorit�
     */
	public int compare(Alternative alt1, Alternative alt2) {
		if (alt1.getDuration()>alt2.getDuration()) {
			return 1;
		} else if (alt1.getDuration()==alt2.getDuration()) {
			return 0;
		} else {
			return -1;
		}
	}
}

class ComparatorAlternativeCost implements Comparator<Alternative>{
	/**
     * Compare les co�ts de deux alternatives
     * @param alt1 : Premi�re alternative � comparer
     * @param alt2 : Seconde alternative � comparer
     * @return Entier d�crivant � la relation de superiorit�
     */
	public int compare(Alternative alt1, Alternative alt2) {
		if (alt1.getCost()>alt2.getCost()) {
			return 1;
		} else if (alt1.getCost()==alt2.getCost()) {
			return 0;
		} else {
			return -1;
		}
	}
}