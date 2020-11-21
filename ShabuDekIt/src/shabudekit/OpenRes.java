package shabudekit;

import shabudekit.Food;


public class OpenRes {
    public Person P;
    public Food F;
    public Order O;
    
    String  NameRes;
    
    public OpenRes (String Name,int personCanJoin,double MaxTem, int NumberOfFood, int numOfDish, int maxMenu){
        
        P = new Person(personCanJoin,MaxTem);
        F = new Food(NumberOfFood);
        O = new Order(personCanJoin,numOfDish,maxMenu);
        
        this.NameRes=Name;
    }

    @Override
    public String toString() {
        return "ชื่อร้าน ="+NameRes + P  + F ;
    }
    
    
     
    
    
    
}
