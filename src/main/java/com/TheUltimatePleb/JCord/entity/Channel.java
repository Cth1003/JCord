package com.TheUltimatePleb.JCord.entity;

public interface Channel {

    String getName();

    void setName(String n);

    int getPosition();

    void setPosition(int position);

    void setBitrate(int bitrate);

    int getBitrate();

    void setUserLimit(int userLimit);

    int userLimit();

    String createInstantInvite();

    boolean deleteInstantInvite(String code);

}
