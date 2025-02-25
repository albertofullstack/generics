package com.generics.collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {

  private List<Node> neighbours;

  public Node() {
    this.neighbours = new ArrayList<>();
  }

  public List<Node> getNeighbours() {
    return Collections.unmodifiableList(neighbours);
  }
}
