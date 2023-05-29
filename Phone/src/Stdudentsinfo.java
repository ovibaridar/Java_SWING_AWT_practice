/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Stdudentsinfo {
    String sname;
    int stid;
    String bname;
    String depname;
    int sphone;
    String isudate;
    String subdate;
    String review;
    public Stdudentsinfo(String sname,
    int stid,
    String bname,
    String depname,
    int sphone,
    String isudate,
    String subdate,String review){
     
     this.sname=sname;
     this.stid=stid;
     this.bname=bname;
     this.depname=depname;
     this.sphone=sphone;
     this.isudate=isudate;
     this.subdate=subdate;
     this.review =review;
     
 }
    @Override
 public String toString(){
     return "Student Name = "+sname+"\nStudent Id = "+stid+"\nBook Name = "+bname+"\nDepartment Name = "+depname+"\nStudent Phone Number = "+sphone+"\nBook Isu Date = "
             +isudate+"\nSubmission Date = "+subdate+"\nWhats Your Review = "+review;
 }
 public int gett(){
     return stid;
 }
    
}
