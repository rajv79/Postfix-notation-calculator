 
package p2vivek;

import java.util.Stack;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class P2Vivek {

    public static void main(String []args){
        String ex = JOptionPane.showInputDialog(null, "Enter a postfix notation expreesion :-");
        
           Stack <Double>S = new Stack(); 
          
           StringTokenizer tokens = new StringTokenizer(ex); 
           while (tokens.hasMoreTokens())
           {
               
                String token = tokens.nextToken();
                char c = token.charAt(0);
                if (isOperator(c))
                {
                    double y = ((Double)S.pop()).doubleValue();
                    double x = ((Double)S.pop()).doubleValue();
                    switch (c)
                    {
                        case '+':S.push(new Double(x+y));
                        
                        break;
                        case '-':S.push(new Double(x-y));
                        break;
                        case '*':S.push(new Double(x*y));
                        break;
                        case '/':S.push(new Double(x/y)); 
                        break;
                        
                    } 
                }
                else if (!isWhiteSpace(c)) 
                    S.push(Double.valueOf(token));
              
               
           } 
          
         System.out.println(((Double)S.pop()).doubleValue());
     }
    
   
     
     public static boolean isOperator(char c) {
         return ( (c == '+') || (c == '-') ||(c == '*') || (c == '/') );
         
     }
     public static boolean isWhiteSpace(char c) {
         return ( (c == ' ')  || (c == '\n') ||(c == '\t') || (c == '\r') );
        
         
     }
        
    }
