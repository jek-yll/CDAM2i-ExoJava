package org.example.exercices.pooCompte;

public abstract class Compte {
    private static Integer counter = 0;

    {
        counter++;
    }
    protected Integer code;
    protected float solde;

    public Compte(float solde) {
        this.code = counter;
        this.solde = solde;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float versement (float montant){
        setSolde(this.solde + montant);
        return solde;
    }

    public float retrait (float montant){
        setSolde(this.solde - montant);
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
