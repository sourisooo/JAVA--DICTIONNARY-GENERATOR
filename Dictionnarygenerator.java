
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


class Keygen { 
    
    // String[] blist = {"A","B","C","D","E","F","G","H","I"};

    // String[] blist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",1,2,3,4,5,6,7,8,9,0,"a","b","c","d","e","f","g","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!","#","$","%","&","(",")","*","+",",","-",".","/",":",";","<","=",">","?","@","[","]","^","_","{,","}","~"};
    
    String[] blist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

     List<String> klist = new ArrayList<>();
     String test="";
     String result = "";
     String key;
     
     File compte = new File("C:\\Users\\Public\\Dictionnary.txt");


    String k = blist[(int)(Math.random()*blist.length)];


     public Keygen(){

    
        
        this.key = k;
  
   
        }



    public void create()
    
    {

        String k1 = blist[(int)(Math.random()*blist.length)];

        String k2 = blist[(int)(Math.random()*blist.length)];

        String k3 = blist[(int)(Math.random()*blist.length)];

        String k4 = blist[(int)(Math.random()*blist.length)];

        String k5 = blist[(int)(Math.random()*blist.length)];

        String k6 = blist[(int)(Math.random()*blist.length)];

        // String k7 = blist[(int)(Math.random()*blist.length)];

        // String k8 = blist[(int)(Math.random()*blist.length)];

    

            test=k1+k2+k3+k4+k5+k6;

            // test=k1+k2+k3+k4+k5+k6+k7+k8;

            klist.add(test);


        //  System.out.println(test);

            test="";

   
        //     System.out.println(t1);
        //  System.out.println(tt1);


    }


    public void write() throws IOException {

        double i;

        for(i=0;i<10000000;i++)

        {     
           
  
           create();
           
   
        }
  
        result = klist.toString().trim().replaceAll(" ", "");

        FileWriter fw = new FileWriter("C:\\Users\\Public\\dictionnary.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
    
        bw.newLine();
        bw.write(result);
        bw.flush();
        bw.close();


  
        System.out.println("Size of the dictionnary is: "+klist.size());
    
    }
    


}
 




public class Dictionnarygenerator {
    public static void main(String[] args) throws IOException  {

        Keygen t0 = new Keygen();
        t0.write();
        t0.write();
        



      

}}

