package Java.Advanced.Threads;

public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.run();
    }
}

class GeradorPDF extends Thread{
    public void run(){
        try {
            System.out.println("Iniciar gerador de PDF");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento extends Thread {

    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Loading ---");
                if (iniciarGeradorPDF.isAlive()) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

