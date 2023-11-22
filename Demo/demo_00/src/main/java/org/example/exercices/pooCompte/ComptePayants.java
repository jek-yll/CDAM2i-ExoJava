package org.example.exercices.pooCompte;

public class ComptePayants extends Compte{
    private static final float GROSSE_TAXE = 0.05f;
    public ComptePayants(Integer solde) {
        super(solde);
    }

    public float retrait(float montant){
        float taxe = montant*GROSSE_TAXE;
        setSolde((solde - montant)-taxe);
        return solde;
    }

    public float versement(float montant){
        float taxe = montant*GROSSE_TAXE;
        setSolde((solde + montant)-taxe);
        return solde;
    }
}
