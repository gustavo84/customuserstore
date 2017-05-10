 

package org.wso2.carbon.um.ws.api;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.ClaimManager;
import org.wso2.carbon.user.api.Properties;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.Permission;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.claim.Claim;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;
import org.wso2.carbon.user.core.tenant.Tenant;

public class WSUserStoreManager implements UserStoreManager {

    private static final Log log = LogFactory.getLog(WSUserStoreManager.class);

    private static final String UNSUPPORTED_PASSWORD_MESSAGE = "Unsupported type of password";
    private static final String SERVICE_NAME = "RemoteUserStoreManagerService";

	public WSUserStoreManager() {
		log.info("custom userstore -->MongoDBUserStoreManager-1");

	}

	@SuppressWarnings({ "WeakerAccess", "UnusedParameters", "SameParameterValue" })
	public WSUserStoreManager(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager claimManager,
			ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId, boolean skipInitData)
			throws UserStoreException {
		log.info("custom userstore -->MongoDBUserStoreManage3");
	}

    public WSUserStoreManager(String serverUrl, String cookie, ConfigurationContext configCtxt)
            throws UserStoreException {
		/*
		 * try { stub = new RemoteUserStoreManagerServiceStub(configCtxt,
		 * serverUrl + SERVICE_NAME); ServiceClient client =
		 * stub._getServiceClient(); Options option = client.getOptions();
		 * option.setManageSession(true);
		 * option.setProperty(org.apache.axis2.transport.http.HTTPConstants.
		 * COOKIE_STRING, cookie); } catch (AxisFault e) {
		 * handleException(e.getMessage(), e); }
		 */
    }

	@SuppressWarnings("WeakerAccess")
	public WSUserStoreManager(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager claimManager,
			ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId) throws UserStoreException {

		log.info("custom userstore -->MongoDBUserStoreManage3");
	}

	public WSUserStoreManager(RealmConfiguration configuration, int tenantID) throws UserStoreException {
		log.info("custom userstore -->MongoDBUserStoreManager0");

	}

	public WSUserStoreManager(RealmConfiguration realmConfig, Map<String, Object> properties) {
		log.info("custom userstore -->MongoDBUserStoreManager0");
	}

	public WSUserStoreManager(String userName, String password, String serverUrl,
                              ConfigurationContext configCtxt) throws UserStoreException {

    }

    @Override
    public void addUser(String userName, Object credential, String[] roleList,
                        Map<String, String> claims, String profileName, boolean requirePasswordChange)
            throws UserStoreException {

            if (!(credential instanceof String)) {
                throw new UserStoreException(UNSUPPORTED_PASSWORD_MESSAGE);
            }
		log.info("custom userstore -->addUser");
    }

    public void addRole(String roleName, String[] userList, Permission[] permissions)
            throws UserStoreException {

    }

    @Override
    public void addUser(String userName, Object credential, String[] roleList,
                        Map<String, String> claims, String profileName) throws UserStoreException {
        if (!(credential instanceof String)) {
            throw new UserStoreException(UNSUPPORTED_PASSWORD_MESSAGE);
        }


    }

    @Override
    public boolean authenticate(String userName, Object credential) throws UserStoreException {
		log.info("custom userstore -->authenticate");
		return true;
    }

    @Override
    public void deleteRole(String roleName) throws UserStoreException {


    }

    @Override
    public void deleteUser(String userName) throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValue(String userName, String claimURI, String profileName)
            throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValues(String userName, String[] claims, String profileName)
            throws UserStoreException {

    }

    @Override
    public String[] getAllProfileNames() throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getHybridRoles() throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getAllSecondaryRoles() throws UserStoreException {
        return new String[0]; // To change body of implemented methods use File | Settings | File
        // Templates.
    }

    @Override
    public Date getPasswordExpirationTime(String username) throws UserStoreException {

		return new Date();
    }

    @Override
    public String[] getProfileNames(String userName) throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getRoleListOfUser(String userName) throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getRoleNames() throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getRoleNames(boolean b) throws UserStoreException {
        return new String[0]; // To change body of implemented methods use File | Settings | File
        // Templates.
    }

    @Override
    public int getTenantId() throws UserStoreException {
		log.info("custom userstore -->getTenantId");
		return -1234;
    }

    @Override
    public int getTenantId(String username) throws UserStoreException {
		log.info("custom userstore -->getTenantId");
		return -1234;
    }

    @Override
    public String getUserClaimValue(String userName, String claim, String profileName)
            throws UserStoreException {
		log.info("custom userstore -->getUserClaimValue");
        return profileName;
    }

    @Override
    public Claim[] getUserClaimValues(String userName, String profileName)
            throws UserStoreException {
		log.info("custom userstore -->getUserClaimValues");
        return new Claim[0];
    }

    @Override
    public Map<String, String> getUserClaimValues(String userName, String[] claims,
                                                  String profileName) throws UserStoreException {
		log.info("custom userstore -->getUserClaimValues");
        return new TreeMap<String, String>();
    }

    @Override
    public int getUserId(String username) throws UserStoreException {
		log.info("custom userstore -->getUserId");
        return -1;
    }

    @Override
    public String[] getUserListOfRole(String roleName) throws UserStoreException {
		log.info("custom userstore -->getUserListOfRole");
        return new String[0];
    }

