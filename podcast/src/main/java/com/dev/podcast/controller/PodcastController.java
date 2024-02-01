package com.dev.podcast.controller;

import com.dev.podcast.controller.dto.PodcastCreationDto;
import com.dev.podcast.controller.dto.PodcastDto;
import com.dev.podcast.model.Podcast;
import com.dev.podcast.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

  private PodcastService service;

  @Autowired
  public PodcastController(PodcastService service) {
    this.service = service;
  }

  @GetMapping
  public String getRoot() {
    return "All Podcasts!!";
  }

  @GetMapping("/{id}")
  public ResponseEntity<PodcastDto> getPodcast(@PathVariable Long id) {
    if (id > 1000) {
      return ResponseEntity.notFound().build();
    }

    Podcast podcast = service.findPodcastById(id);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.ok(podcastDto);
  }

  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return "Você buscou pelo Podcast: %s".formatted(title);
  }

  @PostMapping
  public ResponseEntity<PodcastDto> newPodcast(@RequestBody PodcastCreationDto newPodcast) {
    Podcast savedPodcast = new Podcast();

    savedPodcast.setName(newPodcast.name());
    savedPodcast.setUrl(newPodcast.url());
    //Podcast savedPodcast = service.savePodcast(newPodcast);

    PodcastDto podcastDto = new PodcastDto(
        savedPodcast.getId(),
        savedPodcast.getName(),
        savedPodcast.getUrl()
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(podcastDto);
  }
}
