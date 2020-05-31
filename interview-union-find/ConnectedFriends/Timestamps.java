package ConnectedFriends;

import java.time.LocalDate;

public class Timestamps {
  private LocalDate timeStamp;
  private int friendId1;
  private int friendId2;
  private int label;

  public Timestamps(final LocalDate timeStamp, final int friendId1, final int friendId2) {
    this.timeStamp = timeStamp;
    this.friendId1 = friendId1;
    this.friendId2 = friendId2;
  }

  public LocalDate getTimeStamp() {
    return timeStamp;
  }

  public int getFriendId1() {
    return friendId1;
  }

  public int getFriendId2() {
    return friendId2;
  }

  public int getLabel() {
    return label;
  }

  public void setLabel(int label) {
    this.label = label;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
