package com.dev.alexandria.controllers.dto;

import com.dev.alexandria.models.entities.Book;

public record BookDTO(Long id, String title, String genre) {

  public Book toBook() {
    return new Book(id, title, genre);
  }

}
