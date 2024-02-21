package com.dev.alexandria.controllers.dto;

import com.dev.alexandria.models.entities.Author;

public record AuthorDTO(Long id, String name, String nationality) {

  public Author toAuthor(){
    return new Author(id, name, nationality);
  }
}
