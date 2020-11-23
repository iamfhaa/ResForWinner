
package shabudekit;

import java.util.Arrays;

public class Person {
  public  static String[] personInResNow; //person in now
 
  private String namePerson; //name of person
  private int tablePerson; //the table have person
  private int numberOfWhoJoin=0; //the namber of person come in
  private int maxPerson; //the maximum of person
  private double MaxTem ; //the maximum of tempeture
  private double tem; //temperature 
  
        
   public Person(int personCanJoin,double MaxTem) {  
        personInResNow = new String[personCanJoin];
       
        this.maxPerson=personCanJoin;
        this.MaxTem=MaxTem;
       
    }
   public void AddPersonInformation(String name,double TemAdd,int tableAdd){ //choose the person can coming
    namePerson=name;
    tem=TemAdd;
    tablePerson=tableAdd-1;
     if(TemAdd<=MaxTem){
          
      if(personInResNow[tableAdd-1]!=null){
              System.out.println(name+" can't come in the resturant because the table  "+tableAdd+" full");
         }else{
          AddPerson();
          System.out.println(namePerson+" join on this table "+(tablePerson+1));
          
      }
          
     }else   System.out.println(namePerson+" can't coming in this resturant because your temperature is over");  
  }
   
  private void AddPerson(){ // add the person join in the resturant

      personInResNow[tablePerson]=namePerson;
      numberOfWhoJoin+=1;
  }
 
   public void getAllPersonNow(){ //all of list name in the resturant now!!!
       
        String free = "- no person - ";
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==null){
                  personInResNow[i]=free;     
            }
             }
           System.out.println("\n The person in the resturant now" + Arrays.toString(personInResNow));
           
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==free){
                  personInResNow[i]=null;     
            }
             }
           
   }

    @Override
    public String toString() {
        return  " the number of person can join in the resturant=" + maxPerson + ", The max temperature of person =" + MaxTem ;
    }
    
    public void LeavePerson(int numTable){ // leave the person 
        this.tablePerson = numTable-1;
        personInResNow[tablePerson]=null;
        numberOfWhoJoin-=1; 
        System.out.println("\ntable "+numTable+"is clear"); 
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public double getTem() {
        return tem;
    }

    public static String[] getPersonInResNow() {
        return personInResNow;
    }

    public int getNumberOfWhoJoin() {
        return numberOfWhoJoin;
    }
    
    

}
