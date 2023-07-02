package org.apache.ibatis.learn_with_sakila.entity;

public class Actor {
  private int actorId;
  private String firstName;
  private String lastName;

  public Actor(int actorId, String firstName, String lastName) {
    System.out.println("Actorの引数ありのコンストラクタが呼ばれた " + actorId + ", " + firstName + ", " + lastName);
    this.actorId = actorId;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Actor() {
    System.out.println("Actorの引数なしのコンストラクタが呼ばれた");
  }

  public int getActorId() {
    return actorId;
  }

  public void setActorId(int actorId) {
    System.out.println("ActorのsetActorIdが呼ばれた " + actorId);
    this.actorId = actorId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    System.out.println("ActorのsetFirstNameが呼ばれた " + firstName);
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    System.out.println("ActorのsetLastNameが呼ばれた " + lastName);
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "{ " + "actorId: " + actorId + ", " +
      "firstName: " + firstName + ", " +
      "lastName: " + lastName + " }";
  }
}
