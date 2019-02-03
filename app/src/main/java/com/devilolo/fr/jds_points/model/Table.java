package com.devilolo.fr.jds_points.model;

public class Table {
    private int tab[][];
    private int ligne;
    private int colonne;

    public Table(int n,Players players){
        ligne = players.nbPlayers();
        colonne = n+1;
        tab = new int[colonne][ligne];
        for (int i = 0 ; i < colonne ; i++){
            for (int j = 0 ; j < ligne ; j++){
                tab[i][j] = 0;
            }
        }
    }

    //methode pour calcul des totaux ainsi que les ajouts dentiers dans les cases etc
    public void afficher() {
        String tmp = "Le tableau : \n";
        for (int i = 0 ; i < colonne ; i++){
            for (int j = 0 ; j < ligne ; j++){
                tmp += tab[i][j] + " | ";
            }
            tmp += "\n";
        }
        System.out.println(tmp);
    }
}
