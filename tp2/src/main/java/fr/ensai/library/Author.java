package fr.ensai.library;

import java.util.Objects;
import java.util.Random;

/**
 * Represents an Author.
 */
public class Author extends Person {
    public Author(String name, int age, String nationality) {
        super(name, age, nationality); // super() must be the first statement
    }

    public Author(String name) {
        this(name, generateRandomAge(), "Unknown");
    }

    // Static method to generate a random age
    private static int generateRandomAge() {
        return new Random().nextInt(80 - 12 + 1) + 12;
    }

    public String getName() {
        return super.getName();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(super.getName(), author.getName());
    }

    @Override
    public String toString() {
        return "Author " + super.getName();
    }

}
