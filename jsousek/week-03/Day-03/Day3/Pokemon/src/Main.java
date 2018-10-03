import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        Pokemon strongPokemon = null;


        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
                strongPokemon = pokemonOfAsh.get(i);
            }
        }

        try {
            System.out.println("I choose you, " + strongPokemon.name);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Theres no good pokemon");
        }

        try {
            System.out.println("I choose "+ goodPokemon(wildPokemon).name);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Theres no good pokemon");
        }

        //System.out.println("I chose you, "+ goodPokemon(wildPokemon));
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    public static Pokemon goodPokemon(Pokemon somePokemon) {
        Pokemon inFncPokemon = null;
        for (Pokemon poke : initializePokemons()) {
            if (poke.isEffectiveAgainst(somePokemon)) {
                inFncPokemon = poke;
                //return inFncPokemon;
            }

        }
        if (inFncPokemon == null){
            throw new IllegalArgumentException();
        }

        return inFncPokemon;
    }
}

