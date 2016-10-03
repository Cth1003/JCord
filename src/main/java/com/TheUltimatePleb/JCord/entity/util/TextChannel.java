package com.TheUltimatePleb.JCord.entity.util;

import com.TheUltimatePleb.JCord.entity.Channel;
import com.TheUltimatePleb.JCord.entity.Permissible;
import com.TheUltimatePleb.JCord.entity.Role;

public class TextChannel implements Channel, Permissible {

    public String getName() {
        return null;
    }

    public void setName(String n) {

    }

    public int getPosition() {
        return 0;
    }

    public void setPosition(int position) {

    }

    public void setBitrate(int bitrate) {

    }

    public int getBitrate() {
        return 0;
    }

    public void setUserLimit(int userLimit) {

    }

    public int userLimit() {
        return 0;
    }

    public String createInstantInvite() {
        return null;
    }

    public boolean deleteInstantInvite(String code) {
        return false;
    }

    public void setPermission(Role r, Permission p, boolean bool) {

    }

    public void setPermission(Permission p, boolean bool) {

    }
}
