package my_Project_For_Github;
//6. Создать массив, вывести все четные числа, но если встретиться число 237 - остановить вывод

public class massiv6 {
    public static void main(String[] args) {
        int [] num1 = new int [] {35,4,-3,3,2,6,237};
        for (int i = 0; i<num1.length; i++){
            if ((num1[i]==237)&&(num1[i]%2==0)){
                System.out.println(num1[i]);
            }
        }
    }
}
