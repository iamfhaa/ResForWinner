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
    
    public void addFood(int NumMenu,String name){   //add food menu 
        nameFood=name;
        NumOfMenu=NumMenu-1;
        CheckMenuForAdd();
        
        if(CheckMenuForAdd==1){
        NumFoodNow+=1;
        nameOfFood[NumOfMenu]=nameFood;
        System.out.println("\nAdded"+nameFood+" in the order"+NumMenu);}
      }
    
    public void CheckStatusOfMenu(){ //check status of food 
        
        System.out.println("all of menu we have now = "+ MaxOfFood);
        System.out.println("now we have "+NumFoodNow);
        System.out.println("can add more menu"+(MaxOfFood-NumFoodNow));
        
    }
    
    private void CheckMenuForAdd(){ //check the menu  it can add?
        
        if(nameOfFood[NumOfMenu]==null){
            CheckMenuForAdd=1;
           
        }else
        
        System.out.println("order "+nameFood+" can't add a menu because the order has another menu ");
        CheckMenuForAdd=2;
        
        
    }
    
    public void GetAllMenu(){    // check all of menu
         for (int i = 0; i < MaxOfFood; i++) {
            if(nameOfFood[i]==null){
                  nameOfFood[i]="the order is null";
               
            }
            
             }
          System.out.println("\n menu is now" + Arrays.toString(nameOfFood));
    }

    public int getMaxOfFood() {
        return MaxOfFood;
    }

    public int getNumFoodNow() {
        return NumFoodNow;
    }

    @Override
    public String toString() {
        return " the menu in resturant=" + MaxOfFood + " the menu ";
    }
}
