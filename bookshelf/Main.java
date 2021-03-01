/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshelf;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bookshelf bs = new Bookshelf(5,3);
       
       Book b = new Book(25, "Estupor y Templores", "Nothomb");
       Book b2 = new Book(15, "Iliada y Odisea", "Ulises");
       Book b3 = new Book(5, "20 mil vueltas..", "Verne");
       Book b4 = new Book(25, "Los peligros de fumar en la cama", "Enriquez");
       Book b5 = new Book(25, "Othelo", "Shakespeare");
       Book b6 = new Book(55, "unLibro", "Anonimo");
       
       bs.storeBook(b, 0, 0);
       bs.storeBook(b2, 2, 1);
       bs.storeBook(b3, 1, 0);
       bs.storeBook(b4, 2, 0);
       bs.storeBook(b5, 3, 2);
       bs.storeBookShelf(b6, 2);
       System.out.println("Shelf weight\n");
       System.out.println(bs.calculates());
       bs.removeBook("Othelo");
       System.out.println("Shelf weight\n");
       System.out.println(bs.calculates());
       System.out.println("The heaviest book is, \n");
       System.out.println(bs.heaviestBook().toString());
       
       
       
       
               
               
       
       
        
        
        
    }
    
}
