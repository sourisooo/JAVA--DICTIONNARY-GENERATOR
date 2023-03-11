
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Keyread { 
    
    // String[] blist = {"A","B","C","D","E","F","G","H","I"};

    // String[] blist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",1,2,3,4,5,6,7,8,9,0,"a","b","c","d","e","f","g","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!","#","$","%","&","(",")","*","+",",","-",".","/",":",";","<","=",">","?","@","[","]","^","_","{,","}","~"};
    
    String[] blist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    String[] rvalue={};

     List<String> rlist = new ArrayList<>();
     String test="";
     String result = "";
     String key;
     


    String k = blist[(int)(Math.random()*blist.length)];


     public Keyread(){

    
        
        this.key = k;
  
   
        }



    public String secretvalue()
    
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


            // System.out.println(test);


            return test;

      
   
        //     System.out.println(t1);
        //  System.out.println(tt1);


    }


    public void read() throws IOException {

     

        FileReader fr = new FileReader("C:\\Users\\Public\\dictionnary.txt");
        BufferedReader br = new BufferedReader(fr);
        String ligne = br.readLine();

    
        while(ligne != null) {
      
        if (ligne.contains(","))

        {
        String[] listeMots = (ligne.split(","));

        
        
        for(String mot : listeMots) 
              
                 {
                    
                    rlist.add(mot);
                        

                }
            
           

         }
       

         ligne = br.readLine();

        
         }
        // System.out.println(ligne);
        br.close();
        System.out.println("The size of the dictionnary is: "+rlist.size());
        System.out.println(rlist.get(1)+rlist.get(1).length());
       
      

       
}


public void compare() {

    secretvalue();


    System.out.println("Secret value is: "+test+" Please wait...");

    // rlist.forEach(e -> 
    
    //     {
    //         if(e==test)
            
    //         {System.out.println("Secret value is found at : "+rlist.indexOf(e));}

        

    //     });

        rlist.contains((" "+test));


        System.out.println("Secret value is: "+rlist.contains((test)));
        System.out.println("Secret value at index: "+rlist.indexOf((test)));

}




}
 





public class ReadDictionnary {
    public static void main(String[] args) throws IOException  {

        Keyread t0 = new Keyread();
        // secret[0] = t0.secretvalue();
    
        t0.read();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();
        t0.compare();

}}

