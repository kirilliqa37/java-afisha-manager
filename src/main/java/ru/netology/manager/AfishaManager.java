package ru.netology.manager;


import ru.netology.domain.Film;

public class AfishaManager {
    private Film[] film = new Film[0];
    private int limit = 10;


    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {

    }

    public void add(Film item) {
        Film[] tmp = new Film[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = item;
        film = tmp;
    }

    public Film[] findAll() {
        return film;
    }

    public Film[] findLast() {
        int resultLength;
        if (film.length < limit) {
            resultLength = film.length;
        } else {
            resultLength = limit;
        }
        Film[] lastFilm = new Film[resultLength];
        for (int i = 0; i < lastFilm.length; i++) {
            lastFilm[i] = film[film.length - 1 - i];
        }
        return lastFilm;
    }


}
