package com.TheUltimatePleb.JCord.entity;

import java.util.Collection;

public interface Server {

    Role getRoleFromId(int id);

    String getName();

    Channel getVoiceChannelById();

    Channel getTextChannelById();

    Collection<Channel> getAllVoiceChannels();

    Collection<Channel> getAllTextChannels();

    Collection<Channel> getAllChannels();

    Collection<Role> getAllRoles();

    Collection<User> getAllUsers();

    Collection<User> getBannedUsers();

    void banUser(User u);

    void pardonUser(User u);

    void kickUser(User u);

    Channel createTextChannel(String name);

    Channel createTextChannel(String name, String topic);

    Channel createTextChannel(String name, Collection<Permissible.Permission> allowedPermissions,
                              Collection<Permissible.Permission> deniedPermissions);

    Channel createTextChannel(String name, String topic, Collection<Permissible.Permission> allowedPermissions,
                              Collection<Permissible.Permission> deniedPermissions);

    Channel createTextChannel(String name, int position);

    Channel createTextChannel(String name, String topic, int position);

    Channel createTextChannel(String name, Collection<Permissible.Permission> allowedPermissions,
                              Collection<Permissible.Permission> deniedPermissions, int position);

    Channel createTextChannel(String name, String topic, Collection<Permissible.Permission> allowedPermissions,
                              Collection<Permissible.Permission> deniedPermissions, int posotion);

    Channel createVoiceChannel(String name);

    Channel createVoiceChannel(String name, Collection<Permissible.Permission> allowedPermissions,
                               Collection<Permissible.Permission> deniedPermissions);

    Channel createVoiceChannel(String name, int bitrate, int userLimit);

    Channel createVoiceChannel(String name, Collection<Permissible.Permission> allowedPermissions,
                               Collection<Permissible.Permission> deniedPermissions, int bitrate, int userLimit);

    User getUserById(int id);

    User getOwner();

    void setRegion(Region r);

    void setRegion(String r);

    Region getRegion();

    enum Region {
        BRAZIL("brazil"), CENTRAL_EUROPE("central-europe"), SINGAPORE("singapore"), SYDNEY("sydney"),
        US_CENTRAL("us-central"), US_EAST("us-east"), US_SOUTH("us-south"), US_WEST("us-west"), WESTERN_EUROPE("western-europe"),
        DEFAULT("us-central");

        private String id;

        Region(String id) {
            this.id = id;
        }

        public static Region getRegionById(String id) {
            for (Region r : values()) if (r.getId().equalsIgnoreCase(id)) return r;
            return DEFAULT;
        }

        public String getId() {
            return id;
        }

    }

}
