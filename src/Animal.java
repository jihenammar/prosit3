public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les informations d'un animal
    public void displayAnimalInfo() {
        System.out.println("Animal: " + name + ", Famille: " + family +
                ", Âge: " + age + ", Mammifère: " + isMammal);
    }
}
