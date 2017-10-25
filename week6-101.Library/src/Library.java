
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ficonic Terry
 */
public class Library {
    
    private ArrayList<Book> book;
    
    public Library(){
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.book.add(newBook);
    }
    
    public void printBooks(){
        for(Book bk :book){
            System.out.println(bk);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(int i = 0; i < this.book.size(); i++){
            if(StringUtils.included(this.book.get(i).title(), title)){
                found.add(this.book.get(i));
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.book.size(); i++) {
            if (StringUtils.included(this.book.get(i).publisher(), publisher)) {
                
                found.add(this.book.get(i));
            }
        }
        return found;

    }
    
     public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.book.size(); i++) {
            if (this.book.get(i).year() == year) {
                found.add(this.book.get(i));
            }
        }
        return found;
    
   }
     
}
