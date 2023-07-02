package org.apache.ibatis.learn_with_sakila.entity;

import java.util.List;

public class Film {
  private int filmId;
  private String title;
  private List<Actor> actorList;

  public Film(int filmId, String title, List<Actor> actorList) {
    System.out.println("Filmの引数ありのコンストラクタが呼ばれた");
    this.filmId = filmId;
    this.title = title;
    this.actorList = actorList;
  }

  public Film() {
    System.out.println("Filmの引数なしのコンストラクタが呼ばれた");
  }

  @Override
  public String toString() {
    return "{ " + "filmId: "  + filmId + ", " +
      "title: " + title + ", " +
      "actorList: " + actorList + " }";
  }
}
