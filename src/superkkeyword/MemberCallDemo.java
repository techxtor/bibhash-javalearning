package superkkeyword;

class Alpha {
    String string = "I am Iron Man";

    public void display(){
        System.out.println("displaying in Alpha ...");
    }
}

class Beta extends Alpha {
    String string = "I am a Good Boy";
    public void print(){
        System.out.println(super.string);
        System.out.println(string);
    }

    @Override
    public void display(){
        System.out.println("displaying in Beta ...");
    }

    public void niceDisplay(){
        super.display();
    }

}

class Delta {
    public static void hero(){
        System.out.println("haa, haa, main hoon hero");
    }
    public void villain(){
        System.out.println("haa, haa, main hoon khalnayak");
    }
}

public class MemberCallDemo extends Delta {
    public void badBoy(){
       super.villain();
    }

    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.print();
        beta.display();
        beta.niceDisplay();

        hero();
        Delta.hero();
    }
}

// super.member -> parent.member -> Alpha.string