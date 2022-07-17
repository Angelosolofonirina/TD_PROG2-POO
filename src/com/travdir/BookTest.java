package com.travdir;

public class BookTest {
    public static void main(String[] args) {
        Author Ravelojaonina = new Author("Ravelojaonina","ravelo@gmail.com",'M');
        Author Charles = new Author("Rajoelisolo","joeli@gmail.com",'M');
        Author Clarisse = new Author("Ratsifandrihamanana","clarisse@gmail.com",'F');
        Book first = new Book("Fitiavako",Charles,22000,21);
        Book second = new Book("Mpiandrifody",Ravelojaonina,200_000,12);
        Book next = new Book("Misaotra",Clarisse,230_000,10);
        System.out.println(first.author);
        System.out.println(second.author);
        System.out.println(next.author);
    }
}
