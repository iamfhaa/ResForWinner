package shabudekit;

import java.util.Arrays;

public class Food {
    private String[] nameOfFood;
    private String nameFood;
    private int MaxOfFood;
    private int NumFoodNow;
    private int NumOfMenu;
    private int CheckMenuForAdd;

    
    public Food(int NumberOfFood) {  
        nameOfFood = new String[NumberOfFood];
        this.MaxOfFood=NumberOfFood;
     }
    
    public void addFood(int NumMenu,String name){   //เพิ่มเมนูอาหาร 
        nameFood=name;
        NumOfMenu=NumMenu-1;
        CheckMenuForAdd();
        
        if(CheckMenuForAdd==1){
        NumFoodNow+=1;
        nameOfFood[NumOfMenu]=nameFood;
        System.out.println("\nเพิ่มเมนู "+nameFood+" ลงไปในรายการที่"+NumMenu);}
      }
    
    public void CheckStatusOfMenu(){ //เช็คสเตตัสอาหาร
        
        System.out.println("รายการอาหารที่ร้านมีได้ทั้งหมดคือ"+ MaxOfFood);
        System.out.println("ตอนนี้รายการอาหารที่มีอยู่คือ "+NumFoodNow);
        System.out.println("สามารถเพิ่มรายการอาหารได้อีก"+(MaxOfFood-NumFoodNow));
        
    }
    
    private void CheckMenuForAdd(){ //เช็คเมนูว่าสาม่ารถแอดได้ไหม
        
        if(nameOfFood[NumOfMenu]==null){
            CheckMenuForAdd=1;
           
        }else
        
        System.out.println("รายการ "+nameFood+" ไม่สามารถเพิ่มลงไปในเมนูได้ เนื่องจากรายการนี้มีเมนูอื่น");
        CheckMenuForAdd=2;
        
        
    }
    
    public void GetAllMenu(){    //เช็คเมนูทั้งหมด
         for (int i = 0; i < MaxOfFood; i++) {
            if(nameOfFood[i]==null){
                  nameOfFood[i]="รายการนี้ว่าง";
               
            }
            
             }
          System.out.println("\nเมนูอาหารตอนนี้" + Arrays.toString(nameOfFood));
    }

    public int getMaxOfFood() {
        return MaxOfFood;
    }

    public int getNumFoodNow() {
        return NumFoodNow;
    }

    @Override
    public String toString() {
        return " รายการอาหารที่มีได้ในร้าน =" + MaxOfFood + "รายการ";
    }
}
