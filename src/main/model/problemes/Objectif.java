package main.model.problemes;

import java.util.Scanner;

public class Objectif {
	
	protected String sName;
	protected double dMaximumValue;
	protected double dMinimalValue;
	
	/**
     * Renvoie un String d�crivant l'ensemble des �l�ments de l'objectif
     * @return Descriptif des �l�ments
     */
	public String toString() {
		return "Name: " + sName + "; Maximum value: " + dMaximumValue + "; Minimal value: " + dMinimalValue;
	}
	
	/**
     * Cr�e un objet Objectif
     */
	public Objectif(Scanner sc) {
		this.FLoad(sc);
	}
	
	/**
     * R�cup�re le nom de l'objectif
     * @param sc : Scanner parcourant le fichier
     */
	protected void FLoad(Scanner sc) {
		// Chargement du nom de l'objectif
		sName = sc.next();
	}
	
	/**
     * Renvoie la valeur maximale possible pour cet objectif
     * @return Valeur max
     */
	protected double getdMaximumValue() {
		return dMaximumValue;
	}
	
	/**
     * Renvoie la valeur minimale possible pour cet objectif
     * @return Valeur min
     */
	protected double getdMinimalValue() {
		return dMinimalValue;
	}
	
	/**
     * D�fini une valeur maximale pour cet objectif
     * @param dMaximumValue : Valeur max
     */
	protected void setdMaximumValue(double dMaximumValue) {
		this.dMaximumValue = dMaximumValue;
	}
	
	/**
     * D�fini une valeur minimale pour cet objectif
     * @return sMinimalValue : Valeur min
     */
	protected void setdMinimalValue(double dMinimalValue) {
		this.dMinimalValue = dMinimalValue;
	}
}