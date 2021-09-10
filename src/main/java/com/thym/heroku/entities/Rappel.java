package com.thym.heroku.entities;

public class Rappel {
private String titre,date,type;

public Rappel(String titre, String date, String type) {
	this.titre = titre;
	this.date = date;
	this.type = type;
}

public Rappel() {
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public boolean verif()
{
if(this.date.equals("")||this.titre.equals("")||this.type.equals(""))
	return false;
else if(this.titre.length()<4)
	return false;
else return true;

}





}
