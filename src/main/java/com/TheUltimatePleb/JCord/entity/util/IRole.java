package com.TheUltimatePleb.JCord.entity.util;

import com.TheUltimatePleb.JCord.DiscordAPI;
import com.TheUltimatePleb.JCord.entity.Permissible;
import com.TheUltimatePleb.JCord.entity.Role;
import com.TheUltimatePleb.JCord.entity.Server;

import java.awt.*;
import java.util.List;

public class IRole implements Role, Permissible {

    private List<Integer> allowPermissions;
    private List<Integer> denyPermissions;
    private int id;

    private String name;
    private boolean mentionable;
    private boolean displaySeparately;
    private Color color;

    private DiscordAPI api;

    public IRole(String roleName) {

    }

    public IRole(int id, Server s) {

    }

    public int getId() {
        return id;
    }

    public void setPermission(Role r, Permission p, boolean bool) {
        throw new UnsupportedOperationException("Please use setPermission(Permission p, boolean allow); for settings permissions for a role");
    }

    public void setPermission(Permission p, boolean allow) {
        if (p == null)
            throw new NullPointerException("Permission cannot be null");
        if (allow) {
            if (!allowPermissions.contains(p.getBit())) {
                if (denyPermissions.contains(p.getBit())) denyPermissions.remove(p.getBit());

                allowPermissions.add(p.getBit());
            }
        } else {
            if (!denyPermissions.contains(p.getBit())) {
                if (allowPermissions.contains(p.getBit())) allowPermissions.remove(p.getBit());

                denyPermissions.add(p.getBit());
            }
        }

        int allowI = allowPermissions.stream().mapToInt(Integer::intValue).sum();
        int denyI = denyPermissions.stream().mapToInt(Integer::intValue).sum();

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
