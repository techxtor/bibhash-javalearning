package dataabstraction.interfacelearning;

interface IWriter {
//    public abstract void write();
    void write();
}

class IPen implements IWriter{
    @Override
    public void write() {
        System.out.println("Pen writer");
    }
}

class IPencil implements IWriter{
    @Override
    public void write() {
        System.out.println("Pencil writer");
    }
}

class INataraj {
    public void write(IWriter writer){
        writer.write();
    }
}
public class InterfaceCovertDemo {
    public static void main(String[] args) {

        IPen pen = new IPen();
        IPencil pencil = new IPencil();

        INataraj nataraj = new INataraj();
        nataraj.write(pen);
        nataraj.write(pencil);
    }
}
