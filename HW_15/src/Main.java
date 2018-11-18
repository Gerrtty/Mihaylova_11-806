import java.io.File;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String s1 = "Сегодня погода погода не очень хорошая, весь день идёт дождь";
        String s2 = "Сегодня пгода замечательная, целый день светит солнце";
        JaccardTextAnalyzer a = new JaccardTextAnalyzer();
        double coef1 = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Коэфициент = " + coef1);


        File f1 = new File("f1.txt");
        File f2 = new File("f2.txt");
        double coef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Жаккард для содержимого файлов: " + coef2);

        CosineSimilarity cs = new CosineSimilarity();
        double coef3 = cs.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Косинусное сходство: " + coef3);
    }

}
