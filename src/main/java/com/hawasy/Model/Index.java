package com.hawasy.Model;

import java.util.ArrayList;
import java.util.List;

public class Index {
    //Attributs
    private String name;
    private List<Devise> DeviseList;

    //Constructeur
    public Index(String name){
        this.name = name;
        DeviseList = new ArrayList<>();
    }
    //Constructeur
    public Index(String name,int choice){
        this.name = name;
        DeviseList = new ArrayList<>();
        if(choice == 1)
        {
            newDeviselist();
        }
    }

    //Ajoute une equity à l'attribut liste
    public void addDevise(Devise devise){
        DeviseList.add(devise);
    }

    //Ajoute crée et ajoute les différentes devises dans l'index;
    public void newDeviselist()
    {
        Devise euros= new Devise("euros",1.0000);
        Devise dollarUS= new Devise("dollar des Etats Unis",1.0627);
        Devise livreSterling= new Devise("livre sterling",0.7044);
        Devise francSuisse= new Devise("franc suisse",1.0872);
        Devise roubleRusse= new Devise("rouble russe",70.4286);
        Devise yen= new Devise("yen",130.0310);
        Devise baht= new Devise("baht",38.0488);
        Devise yuan= new Devise("yuan",6.7954);
        Devise nouveauIsraeliShequel= new Devise("nouveau israeli shequel",4.1328);
        Devise dollarCanadien= new Devise("dollar canadien",1.4150);

        addDevise(euros);
        addDevise(dollarUS);
        addDevise(livreSterling);
        addDevise(francSuisse);
        addDevise(roubleRusse);
        addDevise(yen);
        addDevise(baht);
        addDevise(nouveauIsraeliShequel);
        addDevise(dollarCanadien);
        addDevise(yuan);
    }

    //Supprime une devise de l'attribut liste
    public void deleteEquity(Devise devise)
    {
        for(int i=0;i<DeviseList.size();i++)
        {
            if(DeviseList.get(i).getName()== devise.getName())
            {
                DeviseList.remove(i);
            }

        }
    }

    //retourne la liste
    public List<Devise> getList()
    {
        return this.DeviseList;
    }

    //Retourne le nombre d'élément de la liste
    public int getSize()
    {
        return this.DeviseList.size();
    }
}
