package homework2;
import java.io.*;
import java.util.*;
import static java.lang.System.*;


public class HomeWork2 {

    
    public static void main(String[] args)
            throws NumberFormatException, IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
    // Массивы. Задание 1
    int[] firstLast6 = {13, 6, 1, 2, 3};
            if((firstLast6[0] == 6) || (firstLast6[4] == 6))
                out.printf("true\n");
            else
                out.printf("false\n");
    
    // Массивы. Задание 2
    int[][] commonEnd = {{1, 2, 3}, {7, 3, 3}};
            if((commonEnd[0][0] == commonEnd[1][0]) || (commonEnd[0][2] == commonEnd[1][2]))
                out.printf("true\n");
            else
                out.printf("false\n");
            
    // Массивы. Задание 3
    int[] reverse3 = {1, 2, 3};
        for(int i = 0; i < reverse3.length / 2; i++){
            int temp = reverse3[i];
            reverse3[i] = reverse3[reverse3.length - i - 1];
            reverse3[reverse3.length - i - 1] = temp;
        }
        out.println(Arrays.toString(reverse3));
        
    // Массивы. Задание 4
    int[] bigDiff = {7, 2, 10, 9};
    int max = 0;
    int min = 100;
    for(int i = 0; i < bigDiff.length; i++){
        if(max < bigDiff[i]){
            max = bigDiff[i];
        }
        if(min > bigDiff[i]){
            min = bigDiff[i];
        }
    }
    out.println(max-min);

    // Массивы. Задание 5
    int[] centeredAverage = {-10, -4, -2, -4, -2, 0};
    int maximal = centeredAverage[0];
    int minimal = centeredAverage[0];
    int summa = 0;
    double avg;
    for(int x : centeredAverage){
	summa += x;
	if(maximal < x) maximal = x;
	if(minimal > x) minimal = x;
    }
    avg = (double)(summa - maximal - minimal)/(centeredAverage.length-2);
    out.print(avg);
    out.println();
    
          
        
    
    }
}
