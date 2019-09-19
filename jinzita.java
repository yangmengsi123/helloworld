/**
*@program:金字塔
*@Description:输入金字塔得层数，打印出金字塔图案
*@author:yangmengsi123
*@date:2019/9/18
*/
public class Pyramid{
       public static void main(String[] args){
       int i = 5;
       for (int j = 1; j <= i; j++){
            int times = (2 * j) - 1;
            int time = 0;
            while(time != (i - j))
            {
                System.out.printf(" ");
                time++;
            }
            while(times != 0){
                System.out.printf("*");
                times--;
            }
            System.out.printf("\n");
            }
        }
 
    }