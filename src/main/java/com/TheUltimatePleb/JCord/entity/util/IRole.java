package com.TheUltimatePleb.JCord.entity.util;

import com.TheUltimatePleb.JCord.entity.Permissible;
import com.TheUltimatePleb.JCord.entity.Role;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class IRole implements Role, Permissible {

    private int allowPermissions;
    private int denyPermissions;
    private int id;

    //private List<Permission> allowedPermissions = new ArrayList<Permission>();
    //private List<Permission> deniedPermissions = new ArrayList<Permission>();

    private String name;
    private boolean mentionable;
    private boolean displaySeparately;
    private Color color;

    public int getId() {
        return id;
    }

    public void setPermission(Role r, Permission p, boolean bool) {
        throw new UnsupportedOperationException();
    }

    public void setPermission(Permission p, boolean allow) {
        if(allow) {

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMentionable() {
        return mentionable;
    }

    public void setMentionable(boolean mentionable) {
        this.mentionable = mentionable;
    }

    public boolean isDisplayedSeparately() {
        return displaySeparately;
    }

    public void setDisplaySeparately(boolean displaySeparately) {
        this.displaySeparately = displaySeparately;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
