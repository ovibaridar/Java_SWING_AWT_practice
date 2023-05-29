/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Asol {
    int isbnnum;
    String bookname;
    String anothername;
    String edition;
    String Writtername;
    String publication;
    public Asol(int isbnnum ,String bookname, String anothername, String edition, String Writtername,String publication){
        
        this.isbnnum = isbnnum;
        this.bookname= bookname;
        this.anothername = anothername;
        this. edition=edition;
        this.Writtername=Writtername;
        this.publication=publication;
    }
    @Override
    public String toString(){
        return ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+"\nISBN = "+isbnnum+"\nThe Book Name :"+bookname+"\nThe Anouther Name Of This Book = "+anothername+
               "\nBook Edition = "+edition+"\nThe Name of Writter = "+Writtername+"\nPublication = "+publication+"\n\n"+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
    }
    public String get(){
        return bookname;
    }
}


