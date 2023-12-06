package org.example.exercices.TP_RoyaumeFantastique;

import org.example.exercices.TP_RoyaumeFantastique.entity.*;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.Capacite;
import org.example.exercices.TP_RoyaumeFantastique.factory.impl.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Armement arc = new Arme.Builder().name("Arc").hand(2).durability(10).build();
        Armement hache = new Arme.Builder().name("Hache").hand(2).durability(20).build();
        Armement epee =new Arme.Builder().name("epee").hand(1).durability(15).build();
        Armement baton = new Arme.Builder().name("baton").hand(2).durability(15).build();

        Attribut vie = new Stat.Builder().name("vie").value(100).build();
        Attribut force = new Stat.Builder().name("force").value(50).build();
        Attribut mana = new Stat.Builder().name("mana").value(75).build();

        Competence soin = new Capacite.Builder().name("soin").cost(10).build();
        Competence attack = new Capacite.Builder().name("attack").cost(15).build();
        Competence sort = new Capacite.Builder().name("sort").cost(12).build();

        Batiment caserne = new Batiment(new CaserneFactory());
        //System.out.println(caserne);
        Batiment forge = new Batiment(new ForgeFactory());
        Batiment chateau = new Batiment(new ChateauFactory());

        Personnage magicien = new Personnage(new MageFactory());
        //System.out.println(magicien);
        Personnage guerrier = new Personnage(new GuerrierFactory());
        Personnage archer = new Personnage(new ArcherFactory());
        Personnage nain = new Personnage(new GuerrierFactory());

        nain.setArmement(hache);
        magicien.setArmement(baton);
        guerrier.setArmement(epee);
        archer.setArmement(arc);

        magicien.addAttributs(mana);
        magicien.addAttributs(vie);

        nain.addAttributs(vie);
        nain.addAttributs(force);

        guerrier.addAttributs(vie);
        guerrier.addAttributs(force);

        archer.addAttributs(vie);
        archer.addAttributs(force);

        Royaume r1 = new Royaume.Builder()
                .batiments(caserne)
                .batiments(caserne)
                .batiments(forge)
                .batiments(chateau)
                .personnages(magicien)
                .personnages(archer)
                .personnages(guerrier)
                .build();

        Royaume r2 = new Royaume.Builder()
                .batiments(chateau)
                .batiments(forge)
                .personnages(archer)
                .personnages(guerrier)
                .build();

        List<Royaume> jeu = Storage.getInstance().getRoyaumeList();
        jeu.add(r1);
        jeu.add(r2);

        System.out.println(jeu);

    }
}
