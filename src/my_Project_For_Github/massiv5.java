package my_Project_For_Github;
//5. Объединить 2 массива
public class massiv5 {
    public static void main(String[] args) {

        int [] num1 = new int [] {35,4,-3,3};
        int [] num2 = new int [] {45,45,23,23};
        int [] num1num2 = new int[num1.length+num2.length];

        for (int i = 0; i<num1.length; i++){
            num1num2[i]=num1[i];
        }
        for (int j = num1.length; j<num1num2.length; j++){
            num1num2[j]=num2[j-num1.length];
        }

        for (int k=0; k<num1num2.length; k++){
            System.out.println(num1num2[k]);
        }
    }
}
