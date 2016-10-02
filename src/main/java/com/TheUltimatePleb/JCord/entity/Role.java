package com.TheUltimatePleb.JCord.entity;

import java.awt.*;

public interface Role {

    String getName();

    void setName(String name);

    Color getColor();

    void setColor(Color color);

    boolean isMentionable();

    boolean isDisplayedSeparately();

    void setMentionable(boolean mentionable);

    void setDisplaySeparately(boolean displaySeparately);

}
