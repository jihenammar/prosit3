public class ZooManagement {
    public static void main(String[] args) {
        // Création d'animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        // Création d'un zoo
        Zoo myZoo = new Zoo("My Zoo", "Paris");

        // Ajout des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);

        // Tentative d'ajouter le même animal une deuxième fois
        System.out.println("Ajout du même lion à nouveau :");
        myZoo.addAnimal(lion);

        // Affichage des animaux présents dans le zoo
        myZoo.displayAnimals();

        // Rechercher un animal
        System.out.println("Recherche du lion : Index = " + myZoo.searchAnimal("Lion"));

        // Création d'un autre lion identique
        Animal anotherLion = new Animal("Felidae", "Lion", 5, true);
        System.out.println("Recherche du deuxième lion : Index = " + myZoo.searchAnimal(anotherLion.name));

        // Suppression d'un animal
        myZoo.removeAnimal(tiger);
        myZoo.displayAnimals();

        // Vérifier si le zoo est plein
        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());

        // Comparaison de deux zoos
        Zoo anotherZoo = new Zoo("Zoo Lyon", "Lyon");
        anotherZoo.addAnimal(new Animal("Canidae", "Wolf", 3, true));

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());
    }
}
