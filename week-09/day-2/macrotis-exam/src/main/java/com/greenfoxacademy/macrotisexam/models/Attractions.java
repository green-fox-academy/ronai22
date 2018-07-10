package com.greenfoxacademy.macrotisexam.models;

import javax.persistence.*;

@Entity
public class Attractions {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
  @SequenceGenerator(name = "sequence-generator",
          sequenceName = "attractions_sequence", initialValue = 7)
  private long id;
  private String attrName;
  private String city;
  private int price;
  private float latitude;
  private float longitude;
  private String category;
  private int duration;
  private float recommendedAge;

  public Attractions() {
  }

  public Attractions(String attrName, String city, int price, float latitude, float longitude, String category, int duration, float recommendedAge) {
    this.attrName = attrName;
    this.city = city;
    this.price = price;
    this.latitude = latitude;
    this.longitude = longitude;
    this.category = category;
    this.duration = duration;
    this.recommendedAge = recommendedAge;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }
}
