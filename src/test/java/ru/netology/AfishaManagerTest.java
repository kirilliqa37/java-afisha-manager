package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();
    AfishaManager manager1 = new AfishaManager(5);
    AfishaManager manager2 = new AfishaManager(11);

    Film one = new Film("Бладшот");
    Film two = new Film("Вперед");
    Film three = new Film("Отель Белград");
    Film four = new Film("Джентельмены");
    Film five = new Film("Человек-невидимка");
    Film six = new Film("Тролли.Мировой тур");
    Film seven = new Film("Номер один");
    Film eight = new Film("Фильм 8");
    Film nine = new Film("Фильм 9");
    Film ten = new Film("Фильм 10");

    Film eleven = new Film("Фильм 11");

    @Test

    public void filmAddLimit(){
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);


        Film [] actual = manager.findAll();
        Film [] expected = {one, two , three, four, five, six, seven, eight, nine, ten};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void  underLimit(){
        manager.add(one);
        manager.add(two);
        manager.add(three);

        Film [] actual = manager.findAll();
        Film [] expected = {one, two , three};

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void overLimit(){
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        Film [] actual = manager.findAll();
        Film [] expected = {one, two , three, four, five, six, seven, eight, nine, ten, eleven};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmLimit(){
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);


        Film [] actual = manager.findLast();
        Film [] expected = {ten, nine , eight, seven, six, five, four, three, two, one};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void lastUnderLimit(){
        manager1.add(one);
        manager1.add(two);
        manager1.add(three);
        manager1.add(four);
        manager1.add(five);



        Film [] actual = manager1.findLast();
        Film [] expected = {five, four, three, two, one};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastOwerLimit(){
        manager2.add(one);
        manager2.add(two);
        manager2.add(three);
        manager2.add(four);
        manager2.add(five);
        manager2.add(six);
        manager2.add(seven);
        manager2.add(eight);
        manager2.add(nine);
        manager2.add(ten);
        manager2.add(eleven);


        Film [] actual = manager2.findLast();
        Film [] expected = {eleven, ten, nine , eight, seven, six, five, four, three, two, one};

        Assertions.assertArrayEquals(expected, actual);
    }

}
