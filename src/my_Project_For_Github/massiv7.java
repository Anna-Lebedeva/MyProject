package my_Project_For_Github;

public class massiv7 {
    public static void main(String[] args) {

        int [] num1 = new int [] {35,345,-345,3,3,3,2,2,5,-25};
        int [] num2 = new int [] {45,45,45,23,23,23,2,2,2,6,0,-345,-25};

        int count=0;
        for (int i = 0; i<num1.length; i++){
            count = 0;
            for (int j = 0 ; j<num2.length; j++){
                if (num1[i]!=num2[j]) {
                    count ++;
                    if (count == num2.length){
                        System.out.println(num1[i]);
                    }
                }


            }

        }}}