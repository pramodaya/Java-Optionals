import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        /**
         * Imperative older way of checking 'NULL' values
         */
        String firstName = "Pramodaya";
        if(firstName != null){
            firstName = firstName.toUpperCase();
        }else{
            //do something
        }


        /**
         * Declarative modern way of handling 'NULL' values
         */
        //Optional variable
        Optional<Object> empty = Optional.empty();

        //Not null value - cannot be null for sure
        Optional<String> helloWorld = Optional.of("Hello world");

       //Value can be null or not
        Optional<Object> nullOptional = Optional.ofNullable(null);

        System.out.println(helloWorld
                .map(String::toUpperCase)
                .orElse("Cannot make it Uppercase"));

        /**
         * Methods in Optionals
         */
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        helloWorld.orElse("Something");

        helloWorld
                .map(String::toUpperCase)
                .orElse("Cannot make it Uppercase");

    }
}