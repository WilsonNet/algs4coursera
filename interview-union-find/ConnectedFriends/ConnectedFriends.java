package ConnectedFriends;


class ConnectedFriends {
  Timestamps[] timestamps;

  public ConnectedFriends(Timestamps[] timestamps) {
    for (int i = 0; i < timestamps.length; i++) {
      timestamps[i].setLabel(i);
    }

    this.timestamps = timestamps;
  }

  public Timestamps root(int i){
    while(i != timestamps[i].getLabel()) i = timestamps[i].getLabel();
    return timestamps[i];
  }

}
