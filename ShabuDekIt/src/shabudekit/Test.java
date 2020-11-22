package shabudekit;

public class Test {
    public OpenRes B;
    public static void main(String[] args) {


            OpenRes r = new OpenRes("test",10,37,50,10);  //ชื่อ , โตีะ , อุณหภูมิ , อาหารสูงสุดในเมนู , จำนวนที่สามารถขายได้ในแต่ละวัน
            System.out.println(r);  
            


           // เพิ่มคนเข้าร้าน
           r.P.AddPersonInformation("eiei", 1, 1); // ชื่อ ,​ อุณหภูมิ, โต๊ะ
           r.P.AddPersonInformation("eie", 2, 2);
         
           r.P.getAllPersonNow(); // แสดงคนที่เคยเข้าร้าน 
          
           r.P.LeavePerson(1); // เอาคนออกจากร้าน
      
           r.F.addFood(1, "ผัดกระเพราวินเนอร์");// แอดเมนูอาหาร
           r.F.GetAllMenu(); // ดูเมนูทั้งหมด
           r.F.CheckStatusOfMenu(); // เช็คสเตตัสในเมนู
           
           r.O.AddOrder(3, 1); //สั่งอาหาร
    }
   
    
    
}
