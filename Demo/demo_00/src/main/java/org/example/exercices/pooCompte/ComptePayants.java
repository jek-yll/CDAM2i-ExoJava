package org.example.exercices.pooCompte;

public class ComptePayants extends CompteSimple{
    private static final float GROSSE_TAXE = 0.05f;
    public ComptePayants(Integer solde) {
        super(solde, 0);
    }

    @Override
    public float retrait(float montant){

        float taxe = montant*GROSSE_TAXE;
        float operation = (solde - montant)-taxe;

        if (operation>decouvert){
            solde = operation;
            return solde;
        }
        System.out.printf("Opération impossible, vous allez dépasser votre découvert autorisé (%d €)",decouvert);
        return solde;
    }

    @Override
    public float versement(float montant){
        float taxe = montant*GROSSE_TAXE;
        solde = solde + montant - taxe;
        return solde;
    }
}
