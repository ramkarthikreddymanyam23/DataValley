package assignement2;
public class oddpos {
    public static void main(String[] arg){
        String text = "type here to search";
        text = text.replaceAll(" ", " ");
        for (int i=0; i<text.length();i++){
            if (i % 2 != 0){
                System.out.println(text.charAt(i) + " ");
            }
        }
    }
}
