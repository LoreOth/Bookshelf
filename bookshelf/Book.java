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
public class Book {
    private int weight;
    private String name;
    private String author;

    public Book(int weight, String name, String author) {
        this.weight = weight;
        this.name = name;
        this.author = author;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String toString(){
        return "Author : " + this.getAuthor() + "\nTitle " + this.getName() + "\nWeight" + this.getWeight();
    }
    
}
