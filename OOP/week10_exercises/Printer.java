package week10_exercises;

public abstract class Printer {
    abstract void print();
}

interface ColoredPrintBehaviour {
    void ColoredPrint();
}

interface FaxBehaviour {
    void Fax();
}

interface ScanBehaviour {
    void Scan();
}

class CanonProfessional extends Printer implements ColoredPrintBehaviour, FaxBehaviour, ScanBehaviour {
    @Override
    public void print(){
        System.out.println("Canon Prifessional prints.");
    }
    @Override
    public void ColoredPrint(){
        System.out.println("Colored print.");
    }
    @Override
    public void Fax(){
        System.out.println("Canon Professional fax behaviour.");
    }
    @Override
    public void Scan(){
        System.out.println("Canon Professional scan behaviour.");
    }
}

class CanonOffice extends Printer implements FaxBehaviour,ScanBehaviour {
    @Override
    public void print(){
        System.out.println("Canon Office prints.");
    }
    @Override
    public void Fax(){
        System.out.println("Canon Office fax behaviour.");
    }
    @Override
    public void Scan(){
        System.out.println("Canon Office scan behaviour.");
    }
}

class CanonBasic extends Printer implements ScanBehaviour{
    @Override
    public void print(){
        System.out.println("Canon Basic prints.");
    }
    @Override
    public void Scan(){
        System.out.println("Canon Basic scan behaviour.");
    }
}

class Main{
    public static void main(String[] args) {
        CanonProfessional canonProfessional = new CanonProfessional();
        CanonOffice canonOffice = new CanonOffice();
        CanonBasic canonBasic = new CanonBasic();

        Printer[] printers = {canonProfessional,canonOffice,canonBasic};

        for (Printer printer : printers) {
            if (printer instanceof FaxBehaviour && printer instanceof ScanBehaviour)
                printer.print();
        }
    }
}
