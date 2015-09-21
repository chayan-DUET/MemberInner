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
   static  int x;
    public static  int Mat_inner()
    {
     
      class inner {
            int y;
            int z;
            int r;
           
        
        }
      inner in =new inner();
      in.y=100;
      in.z=100;
      in.r=in.y+in.z;
      
      
      
        
        return in.r;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Mat_inner());  
        // InnerClass c=new InnerClass();       or
       // System.out.println( c.Mat_inner());;
    }
}
