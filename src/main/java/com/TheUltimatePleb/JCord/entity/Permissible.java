package com.TheUltimatePleb.JCord.entity;

public interface Permissible {

    void setPermission(Role r, Permission p, boolean bool);

    void setPermission(Permission p, boolean bool);

    enum Permission {

        CREATE_INSTANCE_INVITE(Type.GENERAL, 1), KICK_MEMBERS(Type.ROLE, 2), BAN_MEMBERS(Type.ROLE, 4), ADMINISTRATOR(Type.ROLE, 8),
        MANAGE_CHANNELS(Type.GENERAL, 10), MANAGE_GUILD(Type.ROLE, 20), READ_MESSAGES(Type.TEXT, 400), SEND_MESSAGES(Type.TEXT, 800),
        SEND_TTS_MESSAGES(Type.TEXT, 1000), MANAGE_MESSAGES(Type.TEXT, 2000), EMBDED_LINKS(Type.TEXT, 4000), ATTACH_FILES(Type.TEXT, 8000),
        READ_MESSAGE_HISTORY(Type.TEXT, 10000), MENTION_EVERYONE(Type.TEXT, 20000), USE_EXTERNAL_EMOJIS(Type.TEXT, 40000),
        CONNECT(Type.VOICE, 100000), SPEAK(Type.VOICE, 200000), MUTE_MEMBERS(Type.VOICE, 400000), DEAFEN_MEMBERS(Type.VOICE, 800000),
        MOVE_MEMBERS(Type.VOICE, 1000000), USE_VAD(Type.VOICE, 2000000), CHANGE_NICKNAME(Type.TEXT, 4000000),
        MANAGE_NICKNAMES(Type.TEXT, 8000000), MANAGE_ROLES(Type.ROLE, 10000000);

        private Type type;
        private int bit;

        Permission(Type type, int bit) {
            this.type = type;
            this.bit = bit;
        }

        public Type getType() {
            return type;
        }

        public int getBit() {
            return bit;
        }

        enum Type {
            GENERAL, TEXT, VOICE, ROLE
        }

    }

}
