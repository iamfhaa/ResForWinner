package shabudekit;

import shabudekit.Food;


public class OpenRes {
    public Person P;
    public Food F;
    
    String  NameRes;
    
    public OpenRes (String Name,int personCanJoin,double MaxTem,int numOfFoodCanSell,int NumberOfFood){
        
        P = new Person(personCanJoin,numOfFoodCanSell,MaxTem);
        F = new Food(NumberOfFood);
        
        this.NameRes=Name;
    }

    @Override
    public String toString() {
        return "ชื่อร้าน ="+NameRes + P  + F ;
    }
    
    
     
    
    
    
}
