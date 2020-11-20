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
        int tem;
        int maxFood;
        
        ///////////////////// define status of res
        
        System.out.println("====การสร้างร้านอาหารได้เริ่มต้นขึ้นแล้ว====");
        
        System.out.println("กรุณาใส่ชื่อร้าน");
        
        name = scn.nextLine();
        
        System.out.println("กรุณาใส่จำนวนโต๊ะในร้าน");
        
        table = scn.nextInt();
        
        System.out.println("กรุณาใส่อุณหภูมิสูงสุดที่สามารถเข้าร้านได้");
        
        tem = scn.nextInt();
        
        System.out.println("กรุณาใส่จำนวนรายการอาหารสูงสุดที่จะมีได้");
        
        maxFood = scn.nextInt();
        
        OpenRes r = new OpenRes(name,table,tem,maxFood);
        System.out.println("r"); // show status 
        
        /////////////////////////////////////////////////// add menu of food
        int i=1;
        int numMenu;
       
        System.out.println("====กรุณาใส่รายการอาหาร====");
        
        do{
            
        
            System.out.println("-กรุณาใส่เมนูที่ "+(i)+" -");  
            String nameFood;
            if(i==1){
            nameFood = scn.nextLine();
            }
            nameFood = scn.nextLine();
            
            r.F.addFood(i, nameFood);
            System.out.println("เมนูที่ "+(i)+" ของท่านคือ " +nameFood);
            i+=1;
            
        } while(i<=maxFood);
                     
        r.F.GetAllMenu();
        
        
        
        
        
        
        
        
        
        
    }
    
}
