package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Set<Book> books = new HashSet<>();
        for(int i=0;i<10;i++){
            Book book = new Book("title"+i,"author"+i, LocalDate.of(2015+i, 1+i, 1+i));
       books.add(book);
        }

        Library library = new Library("library 1");
        library.getBooks().addAll(books);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        //Then
        System.out.println("library "+ library.toString());
        System.out.println("clonedLibrary "+clonedLibrary.toString());
        System.out.println("deepClonedLibrary "+deepClonedLibrary.toString());
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}