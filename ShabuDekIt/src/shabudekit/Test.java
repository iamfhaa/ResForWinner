package shabudekit;

public class Test {
    public OpenRes B;
    public static void main(String[] args) {


            OpenRes r = new OpenRes("test",10,37,50,10);  //name, table , tempeture , the maximum food in the menu , the number of food can sell per day
            System.out.println(r);  
            


           // add the person join in the resturant
           r.P.AddPersonInformation("eiei", 1, 1); // name ,​ temperuture, table
           r.P.AddPersonInformation("eie", 2, 2);
         
           r.P.getAllPersonNow(); // show the person already join in the resturant
          
           r.P.LeavePerson(1); // leave the person out of the resturant
      
           r.F.addFood(1, "ผัดกระเพราวินเนอร์");// add the 
           r.F.GetAllMenu(); // get all of menu
           r.F.CheckStatusOfMenu(); // check the status of menu
           
           r.O.AddOrder(3, 1); //order the food
    }
   
    
    
}
