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
    
    public void addFood(int NumMenu,String name){  
        nameFood=name;
        NumOfMenu=NumMenu-1;
        CheckMenuForAdd();
        
        if(CheckMenuForAdd==1){
        NumFoodNow+=1;
        nameOfFood[NumOfMenu]=nameFood;
        System.out.println("\nเพิ่มเมนู "+nameFood+" ลงไปในรายการที่"+NumMenu);}
      }
    
    public void CheckNumOfMenu(){
        
        System.out.println("รายการอาหารที่ร้านมีได้ทั้งหมดคือ"+ MaxOfFood);
        System.out.println("ตอนนี้รายการอาหารที่มีอยู่คือ "+NumFoodNow);
        System.out.println("สามารถเพิ่มรายการอาหารได้อีก"+(MaxOfFood-NumFoodNow));
        
    }
    
    public boolean CheckMenuForAdd(){
        
        if(nameOfFood[NumOfMenu]==null){
            CheckMenuForAdd=1;
            return true;
        }else
        
        System.out.println("รายการ "+nameFood+" ไม่สามารถเพิ่มลงไปในเมนูได้ เนื่องจากรายการนี้มีเมนูอื่น");
        CheckMenuForAdd=2;
        return false;
        
    }
    
    public void GetAllMenu(){
         for (int i = 0; i < MaxOfFood; i++) {
            if(nameOfFood[i]==null){
                  nameOfFood[i]="รายการนี้ว่าง";
               
            }
            
             }
          System.out.println("\nเมนูอาหารตอนนี้" + Arrays.toString(nameOfFood));
    }

    @Override
    public String toString() {
        return " รายการอาหารที่มีได้ในร้าน =" + MaxOfFood + "รายการ";
    }
}
