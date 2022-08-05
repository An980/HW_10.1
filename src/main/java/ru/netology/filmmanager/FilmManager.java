package ru.netology.filmmanager;

public class FilmManager {

    //---------------------------------------Variables---------------------------------------//

    protected String[] titles = new String[0];//Базовая афиша

    protected int maxTitlesLimit;//лимит фильмов

    public FilmManager() {//лимит в 10 фильмов
        this.maxTitlesLimit = 10;
    }

    public FilmManager(int maxTitlesLimit) {//заказной лимит кол-ва фильмов
        this.maxTitlesLimit = maxTitlesLimit;
    }

    //---------------------------------------Methods---------------------------------------//

    public void addNewTitle(String title) {
        String[] tmpArr = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmpArr[i] = titles[i];
        }
        tmpArr[titles.length] = title;
        titles = tmpArr;
    }

    public String[] findAll() {
        return titles;
    }

    public String[] findLast() {
        int resultLenght;

        if (titles.length >= maxTitlesLimit) {
            resultLenght = maxTitlesLimit;
        } else {
            resultLenght = titles.length;
        }
        String[] result = new String[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = titles[titles.length - 1 - i];
        }
        return result;
    }


}

