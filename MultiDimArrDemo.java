
public class MultiDimArrDemo {
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        
        // generating random numbers in matrix
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }            
        }

        // normal for loop
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        // enhanced - for loop
        for(int row[]: matrix){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
