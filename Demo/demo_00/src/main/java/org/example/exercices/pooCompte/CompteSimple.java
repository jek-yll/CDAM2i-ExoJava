package org.example.exercices.pooCompte;

public class CompteSimple extends Compte{

    protected Integer decouvert;
    public CompteSimple(Integer solde, Integer decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    public Integer getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Integer decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public float retrait (float montant){

        float operation = solde - montant;

        if (operation > decouvert ){
        setSolde(operation);
        return solde;
        }
        System.out.println("Retrait impossible");
        return solde;

    }
}
