import java.util.ArrayList;

public class App {

    String name;

    static String name2;

    public static void main(String[] args) throws Exception {
        var nome = "cliente";
        byte id = 22;
        boolean letras = true;
        float salario = 930.20F;
        int nu = 10;

        if(id > 23){
            System.out.println("maior");
        } else {
            System.out.println("menor");
        }

        String[] nomes = new String[10];

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(22);
        ids.remove(0);
        ids.get(1);
        ids.size();

        int i = 0;
        int j = 10;
        while(i < j){
            i++;
        }

        int id1 = 22;
        double id2 = id1;
        id1 = (int) id2;

        char letra = 'a';
        String nom = String.valueOf(letra);
        letra = nom.charAt(0);
    }

    public App(String name){
        this.name = name;
    }
}
