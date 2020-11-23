package shabudekit;

import java.util.Scanner;

public class TestOfScanner {
    
    public static void main(String[] args) {
        
        /////Scanner Start!!!!!!!!!!!!! 
        
         Scanner scn = new Scanner(System.in);
         
        /////Scaner Start !!!!!!!!!!!!!
        int menu;
        String name;
        int table;
        double tem;
        int maxFood;
        int maxDish;
        
        ///////////////////// define status of res
        
        System.out.println("===The resturant have start====");
        
        System.out.println("Plese in put the name of resturant");
        
        name = scn.nextLine();
        
        System.out.println("Plese  in put the number of table in the resturant");
        
        table = scn.nextInt();
        
        System.out.println("Plese in put the temperature the person can come in the resturant");
        
        tem = scn.nextDouble();
        
        System.out.println("Plese in put the maximum of menu can have ");
        
        maxFood = scn.nextInt();
        
        System.out.println("Plese in put the number of food can sell per day");
        
        maxDish = scn.nextInt();
        
       OpenRes r = new OpenRes(name,table,tem,maxFood,maxDish);   
        System.out.println(r); // show status 
        
        /////////////////////////////////////////////////// add menu of food
        int i=1;
        
       
        System.out.println("====Plese in put the menu====");
        
        do{
            
        
            System.out.println("-Enter the name of the food in menu "+(i)+" -");  
            String nameFood;
           
            nameFood = scn.next();
            
           r.F.addFood(i, nameFood);
            System.out.println("The menu "+(i)+"  is  " +nameFood);
            i+=1;
            
        } while(i<=maxFood);
                     
        r.F.GetAllMenu();
        
        /////////////////////////////menu start
        
        int numMenu=1;
        
        while(numMenu==1|numMenu==2|numMenu==3|numMenu==4|numMenu==5){
            
            System.out.println("===Plese in put the number you want to do ===");
            
            System.out.println("1 person join"+"\n2 person leave"+"\n3 order the menu"+"\n4 check the number of person in resnow"+"\n5 check the status of resturant"+"\n6 end of the program");
            
            numMenu = scn.nextInt();
            switch (numMenu) {     
            case 1:             
                            String namein;
                            int temin;
                            int tablein;
                            
                            System.out.println("in put the name of person join");
                            
                            namein = scn.next();
                            
                            System.out.println("in put the temperature of person join");
                            
                            temin = scn.nextInt();
                            
                            System.out.println("choose table you want to sit there");
                            
                            tablein = scn.nextInt();
                           if(tablein<=r.P.getMaxPerson()){ 
                            r.P.AddPersonInformation(namein, temin, tablein);
                           }else System.out.println("don't have a table");
                break;
            case 2:         
                        int tableout;
                    
                        System.out.println("choose table for leave");
                        
                        tableout = scn.nextInt();
                           if(tableout<=r.P.getMaxPerson()){ 
                           r.P.LeavePerson(tableout);
                           }else System.out.println("don't have a table in res");
                        
                
                break;
                
            case 3:   
                
                
                
                int tableOrder;
                int numMenuOrder;
                
                System.out.println("choose table for order food");
                tableOrder = scn.nextInt();
                
                r.F.GetAllMenu();
                System.out.println("choose the menu for order (enter number)");
                
                numMenuOrder = scn.nextInt();
                r.O.AddOrder(tableOrder, numMenuOrder);
                

                break;
                
            case 4:
                
                r.P.getAllPersonNow();
            
            case 5: System.out.println(r);
           
            default:break;
        }
        }
        
        
        
        
        
        
        
        
    }
    
}
