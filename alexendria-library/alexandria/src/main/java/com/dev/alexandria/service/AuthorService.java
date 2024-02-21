package com.dev.alexandria.service;

import com.dev.alexandria.models.entities.Author;
import com.dev.alexandria.models.entities.Book;
import com.dev.alexandria.models.repositories.AuthorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

  private AuthorRepository authorRepository;

  @Autowired
  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Author insertAuthor(Author author) {
    return authorRepository.save(author);
  }

  public Optional<Author> updateAuthor(Long id, Author author) {
    Optional<Author> optionalAuthor = authorRepository.findById(id);

    if(optionalAuthor.isPresent()) {
      Author authorFromDB = optionalAuthor.get();
      authorFromDB.setName(author.getName());
      authorFromDB.setNationality(author.getNationality());

      Author updatedAuthor = authorRepository.save(authorFromDB);
      return Optional.of(updatedAuthor);
    }
    return optionalAuthor;
  }

  public Optional<Author> removeAuthorById(Long id) {
    Optional<Author> optionalAuthor = authorRepository.findById(id);

    if(optionalAuthor.isPresent()) {
      authorRepository.deleteById(id);
    }
    return optionalAuthor;
  }

  public Optional<Author> getAuthorById(Long id) {
    return authorRepository.findById(id);
  }

  public List<Author> getAllAuthor() {
    return authorRepository.findAll();
  }
}
