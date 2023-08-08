public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"Beautiful", "Happy", "Strong", "Creative", "Intelligent", "Energetic", "Calm", "Playful", "Exciting", "Mysterious"};

        String[] nouns = {"Dog", "Book", "Tree", "Ocean", "Computer", "Flower", "Car", "Moon", "House", "Mountain"};

        int randomNounIndex = (int) (Math.random() * nouns.length);
        String randomNoun = nouns[randomNounIndex];

        int randomAdjectiveIndex = (int) (Math.random() * adjectives.length);
        String randomAdjective = adjectives[randomAdjectiveIndex];

        System.out.println("Here is your server name:\n" + randomAdjective + "-" + randomNoun);
    }

//    public static String[] nouns = {"Beautiful", "Happy", "Strong", "Creative", "Intelligent", "Energetic", "Calm", "Playful", "Exciting", "Mysterious"};
//
//    };

}
