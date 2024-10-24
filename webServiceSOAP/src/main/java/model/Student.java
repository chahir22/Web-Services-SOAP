package model;

import enums.Genre;

public class Student {
    int id;
    String nom;
    String prenom;
    Genre genre;

    public Student() {
    }

    public Student(int id, String nom, String prenom, Genre genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

