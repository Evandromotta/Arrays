public class TestaArray {
    public static void main(String[] args) {
        int [] idades = {0,2,4,6,8};

        idades[2] = 10;
        System.out.println("Quantidades de Array: "+ idades.length);

        for (int i =0; i < idades.length; i++){
            System.out.println("Posição nº"+ i +": " + idades[i]);
        }
    }
}
