import java.util.Arrays;
public class Test1{
    public static void main(String[] args){
		
      int scores[]=new int[]{100,81,68,75,91,66,75,100};
      int newScores[]=new int[]{80,82,71,92,68,71,87,88,81,79,90,77};
	  
        System.out.println("源数组中的内容如下：");
		for(int i=0;i<scores.length;i++){
			
        System.out.print(scores[i]+"\t");
    }
        System.out.println("\n目标数组中的内容如下：");
          for(int j=0;j<newScores.length;j++){
			  
        System.out.print(newScores[j]+"\t");
    }
        System.arraycopy(scores,0,newScores,2,8);
		
        System.out.println("\n替换元素后的目标数组内容如下：");
		
         for(int k=0;k<newScores.length;k++) {
        System.out.print(newScores[k]+"\t");
         }
    }
}