package dataabstraction.interfacelearning;

// how to create and use abstract class

// Number
abstract class Writer {
    public abstract void write();
}

// Integer
class Pen extends Writer{

    @Override
    public void write() {
        System.out.println("Pen writer");
    }
}

// Double
class Pencil extends Writer{

    @Override
    public void write() {
        System.out.println("Pencil writer");
    }
}

class Nataraj {
//       public void write(Pen pen){
//           pen.write();
//       }
//       public void write(Pencil pencil) {
//           pencil.write();
//       }

    public void write(Writer writer){
        writer.write();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
//        Pen pen = new Pen();
//        Pencil pencil = new Pencil();
//
//        pen.write();
//        pencil.write();

//        Writer pen = new Pen();
//        Writer pencil = new Pencil();
//
//        pen.write();
//        pencil.write();

        Pen pen =  new Pen();
        Pencil pencil = new Pencil();

        Nataraj nataraj = new Nataraj();
        nataraj.write(pen);
        nataraj.write(pencil);

    }
}
