// Program to print the pattern of the face
public class FacePattern {
    public static void main(String[] args) {
        // Size of the face
        int size = 7;
        
        // Print the top border of the face
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }
        System.out.println();
        
        // Print the eyes and space between them
        for (int i = 0; i < 2; i++) {
            System.out.print("#");
            for (int j = 1; j < size - 1; j++) {
                if (i == 0 && (j == 2 || j == 4)) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
        
        // Print the nose
        for (int i = 0; i < 1; i++) {
            System.out.print("#");
            for (int j = 1; j < size - 1; j++) {
                if (j == size / 2) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
        
        // Print the mouth
        for (int i = 0; i < 1; i++) {
            System.out.print("#");
            for (int j = 1; j < size - 1; j++) {
                if (j == 2 || j == 4) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
        
        // Print the bottom border of the face
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
