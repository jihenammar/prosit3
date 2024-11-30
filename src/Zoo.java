public class Zoo {
    // Attributs de la classe
    private static final int MAX_ANIMALS = 25; // Constante
    private Animal[] animals;  // Tableau d'animaux
    private int animalCount;   // Compteur d'animaux
    private String name;       // Nom du zoo
    private String city;

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }

    // Getter pour le nom du zoo
    public String getName() {
        return name;
    }

    // Méthode pour ajouter un animal (retourne true si réussi)
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal.");
            return false;
        }
        if (searchAnimal(animal.name) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo.");
            return false;
        }
        animals[animalCount++] = animal;
        System.out.println(animal.name + " a été ajouté au zoo.");
        return true;
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i].name);
        }
    }

    // Méthode pour rechercher un animal par nom (retourne l'index ou -1)
    public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animalName)) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        if (index == -1) {
            System.out.println("Animal non trouvé.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;  // Réduire le compteur
        System.out.println(animal.name + " a été supprimé du zoo.");
        return true;
    }

    // Vérifie si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }

    // Méthode pour comparer deux zoos et retourner le plus rempli
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }
}
