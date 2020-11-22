package shabudekit;
//menu = scn.nextInt();
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
        
        System.out.println("====การสร้างร้านอาหารได้เริ่มต้นขึ้นแล้ว====");
        
        System.out.println("กรุณาใส่ชื่อร้าน");
        
        name = scn.nextLine();
        
        System.out.println("กรุณาใส่จำนวนโต๊ะในร้าน");
        
        table = scn.nextInt();
        
        System.out.println("กรุณาใส่อุณหภูมิสูงสุดที่สามารถเข้าร้านได้");
        
        tem = scn.nextDouble();
        
        System.out.println("กรุณาใส่จำนวนรายการอาหารสูงสุดที่จะมีได้ ");
        
        maxFood = scn.nextInt();
        
        System.out.println("กรุณาใส่จำนวนรายการอาหารที่สามารถขายได้ต่อวัน");
        
        maxDish = scn.nextInt();
        
       OpenRes r = new OpenRes(name,table,tem,maxFood,maxDish);   
        System.out.println(r); // show status 
        
        /////////////////////////////////////////////////// add menu of food
        int i=1;
        
       
        System.out.println("====กรุณาใส่รายการอาหาร====");
        
        do{
            
        
            System.out.println("-กรุณาใส่เมนูที่ "+(i)+" -");  
            String nameFood;
           
            nameFood = scn.next();
            
           r.F.addFood(i, nameFood);
            System.out.println("เมนูที่ "+(i)+" ของท่านคือ " +nameFood);
            i+=1;
            
        } while(i<=maxFood);
                     
        r.F.GetAllMenu();
        
        /////////////////////////////menu start
        
        int numMenu=1;
        
        while(numMenu==1|numMenu==2|numMenu==3|numMenu==4|numMenu==5){
            
            System.out.println("===กรุณาเลือกสิ่งที่ท่านต้องการทำ===");
            
            System.out.println("1 คนเข้าร้าน"+"\n2 คนออกร้าน"+"\n3 ออเดอร์อาหาร"+"\n4 เช็คคนในร้านตอนนี้"+"\n5 เช็คสถานะร้าน"+"\n6 จบการทำงาน");
            
            numMenu = scn.nextInt();
            switch (numMenu) {     
            case 1:             
                            String namein;
                            int temin;
                            int tablein;
                            
                            System.out.println("ใส่ชื่อคนเข้า");
                            
                            namein = scn.next();
                            
                            System.out.println("ใส่อุณหภูมิ");
                            
                            temin = scn.nextInt();
                            
                            System.out.println("เลือกโต๊ะที่จะนั่ง");
                            
                            tablein = scn.nextInt();
                           if(tablein<=r.P.getMaxPerson()){ 
                            r.P.AddPersonInformation(namein, temin, tablein);
                           }else System.out.println("ไม่มีโต๊ะ");
                break;
            case 2:         
                        int tableout;
                    
                        System.out.println("เลือกโต๊ะที่จะออก");
                        
                        tableout = scn.nextInt();
                           if(tableout<=r.P.getMaxPerson()){ 
                           r.P.LeavePerson(tableout);
                           }else System.out.println("ไม่มีโต๊ะ");
                        
                
                break;
                
            case 3:   
                
                
                
                int tableOrder;
                int numMenuOrder;
                
                System.out.println("เลือกโต๊ะที่จะสั่งอาหาร");
                tableOrder = scn.nextInt();
                
                r.F.GetAllMenu();
                System.out.println("เลือกเมนูที่จะสั่ง (เป็นตัวเลข)");
                
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
