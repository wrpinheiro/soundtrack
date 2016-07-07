package com.thecodeinside.services;

public class SongServiceImpl implements SongService {
  public String[] findAll() {
    return new String[] {
      "Rainbow in the Dark",
      "For Those About To Rock",
      "The Court of the Crimson King",
      "And Justice for All",
      "The Working Man",
      "Dread And The Fugitive Mind",
      "Heart of the Sunrise",
      "Children of the Grave"
    };
  }
}
