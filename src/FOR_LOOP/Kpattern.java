package FOR_LOOP;

public class Kpattern {
    public static void main(String args[]){
                int size = 7;
                for (int i = size; i >= 1; i--) {
                    for (int j =1 ; j <= i; j++) {
                        System.out.print("*");
                    }
                            System.out.println(" ");
                }
                for(int i=1; i<size; i++){
                    for(int j =1;j<=i+1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }


