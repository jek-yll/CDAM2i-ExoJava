package org.example.exercices.pooCompte;

public class CompteEpargne extends Compte{

    private float tauxInteret;
    public CompteEpargne(Integer solde, float tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public float getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(float tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public float setSoldeAfterOneYear(){

        float multiplicateur = 1+tauxInteret;

        setSolde(solde*multiplicateur);

        return solde;
    }
}
