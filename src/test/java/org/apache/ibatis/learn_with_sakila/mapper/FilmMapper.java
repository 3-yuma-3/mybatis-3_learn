package org.apache.ibatis.learn_with_sakila.mapper;

import org.apache.ibatis.learn_with_sakila.entity.Film;

public interface FilmMapper {
  Film selectFilm(int id);
}