    @Override
    public boolean isExistingRole(String roleName, boolean isSharedRole) throws UserStoreException {
		log.info("custom userstore -->isExistingRole");

        return false;
    }

    @Override
    public boolean isExistingUser(String userName) throws UserStoreException {


        return false;
    }

    @Override
    public boolean isReadOnly() throws UserStoreException {


        return false;
    }

    @Override
    public String[] listUsers(String filter, int maxItemLimit) throws UserStoreException {
		log.info("custom userstore -->listUsers");

        return new String[0];
    }

    @Override
    public void setUserClaimValue(String userName, String claimURI, String claimValue,
                                  String profileName) throws UserStoreException {

		log.info("custom userstore -->setUserClaimValue");
    }

    @Override
    public void setUserClaimValues(String userName, Map<String, String> claims, String profileName)
            throws UserStoreException {
		log.info("custom userstore -->setUserClaimValue");
    }

    public void addUserClaimValue(String userName, String claimURI, String claimValue,
                                  String profileName) throws UserStoreException {
		log.info("custom userstore -->addUserClaimValue");

    }

    public void addUserClaimValues(String userName, Map<String, String> claims, String profileName)
            throws UserStoreException {
		log.info("custom userstore -->addUserClaimValues");
    }

    @Override
    public void updateCredential(String userName, Object newCredential, Object oldCredential)
            throws UserStoreException {
        if (!(newCredential instanceof String) || !(oldCredential instanceof String)) {
            throw new UserStoreException(UNSUPPORTED_PASSWORD_MESSAGE);
        }
		log.info("custom userstore -->updateCredential");
    }

    @Override
    public void updateCredentialByAdmin(String userName, Object newCredential)
            throws UserStoreException {
        if (!(newCredential instanceof String)) {
            throw new UserStoreException(UNSUPPORTED_PASSWORD_MESSAGE);
        }
		log.info("custom userstore -->updateCredentialByAdmin");
    }

    @Override
    public void updateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles)
            throws UserStoreException {

    }

    @Override
    public void updateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers)
            throws UserStoreException {

    }

    @Override
    public void updateRoleName(String roleName, String newRoleName) throws UserStoreException {
		log.info("custom userstore -->updateRoleName");

    }

    /**
     * This method is to check whether multiple profiles are allowed with a particular user-store.
     * For an example, currently, JDBC user store supports multiple profiles and where as ApacheDS
     * does not allow.
     *
     * @return
     */
    @Override
    public boolean isMultipleProfilesAllowed() {
        return true;
    }



    @Override
    public Map<String, String> getProperties(Tenant tenant) throws UserStoreException {
		log.info("custom userstore -->getProperties");
        return new HashMap<>();
    }

    @Override
    public void addRole(String roleName, String[] userList,
                        org.wso2.carbon.user.api.Permission[] permissions, boolean isSharedRole)
            throws org.wso2.carbon.user.core.UserStoreException {
		log.info("custom userstore -->addRole");
        addRole(roleName, userList, getUseCorePermission(permissions));

    }

    private Permission[] getUseCorePermission(org.wso2.carbon.user.api.Permission[] permissions) {
        if (permissions != null && permissions.length > 0) {
            Permission[] perm = new Permission[permissions.length];
            for (int i = 0; i < permissions.length; i++) {
                perm[i] = new Permission(permissions[i].getResourceId(), permissions[i].getAction());
            }
            return perm;
        } else {
            return new Permission[0];
        }
    }


    @Override
    public Map<String, String> getProperties(org.wso2.carbon.user.api.Tenant tenant)
            throws org.wso2.carbon.user.core.UserStoreException {
        return getProperties(Tenant.class.cast(tenant));
    }

    @Override
    public void addRememberMe(String userName, String token)
            throws org.wso2.carbon.user.api.UserStoreException {
        return;
    }

    @Override
    public boolean isValidRememberMeToken(String userName, String token)
            throws org.wso2.carbon.user.api.UserStoreException {
        return false;
    }

    @Override
    public ClaimManager getClaimManager() throws org.wso2.carbon.user.api.UserStoreException {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSCIMEnabled() throws org.wso2.carbon.user.api.UserStoreException {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBulkImportSupported() throws UserStoreException {
        return false;
    }

    @Override
    public String[] getUserList(String claim, String claimValue, String profileName)
            throws UserStoreException {

		log.info("custom userstore -->getUserList");
        return new String[0];
    }

    @Override
    public UserStoreManager getSecondaryUserStoreManager() {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSecondaryUserStoreManager(UserStoreManager userStoreManager) {
        // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserStoreManager getSecondaryUserStoreManager(String s) {
		return this; // To change body of implemented methods use File |
						// Settings | File Templates.
    }

    @Override
    public void addSecondaryUserStoreManager(String s, UserStoreManager userStoreManager) {
        // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public RealmConfiguration getRealmConfiguration() {
        return null;
    }

    @Override
    public Properties getDefaultUserStoreProperties() {
        return null;
    }

    @Override
    public void addRole(String roleName, String[] userList,
                        org.wso2.carbon.user.api.Permission[] permissions)
            throws org.wso2.carbon.user.api.UserStoreException {
        addRole(roleName, userList, permissions, false);
    }

    @Override
    public boolean isExistingRole(String roleName) throws UserStoreException {
        return isExistingRole(roleName, false);
    }

    public boolean isSharedGroupEnabled() {
        return false;
    }

}
