package ke.co.apollo;

//demo of a singleton pattern
public class PrinterManager {

    //single instance
    private static PrinterManager singleManager= null;

    //track printer status
    private boolean printerBusy = false;
    private String currentJob = "";

    //private constructor - nobody else can create a manager
    private PrinterManager() {
        System.out.println("Printer Manager Created - I'm in-charge of the printer");
    }

   //the only way to get the manager
   public static PrinterManager getManager() {
        if (singleManager == null) {
            singleManager = new PrinterManager();
        }
        return singleManager;
   }

    //method to print a document
    public void printDocument(String document,String person){
        if(printerBusy){
            System.out.println("Sorry "+ person + ",printer is busy with: " + currentJob);
            return;
        }

        printerBusy = true;
        currentJob = document + "(" + person + ")";

        System.out.println("Printing : " + document + "for" + person);

        //Simulate Printing time
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    // Check printer status
    public void checkStatus() {
        if (printerBusy) {
            System.out.println("📋 Printer Status: BUSY - " + currentJob);
        } else {
            System.out.println("📋 Printer Status: READY");
        }
    }

    // Getter methods for testing
    public boolean isPrinterBusy() {
        return printerBusy;
    }

    public String getCurrentJob() {
        return currentJob;
    }

}
