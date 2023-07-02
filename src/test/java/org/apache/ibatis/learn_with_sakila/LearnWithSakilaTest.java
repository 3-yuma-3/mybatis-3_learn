package org.apache.ibatis.learn_with_sakila;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.learn_with_sakila.entity.Actor;
import org.apache.ibatis.learn_with_sakila.entity.Film;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

public class LearnWithSakilaTest {
  @Test
  void Actorのクエリを実行する() throws IOException {
    // https://mybatis.org/mybatis-3/ja/getting-started.html

    String resource = "org/apache/ibatis/learn_with_sakila/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    try (SqlSession session = sqlSessionFactory.openSession()) {
      Actor actor = session.selectOne("org.apache.ibatis.learn_with_sakila.mapper.ActorMapper.selectActor", 101);
      System.out.println("実行結果: " + actor.toString());
    }
  }

  @Test
  void Filmのクエリを実行する() throws IOException {
    // https://mybatis.org/mybatis-3/ja/getting-started.html

    String resource = "org/apache/ibatis/learn_with_sakila/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    try (SqlSession session = sqlSessionFactory.openSession()) {
      Film film = session.selectOne(
        "org.apache.ibatis.learn_with_sakila.mapper.FilmMapper.selectFilm",
        101
      );
      System.out.println("実行結果: " + film.toString());
    }
  }
}
