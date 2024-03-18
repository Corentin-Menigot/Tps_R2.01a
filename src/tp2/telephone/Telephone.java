package tp2.telephone;

import java.util.ArrayList;

public class Telephone {
    //attributs de la classe Telephone
    public String libelle;
    private Processeur processeur;
    private Memoire stockage;
    private Ecran ecran;
    private ArrayList<Memoire> ram;

    //constructeur de la classe Telephone
    public Telephone(String libelle, Processeur processeur, Memoire stockage, Ecran ecran) {
        this.libelle=libelle;
        this.processeur=processeur;
        this.stockage=stockage;
        this.ecran=ecran;
        this.ram = new ArrayList<>();
    }

    //méthodes de la classe Telephone
    public void addRam(Memoire ram) {
        this.ram.add(ram);
    }
    public int getNombreGigaRam() {
        int ramTotal=0;
        for (int i=0; i<ram.size(); i++) {
            ramTotal = ramTotal+ram.get(i).getNombreGiga();
        }
        return ramTotal;
    }
    private String typeRam() {
        int i = 1;
        String types = this.ram.get(0).getType()+" "+this.ram.get(0).getNombreGiga()+"G";
        while (i<this.ram.size()) {
            types = types+" + "+this.ram.get(i).getType()+" "+this.ram.get(i).getNombreGiga()+"G";
            i++;
        }
        return types;
    }

    @Override
    public String toString() {
        return libelle+", processeur = "+processeur.getLibelle()+" ("+processeur.getFrequence()+
                "), ram = "+getNombreGigaRam()+"Giga ["+this.typeRam()+"], stockage = ["+
                stockage.getType()+", "+stockage.getNombreGiga()+"Giga], ecran = ["+
                ecran.getType()+", "+ecran.getTaille()+" pouces]";
    }
}
