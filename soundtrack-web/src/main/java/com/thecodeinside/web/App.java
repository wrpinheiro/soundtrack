package com.thecodeinside.web;

import java.util.Arrays;

import java.util.stream.Collectors;

import com.thecodeinside.services.SongService;
import com.thecodeinside.services.SongServiceImpl;

import io.undertow.Undertow;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

import io.undertow.util.Headers;

public class App {
  public static void main(final String[] args) {
    final SongService songService = new SongServiceImpl();

    Undertow server = Undertow.builder()
      .addHttpListener(8080, "localhost")
      .setHandler(new HttpHandler() {

        @Override
        public void handleRequest(final HttpServerExchange exchange) throws Exception {
          String songs = Arrays.stream(songService.findAll())
            .collect(Collectors.joining("<br />"));

          exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html");
          exchange.getResponseSender().send(songs);
        }
      }).build();

    server.start();
  }
}
