package shabudekit;

import shabudekit.Food;


public class OpenRes {
    public Person P;
    public Food F;
    public Order O;
    
    String  NameRes;
    
    public OpenRes (String Name,int personCanJoin,double MaxTem, int NumberOfFood, int numOfDish){
        //ชื่อ , โตีะ , อุณหภูมิ , อาหารสูงสุดในเมนู , จำนวนที่สามารถขายได้ในแต่ละวัน
        P = new Person(personCanJoin,MaxTem);
        F = new Food(NumberOfFood);
        O = new Order(personCanJoin,numOfDish,NumberOfFood);
        
        this.NameRes=Name;
    }

    @Override
    public String toString() {
        return "ชื่อร้าน ="+NameRes + P  + F + O ;
    }
    
    
     
    
    
    
}
