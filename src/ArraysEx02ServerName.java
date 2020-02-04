
public class ArraysEx02ServerName {

    final public static String[] adjectives = {"Pretty",  "Obscure", "Distant",  "Radical", "Meaningful",
                                              "Sincere", "Dubious", "Faux", "Honest",  "Dire"};
    final public static String[] nouns = {"Horse",  "Machine", "Despot",  "Radical", "Definitions",
            "Streak", "Warning", "Observation", "Merchant",  "Phase"};

    public static String buildDomain() {
        String adjective = adjectives[(int) (Math.random() * 10)];
        String noun = nouns[(int) (Math.random() * 10)];
        return adjective + "-" + noun;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Your list of 10 possible domains.");
        for (int i = 0; i < 10; i++) {
            System.out.println(buildDomain());
        }
    }

}
