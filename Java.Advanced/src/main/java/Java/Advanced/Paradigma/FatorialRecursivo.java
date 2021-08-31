package Java.Advanced.Paradigma;

public class FatorialRecursivo {
    public static void main(String[] args) {

        System.out.println(Fatorial(10)); //3628800

    }
    public static int Fatorial (int valor){
        if (valor == 1){
            return valor;
        }
        else{
            return valor * Fatorial((valor -1));
        }
    }
}
