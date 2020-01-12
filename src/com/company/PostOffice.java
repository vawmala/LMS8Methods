package com.company;




public class PostOffice {



    public void updatePackageList () {
        System.out.println("При каждой новой поссылке метод создает новую поссылку и добавляет ее в список поссылок с ее хар-ками");
    }

    public void packingSandingPackage () {
        System.out.println("С помощью данного метода когда поссылка упакована попадает в базу \"упакованных поссылок\", при отправке в базу \"отправленных поссылок\"");
    }

    public static int calculatingWeight (int lenght, int width, int height ) {
        return lenght*width*height;
    }

}
