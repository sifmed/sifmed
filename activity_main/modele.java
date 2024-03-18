package models;

import java.util.ArrayList;
import java.util.List;

import entites.visiteur;

public class modele {
    private static modele modele = null ;

    private List<visiteur> lesVisiteurs = new ArrayList<visiteur>() ;

    private modele(){
        super() ;
        this.peupler() ;
    }

    public static modele getInstance(){
        if( modele.modele == null ){
            modele = new modele() ;
        }
        return modele.modele ;
    }

    private void peupler(){
        this.lesVisiteurs.add( new visiteur("a131","azerty","Villechalane","Louis") ) ;
        this.lesVisiteurs.add( new visiteur("b13","azerty","Bentot","Pascal") ) ;
        this.lesVisiteurs.add( new visiteur("b16","azerty","Bioret","Luc") ) ;
        this.lesVisiteurs.add( new visiteur("a17","azerty","Andre","David") ) ;
    }

    public visiteur seConnecter(String matricule, String mdp){

        for( visiteur unVisiteur : this.lesVisiteurs ){
            if( unVisiteur.getMatricule().equals(matricule) && unVisiteur.getMdp().equals(mdp) ){
                return unVisiteur ;
            }
        }

        return null ;

    }
}
