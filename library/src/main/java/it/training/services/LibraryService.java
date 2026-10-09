package it.training.services;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import it.training.models.LibraryElement;

public class LibraryService {
    private final Map<String, LibraryElement> library = new HashMap<>();

    /**
     * Adds a new element to the library
     * 
     * @param element
     * @return {@code true} if the element has been added, {@code false} otherwise
     */
    public boolean add(LibraryElement element) {
        Objects.requireNonNull(element, "Element cannot be null");

        LibraryElement existingElement = this.library.putIfAbsent(element.getUniqueCode(), element);
        return existingElement == null;
    }

    /**
     * Removes an element from the library
     * 
     * @param uniqueCode
     * @return {@code true} if the element has been removed, {@code false} otherwise
     */
    public boolean remove(String uniqueCode) {
        LibraryElement removedElement = this.library.remove(uniqueCode);
        return removedElement != null;
    }

    /**
     * Returns all the elements in the library
     * 
     * @return {@link Collection} of {@link LibraryElement}
     */
    public Collection<LibraryElement> findAll() {
        return Collections.unmodifiableCollection(this.library.values());
    }
}
