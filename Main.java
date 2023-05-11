public class Main {

    public static final int PRENOM = 1;
    public static final int NOM = 0;
    public static final int AGE = 2;

    public static void main(String[]args){
        /** lorqu'on déclare une variable de type objet, on dit
         * que l'on fait une INSTANCIATION
         * un objet est une iNSTANCE d'une classe
         */
        Personne p = new Personne("Onyme", "Anne", 50);
        System.out.println("identite de p = " + p.identite(true));
        System.out.println("****************************************");
       
        System.out.println("Nom " + p.getNom());
        System.out.println("prénom " + p.getPrenom());
        System.out.println("Age " + p.getAge());

        System.out.println(p.identite());
        Personne p1 = new Personne("Jean", "Cérien");
        // p1.prenom = "Jean";
        // p1.nom = "Cérien";
        p1.setAge(25);
        System.out.println("identité de p1 " + p1.identite(true));

        /* 
         * EXERCICES : 
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées dans exempleArray.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         		et comment le déclarer)
         */
         String[][] personnes1 =new String[10][3];

         personnes1[0] = new String[]{"Menfin", "Gérard", "35"};
        personnes1[1] = new String[]{"Ateur", "Nordine", "20"};
        personnes1[2] = new String[]{"Onyme", "Anne", "50"};
        personnes1[3] = new String[]{"Neymar", "Jean", "15"};
        personnes1[4] = new String[]{"Cérien", "Jean", "42"};
        personnes1[5] = new String[]{"Mal", "Roger", "70"};
        personnes1[6] = new String[]{"Kiafessa", "Estelle", "22"};
        personnes1[7] = new String[]{"Salah", "Mo", "30"};
        personnes1[8] = new String[]{"Laurence", "Bar", "47"};
        personnes1[9] = new String[]{"Fauré", "Gabriel", "63"};

         Personne[] personnes = new Personne[10];
         
         for (int i=0; i < personnes.length; i++){
            String[] tab= personnes1[i];
            String prenom = tab[PRENOM];
            String nom = tab[NOM];
            int age = Integer.parseInt(tab[AGE]);

            personnes[i] = new Personne(prenom, nom, age);
         }

         System.out.println("-----------------------");

         for (Personne pers : personnes){
            //System.out.println(pers.identite());
            System.out.println(pers.identite(true));
            System.out.println("-----------------------");
         }

         /* null est un type de données particulier 
          * (qu'on peut considérer comme une valeur particulière). 
          * Une variable de type objet qui n'a pas été initialisée est considéré
          * comme étant null.
         */
    }
}
