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
public class Bookshelf {

    private int x;
    private int y;
    private Book[][] books;

    public Bookshelf(int x, int y) {
        this.x = x;
        this.y = y;
        this.books = new Book[x][y];
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                this.books[i][j] = null;

            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //storeBook: receive a valid book, shelf number and place number and put the book on the shelf. 
    //Assume that such a location is available.
    public void storeBook(Book aBook, int x, int y) {
        this.books[x][y] = aBook;

    }
    //StoreBook: You receive a book and a valid shelf number, and stores it in the first free place on that shelf.
    //Assume there is room to store the book.
    
    public void storeBookShelf(Book aBook, int x){
        int j=0;
        boolean ok=false;
        while (!ok){
            if ( this.books[x][j]!=null){
                j++;
            }else{
               this.books[x][j]= aBook ;
               ok=true;
            }
        }
        
        
    }
    
    
    //removeBook: receives the title of a book, and removes and returns the book with that title, leaving its place available. 
    //Please note that the book may not exist.

    public Book removeBook(String aName) {
        int i = 0;
        Book aux = null;
        boolean ok = false;
        while (i < x & !ok) {
            int j = 0;
            while (j < y & !ok) {
                if (this.books[i][j] != null) {
                    if (this.books[i][j].getName().equals(aName)) {
                        aux = this.books[i][j];
                        this.books[i][j] = null;
                        ok = true;
                    }
                }
                j++;
            }
            i++;
        }
        return aux;

    }

    //calculate: calculates and returns the heaviest book on the shelf.
    public int calculates() {
        int aux = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (this.books[i][j] != null) {
                    aux = aux + this.books[i][j].getWeight();
                }
            }

        }
        return aux;

    }

    public Book heaviestBook() {
        Book idMax = null;
        int max = -1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (this.books[i][j] != null) {
                    if (this.books[i][j].getWeight() > max) {
                        max = this.books[i][j].getWeight();
                        idMax = this.books[i][j];
                    }
                }

            }

        }
        return idMax;

    }

}
