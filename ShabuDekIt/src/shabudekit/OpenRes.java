package shabudekit;

import shabudekit.Food;


public class OpenRes {
    public Person P;
    public Food F;
    public Order O;
    
    String  NameRes;
    
    public OpenRes (String Name,int personCanJoin,double MaxTem, int NumberOfFood, int numOfDish){
        //name , table , temperature , the maximum of food in memu, the number of food can sell per day
        P = new Person(personCanJoin,MaxTem);
        F = new Food(NumberOfFood);
        O = new Order(personCanJoin,numOfDish,NumberOfFood);
        
        this.NameRes=Name;
    }

    @Override
    public String toString() {
        return "Name of resturant ="+NameRes + P  + "\n"+ F + O ;
    }
    
    
     
    
    
    
}
