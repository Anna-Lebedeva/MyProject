package my_Project_For_Github;
//8. Создать массив и посчитать сколько раз в нем встречается число 4
public class massiv8 {
    public static void main(String[] args) {
        int [] num1 = new int [] {35,4,-3,4,3,2,6,237,4};
        int k=0;
        for (int i = 0; i<num1.length; i++){
            if(num1[i]==4) {
                k +=1;
            }

        }
        System.out.println(k);
    }
}
