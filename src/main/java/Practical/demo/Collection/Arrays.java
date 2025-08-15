package Practical.demo.Collection;

public class Arrays {

    public static void main(String args[]){

//        1D array
//        int[] x = {1,2,3};
//        for(int s : x) {
//            System.out.println(s);
//        }

//        int[] x1 = new int[3];
//        for(int i =0; i < x1.length; i++){
//            System.out.println(i);
//        }

        //.....................................................//

//        2D arrays
//        int[][] y = {{1,1},{2,2}};
//
//        for (int[] t : y){
//            for (int s : t) {
//                System.out.println(s);
//            }
//        }

//        int[][] y1 = new int[2][3];
//        for(int i =0; i<y1.length; i++){
//            for (int j = 0; j<y1[i].length; j++){
//                System.out.println(y1[i][j]);
//            }
//        }

        //...................................................................//

//        3D arrays
//        int[][][] z = {{{1,1,1},{2,2,2},{3,3,3}}};
//
//        for (int[][] p : z){
//            for (int[] s : p){
//                for (int o : s){
//                    System.out.println(o);
//                }
//            }
//        }

        int[][][] z1 = new int[2][3][4];

        for (int i = 0; i< z1.length; i++){
            for (int j = 0; j<z1[i].length; j++){
                for (int k = 0; k<z1[i][j].length; k++){
                    System.out.println(z1[i][j][k]);
                }
            }
        }
    }
}
