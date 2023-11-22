package org.example.exercices.pooCompte;

public class ComptePayants extends CompteSimple{
    private static final float GROSSE_TAXE = 0.05f;
    public ComptePayants(Integer solde) {
        super(solde, 0);
    }

    public float retrait(float montant){

        float taxe = montant*GROSSE_TAXE;
        float operation = (solde - montant)-taxe;

        if (operation>decouvert){
            setSolde(operation);
            return solde;
        }
        System.out.printf("Opération impossible, vous allez dépasser votre découvert autorisé (%d €)",decouvert);
        return solde;
    }

    public float versement(float montant){
        float taxe = montant*GROSSE_TAXE;
        setSolde((solde + montant)-taxe);
        return solde;
    }
}
