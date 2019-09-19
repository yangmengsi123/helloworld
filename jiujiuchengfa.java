/**
*@program:九九乘法表
*@Description:用java实现九九乘法表的对齐输出
*@author:yangmengsi123
*@data:2019/9/19
*/
public class Chengfa { 
   public static void main(String args[]){  
     for(int k = 1;k<=9;k++){                 
        for(int j = 1;j<=k;j++){             
           System.out.print(j+"*"+k+"="+(j*k)+"\t");     
               }    
                System.out.println();    
         } 
    }
}