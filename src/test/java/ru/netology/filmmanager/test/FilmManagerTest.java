package ru.netology.filmmanager.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.filmmanager.FilmManager;


public class FilmManagerTest {

    FilmManager man = new FilmManager();

    @Test//пустая афиша
    public void noTitleShow() {

        String[] expected = {};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// добавить один фильм
    public void addNewTitle() {
        man.addNewTitle("F1");

        String[] expected = {"F1"};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// добавить несколько фильмов
    public void addFifteenTitles() {
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");
        man.addNewTitle("F11");
        man.addNewTitle("F12");
        man.addNewTitle("F13");
        man.addNewTitle("F14");
        man.addNewTitle("F15");

        String[] expected = {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "F13", "F14", "F15"};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести 10 фильмов (по умолчанию)
    public void findDefaultNumberTitles() {
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");
        man.addNewTitle("F11");
        man.addNewTitle("F12");
        man.addNewTitle("F13");
        man.addNewTitle("F14");
        man.addNewTitle("F15");

        String[] expected = {"F15", "F14", "F13", "F12", "F11", "F10", "F9", "F8", "F7", "F6"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести 5 фильмов (заказной)
    public void findFiveTitles() {
        FilmManager man = new FilmManager(5);
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");
        man.addNewTitle("F11");
        man.addNewTitle("F12");
        man.addNewTitle("F13");
        man.addNewTitle("F14");
        man.addNewTitle("F15");

        String[] expected = {"F15", "F14", "F13", "F12", "F11"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести 10 фильмов (заказной)
    public void findTenTitles() {
        FilmManager man = new FilmManager(10);
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");

        String[] expected = {"F10", "F9", "F8", "F7", "F6", "F5", "F4", "F3", "F2", "F1"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести 5 фильмов (заказной, ниже лимита)
    public void findTitlesBelowLimit() {
        FilmManager man = new FilmManager(10);
//        man.addNewTitle("F1");
//        man.addNewTitle("F2");
//        man.addNewTitle("F3");
//        man.addNewTitle("F4");
//        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");

        String[] expected = {"F10", "F9", "F8", "F7", "F6"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести 1 фильм (заказной)
    public void findOneTitles() {
        FilmManager man = new FilmManager(1);
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");

        String[] expected = {"F10"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test// вывести пустую афишу (заказной)
    public void findEmptyTitles() {
        FilmManager man = new FilmManager(0);
        man.addNewTitle("F1");
        man.addNewTitle("F2");
        man.addNewTitle("F3");
        man.addNewTitle("F4");
        man.addNewTitle("F5");
        man.addNewTitle("F6");
        man.addNewTitle("F7");
        man.addNewTitle("F8");
        man.addNewTitle("F9");
        man.addNewTitle("F10");

        String[] expected = {};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
