
package androidsoftprogram;

import java.util.Scanner;

public class AndroidSoftProgram {

    public static void main(String[] args) {
        int r,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of ROW and COLOUM:");
        r = s.nextInt();
        c = s.nextInt();
        
        int a1[][] = new int[r][c];
        int a2[][] = new int[r][c];
        int result[][] = new int[r][c];
        
        
        System.out.println("Enter the element of first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a1[i][j]=s.nextInt();
            }
        }
        
        
        System.out.println("Enter the element of second matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a2[i][j]=s.nextInt();
            }
        }
        
        System.out.println("Sum of the two Matrtix is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=a1[i][j]+a2[i][j];
                System.out.printf(result[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
    
}
