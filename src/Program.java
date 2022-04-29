public class Program {
    public static void main(String[] args) {
        Cap <Tea> cap1 =new Cap<>(new Tea());
        Cap <Coffe> cap2 =new Cap<>(new Coffe());
        Cap <Cacao> cap3 =new Cap<>(new Cacao());
        cap1.napitok.gitText();
        cap2.napitok.gitText();
        cap3.napitok.gitText();
    }
}
