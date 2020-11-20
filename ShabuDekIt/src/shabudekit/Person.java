/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shabudekit;

import java.util.Arrays;

/**
 *
 * @author nnounp
 */
public class Person {
     String[] personInResNow;
  String[] listAllName;
  String namePerson;
  int personCanJoin;
  int tablePerson;
  int numberOfWhoJoin=0;
  int maxPerson;
  int MaxCanSellPerDay;
  double MaxTem ;
  double tem;
  
        
   public Person(int personCanJoin, int numOfFoodCanSell,double MaxTem) {  
        personInResNow = new String[personCanJoin];
        listAllName = new String[numOfFoodCanSell];
        this.maxPerson=personCanJoin;
        this.MaxTem=MaxTem;
        this.MaxCanSellPerDay=numOfFoodCanSell;
    }
   public void AddPersonInformation(String name,double TemAdd,int tableAdd){
    namePerson=name;
    tem=TemAdd;
    tablePerson=tableAdd-1;
          if(TemAdd<=MaxTem){
          
      if(personInResNow[tableAdd-1]!=null){
              System.out.println(name+" ไม่สามารถเข้าร้านได้เนื่องจากโต๊ะที่ "+tableAdd+" เต็ม");
          }else
          AddPerson();
          }else   System.out.println(namePerson+" ไม่สามารถเข้าร้านได้เนื่องจากอุณหภูมิเกิน");  
      }
  public void AddPerson(){
      System.out.println(namePerson+" ได้เข้านั่งที่โต๊ะ "+(tablePerson+1));
      personInResNow[tablePerson]=namePerson;
      listAllName[numberOfWhoJoin]=namePerson;
      numberOfWhoJoin+=1;
  }
  public void GetAllList(){
      System.out.print("รายชื่อคนทั้งหมดที่เข้าร้าน = ");
      if(numberOfWhoJoin>=0){
          for (int i = 0; i < numberOfWhoJoin; i++) {
            System.out.print("คนที่ " + (i + 1) + " " + listAllName[i]+ ",");
             }   
        }else{
            System.out.print(" ยังไม่มีประวัติการเข้า ");
            }
     }  
   public void getAllPersonNow(){
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==null){
                  personInResNow[i]="โต๊ะว่าง";
                
            }
             }
           System.out.println("\nคนในร้านทั้งหมดตอนนี้" + Arrays.toString(personInResNow));
   }

    @Override
    public String toString() {
        return  " จำนวนคนที่เข้าร้านได้ =" + maxPerson + " จำนวนอาหารที่สามารถขายได้ในแต่ละวัน="+MaxCanSellPerDay+", อุณหภูมิของคนที่เข้าร้านต้องไม่เกิน =" + MaxTem ;
    }
   
    
}
