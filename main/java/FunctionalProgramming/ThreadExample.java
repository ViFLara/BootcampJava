package FunctionalProgramming;

public class ThreadExample {
    public static void main(String[] args) {

        generatesPDF pdfgenerator = new generatesPDF();
        pdfgenerator.start();

        loadingBarr loadingbarr = new loadingBarr(pdfgenerator);
        loadingbarr.start();
    }
}

class generatesPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Begins PDF generator");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Generated");
    }
}

class loadingBarr extends Thread {
    private final Thread pdfgenerator;

    public  loadingBarr(Thread pdfgenerator) {
        this.pdfgenerator = pdfgenerator;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!pdfgenerator.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




