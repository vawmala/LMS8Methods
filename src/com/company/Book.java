package com.company;

import java.util.ArrayList;


public class Book {

    public void turning() {
        System.out.println("Данный метод запрашивает страницу на которую нужно перелистнуть Книгу.\nПосле ввода данной страницы метод открывает книгу на данной странице");
    }

    public void turning (ArrayList<String> chapters) {
        System.out.println("Данный метод запрашивает у читателя необходимую главу и открывает ее в книге");
    }

    public ArrayList<String> infoContent() {
        System.out.println("Данный метод возвращает список глав находящихся в списке");
        ArrayList<String> chapters = new ArrayList<>();
        return chapters;
    }

    public void indicatesChapter () {
        System.out.println("Метод определяет главу для указанной читателем страницы");
    }

}

