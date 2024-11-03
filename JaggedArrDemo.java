
public class JaggedArrDemo {
    public static void main(String[] args) {
        // Jagged Arrays :
        // Contains fixed number of rows
        // but varied number of columns

        int jnums[][] = new int[3][];  // jagged

        jnums[0] = new int[3];
        jnums[1] = new int[4];
        jnums[2] = new int[2];
        
         
        // generating random numbers in jnums
        // iterating each row with varied no. of columns
        for (int i=0; i<jnums.length; i++){
            // specify each row's (array) size
            for (int j=0; j<jnums[i].length; j++){
                jnums[i][j] = (int)(Math.random() * 10);
            }            
        }

        // enhanced - for loop
        for(int row[]: jnums){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
