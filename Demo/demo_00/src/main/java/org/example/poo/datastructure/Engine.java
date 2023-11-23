package org.example.poo.datastructure;

public abstract class Engine {

    protected static int count;
    protected int id;
    protected int nbrRoue;
    protected String couleur;

    {
        count++;
    }

    public Engine() {
    }

    protected abstract void test();

    public int getId() {
        return id;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
