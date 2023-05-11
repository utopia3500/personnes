public class Personne{
    /**Les propriétés (ou attributs) définies danscune classe
     * correspondent aux caractéristique de objets qui vont
     * être créés à partir de cette classe.
     */
    private String prenom = "défaut";
    private String nom  = "défaut";
    private int age = 0;

    /**
     * CONSTRUCTEUR
     * Un constructeur est une méthode qui est xécutée quand un objet set instancié.
     * Toutes les classes ont un constructeur par défaut dans Java.Ce constructeur a
     * le nom de la classe. Par exemple : 
     * Personne p = new Personne();
     * 
     * On peut définir un nouveau constructeur
     * Attention: un constructeur ne DOIT PAS retourner une valeur. Donc il n'y a pas
     * de type avant le nom de la méthode lors de sa déclaration
     * En général, les constructeurs sont utilisés pour initialiser la valeur des
     * propriétés de l'objet
     * @param prenom
     * @param nom
     * @param age
     * @return ne retourne aucune variable car c'est un constructeur
     */
    public Personne(String prenom, String nom, int age){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    /**
     * CONSTRUCTEUR Sans argument(surcharge)
     * Quand on définit un constructeur, le constructeur par défaut n'est plus accessible.
     * Si on veut l'utiliser à nouveau , il faut déclarer un constructeur sans argument.
     * BN : on peut laisser les {} vides si aucune instruction ne doit être exécutée
     * @param constructeur sans argument
     * @return ne retourne aucune variable car c'est un constructeur
     */
    public Personne(){
    }

    public Personne(String name, int old, String firstname){
        nom = name;
        prenom = firstname;
        age = old;
    }

    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    /**
     * Une fonction dans une classe est appelée une METHODE
     * @param aucun paramètre
     * @var aucune variable n'est déclarée
     * @return retourne concaténation du nom et du prénom
     */
    public String identite(){
        return this.prenom + " " + this.nom;
    }

    /**
     * Une fonction dans une classe est appelée une METHODE
     * @param boolean pour surcharger la méthode identite
     * @var aucune variable n'est déclarée
     * @return retourne concaténation du nom et du prénom et de l'age
     */
    public String identite(boolean vrai){
        return this.prenom + " " + this.nom + " age: "+ this.age + " ans";
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    
}