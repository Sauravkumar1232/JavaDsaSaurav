public class SourceDes {
    static void home(int source,int des){
        System.out.println("Source----->"+source+"    Des------>"+des);
        if(source==des){
            System.out.println("Reached home");
            return;
        }
        home(source+1, des);
    }
    public static void main(String[] args) {
        int source=2;
        int des=10;
        home(source,des);
    }
}
