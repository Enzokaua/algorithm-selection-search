import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Ordenação por seleção!" + "\nEsse algoritmo é responsável por iterar sobre um array de itens e organizá-los." + "\nEle possui um tempo log(n2), pois são necessárias 2 listas para iterar sobre o array e ordená-lo.");
        int arr[] = {10, 19, 30, 40, 50, 10};
        System.out.printf("O array que iremos utilizar para teste, será = %s ", Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    indexMinimo = j;
                }
            }
            int temp = arr[indexMinimo];
            arr[indexMinimo] = arr[i];
            arr[i] = temp;
        }
        System.out.print("O array convertido, ficou:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
