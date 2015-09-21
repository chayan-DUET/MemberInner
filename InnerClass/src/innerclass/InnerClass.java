/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author Chayan_pc
 */
public class InnerClass {
   static  int man;
   static  int man1;
     static  int man2;
     static int total;
    public static  int Mat_inner()
    {
     
      class inner {
            int hand1;
            int hand2;
            int act;

            public inner(int yy,int zz) {
                hand1=yy;
                hand2=zz;
                act=hand1+hand2;
            }
            
           
        
        }
      inner in =new inner(20,25);
      ///in.y=100;
     // in.z=100;
      //in.r=in.y+in.z;
      
      
      
        
        return in.act;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Mat_inner());  
        // InnerClass c=new InnerClass();       or
       // System.out.println( c.Mat_inner());;
        InnerClass inc=new InnerClass();
        inc.man=inc.Mat_inner();
        inc.man1=1;
        inc.man2=2;
        inc.total=inc.man+inc.man1+inc.man2;
        System.out.println("Total man="+inc.total);
        
    }
}
