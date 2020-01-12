package com.company;


import java.util.ArrayList;
// Задание Необходимо доработать созданные в ЛР7 (7. Обзор класса Java (Практика)) классы,
//         дополнить их методами. Методы должны касаться специфики работы с объектом.
//         Примеры методов:
//         Для класса «Книга»: метод, который перелистывает на определенную страницу; метод,
//         который возвращает список глав; метод, определяющий главу для указанной страницы.
//         Для класса «Отделение почты»: метод приема списка посылок; метод, упаковки и
//         отправки списка посылок;
//         Для класса «Клиент магазина»: метод добавления товара в корзину; метод, просмотра
//         накопленных бонусов; метод покупки товаров.
//         Для своего варианта – свои методы.
//         1.1 Дополнить классы нужными методами, для эмуляции действий просто выводить
//         описание действия на экран.
//         1.2 Вызвать методы в тестовом классе (Main)
//         1.3 Перегрузить метод водном из классов. Например, метод, который перелистывает на
//         определенную страницу перегрузить методом, который перелистывает на
//         определенную главу.
//         1.4 Создать статический метод в любом из классов. Например, создать статический метод
//         в классе «Отделение почты», который будет рассчитывать объемный вес посылки, в
//         зависимости от переданных параметров

public class Main {

        public static void main(String[] args) {

        Book book = new Book();
        book.indicatesChapter();
        book.infoContent();
        book.turning();
        ArrayList<String> chapters = new ArrayList<>();
        book.turning(chapters);
        System.out.println();

        PostOffice postOffice = new PostOffice();
        postOffice.updatePackageList();
        postOffice.packingSandingPackage();
        int weight = PostOffice.calculatingWeight(5, 7, 11);
        System.out.println(weight);
        System.out.println();

        CustomerStore customerStore = new CustomerStore();
        customerStore.buyProduct();
        customerStore.putBasket();
        customerStore.watchBonus();

    }
}
