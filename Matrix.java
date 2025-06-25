
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {

    public static boolean checkMatrix(int[][] mat1){
        int constantValue = mat1[0][0]+mat1[0][1]+mat1[0][2];

        // for row check
        for(int i=0;i<3;i++)
        {
            int rowValue = mat1[i][0]+mat1[i][1]+mat1[i][2];
            if(rowValue!=constantValue) return false;
        }

        // for column check
        for(int i=0;i<3;i++)
        {
            int columnValue = mat1[0][i]+mat1[1][i]+mat1[2][i];
            if(columnValue!=constantValue) return false;
        }

        // for diagonal check
      int  diagonal1 =mat1[0][0]+ mat1[1][1]+mat1[2][2];
      int  diagonal2 =mat1[0][2]+ mat1[1][1]+mat1[2][0];

      if(diagonal1 != constantValue || diagonal2 != constantValue)
      return false;

        
    return  true;
    }
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];

        try {
            File file = new File("Magic.txt");
            Scanner scanner = new Scanner(file);
            for(int i = 0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                   if(scanner.hasNextInt())
                   {
                    matrix1[i][j] = scanner.nextInt();
                   }
                   else{
                    System.out.println("Not enough Number");
                   }
                }
            }
            scanner.close();
            if(checkMatrix(matrix1))
            {
                System.out.println("Successfull");
            }
            else{
                System.out.println("unsuccessfull");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
