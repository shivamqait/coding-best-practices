import java.util.*;
import java.sql.*; 
import java.util.Scanner;  
public class Shipment{
    /*
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://10.0.21.62:3306/Shipment","root","52Shivam@");    
    Statement stmt=con.createStatement();  */
    public Shipment(String name, String Pname, int Pquantity) {  
         this.name=name;
         this.Pname=Pname;
         this.Pquantity=Pquantity;
    }  
    
    Scanner input = new Scanner(System.in);
   public void getProduct(){
       System.out.println("Enter username");
       String name = input.nextLine();
       System.out.println("Welcome " +name);
       System.out.println("Select Products");
       System.out.println("1.Fruits\t|\t2.Furniture\t|\t3.Electronics");
       int opt=input.nextInt();
       switch(opt){  
        case 1: 
            fetch_fruits();
        break;  
        case 2: 
             fetch_furniture();
        break;  
        case 3: 
              fetch_electronics();
        break;  
        default:
        System.out.println("You havent chosen anything");  
        }

    }  
    void fetch_fruits(){
        String sql="select Pname,Pprice,Pquantity from product where Pcategory='Fruit'";
        ResultSet rs = stmt.executeQuery(sql);
        int count=1;
        Shipment s1 = new Shipment(name,Pname,Pquantity);
        while(rs.next()){
            String Pname = rs.getString("Pname");
            int Pprice = rs.getInt("Pprice");
            int Pquantity = rs.getInt("Pquantity");
            System.out.println("count");
            System.out.println("pname = " + Pname);
            System.out.println(", price = " + Pprice);
            System.out.println(", quantity = " + Pquantity);
            count++;
        }
        System.out.println("choose products from given options");
        int opt1 = input.nextInt();
        System.out.println("Enter the quantity you want:");
        int opt2 = input.nextInt();
        if (opt2 > Pquantity){
            System.out.println("Entered quantity is not available");
            break;
        }
        else {
             al.add(s1);
        }

    }
    void fetch_furniture(){
        String sql="select Pname,Pprice,Pquantity from product where Pcategory='Furniture'";
        ResultSet rs = stmt.executeQuery(sql);
        Shipment s1 = new Shipment(name,Pname,Pquantity);
        while(rs.next()){
            String Pname = rs.getString("Pname");
            int Pprice = rs.getInt("Pprice");
            int Pquantity = rs.getInt("Pquantity");
            System.out.println("pname " + Pname);
            System.out.println(", price " + Pprice);
            System.out.println(", quantity " +Pquantity);

        }
        System.out.println("choose products from given options");
        int opt1 = input.nextInt();
        System.out.println("Enter the quantity you want:");
        int opt2 = input.nextInt();
        if (opt2 > Pquantity){
            System.out.println("Entered quantity is not available");
            break;
        }
        else {
             al.add(s1);
        }
    }
    void fetch_electronics(){
        String sql="select Pname,Pprice,Pquantity from product where Pcategory='Elect'";
      ResultSet rs = stmt.executeQuery(sql);
      Shipment s1 = new Shipment(name,Pname,Pquantity);
        while(rs.next()){
            String Pname = rs.getString("Pname");
            int Pprice = rs.getInt("Pprice");
            int Pquantity = rs.getInt("Pquantity");
            System.out.println("pname " + Pname);
            System.out.println(", price " + Pprice);
            System.out.println(", quantity " + Pquantity);
        }
        System.out.println("choose products from given options");
        int opt1 = input.nextInt();
        System.out.println("Enter the quantity you want:");
        int opt2 = input.nextInt();
        if (opt2 > Pquantity){
            System.out.println("Entered quantity is not available");
            break;
        }
        else {
             al.add(s1);
        }
    }   
       
    public static void main(String args[]){
        Shipment user1 = new Shipment();
        user1.getProduct();
        ArrayList<Shipment> al=new ArrayList<Shipment>(); 
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
          Shipment u1=(Shipment)itr.next();  
          System.out.println(u1.name+" "+u1.Pname+" "+u1.Pquantity);  
        }  
    
    
    }
}