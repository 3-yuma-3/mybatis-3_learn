package org.apache.ibatis.learn_with_sakila.mapper;

import org.apache.ibatis.learn_with_sakila.entity.Actor;

public interface ActorMapper {
  Actor selectActor(int id);
}
