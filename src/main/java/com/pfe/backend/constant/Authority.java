package com.pfe.backend.constant;


public class Authority {
    public static final String[] USER_AUTHORITIES = { "user:read" };
    public static final String[] HANDYMAN_AUTHORITIES = { "user:read" };
    public static final String[] PROPRETYOWNER_AUTHORITIES = { "user:read", "user:update" };
    public static final String[] ADMIN_AUTHORITIES = { "user:read", "user:create", "user:update", "user:delete" };
}
/*public class Authority {

    public static final String[] AUDITOR_AUTHORITIES = { "user:read" };
    public static final String[] MANAGER_AUTHORITIES = { "user:read", "user:update" };
    public static final String[] DATA_SCIENTIST_AUTHORITIES = {"user:read","user:update" };
    public static final String[] ADMIN_AUTHORITIES = { "user:read", "user:create", "user:update" };
    public static final String[] SUPER_ADMIN_AUTHORITIES = { "user:read", "user:create", "user:update", "user:delete" };
}
*/