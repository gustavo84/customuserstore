 

package org.wso2.carbon.um.ws.api;

import java.util.Map;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.AuthorizationManager;
import org.wso2.carbon.user.core.UserStoreException;

public class WSAuthorizationManager implements AuthorizationManager {

    private static final Log log = LogFactory.getLog(WSUserStoreManager.class);


    private static final String SERVICE_NAME = "RemoteAuthorizationManagerService";
    private static final String CONNECTION_ERROR_MESSAGE = "Error while establishing web service connection ";

    public WSAuthorizationManager(String serverUrl, String cookie,
                                  ConfigurationContext configCtxt) throws UserStoreException {

    }

	public WSAuthorizationManager(RealmConfiguration realmConfig, Map<String, Object> properties) {
		log.info("custom userstore -->WSAuthorizationManager");
	}

    @Override
    public void authorizeRole(String roleName, String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->authorizeRole");
    }


    @Override
    public void authorizeUser(String userName, String resourceId, String action)
            throws UserStoreException {
		log.info("customauthorizationmanager authorizeUser");

    }

    @Override
    public void clearResourceAuthorizations(String resourceId) throws UserStoreException {
		log.info("custom userstore -->clearResourceAuthorizations");
    }

    @Override
    public void clearRoleActionOnAllResources(String roleName, String action)
            throws UserStoreException {
		log.info("custom userstore -->clearRoleActionOnAllResources");

    }

    @Override
    public void clearRoleAuthorization(String roleName, String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->clearRoleAuthorization");
    }

    @Override
    public void clearRoleAuthorization(String roleName) throws UserStoreException {
		log.info("custom userstore -->clearRoleAuthorization");
    }

    @Override
    public void clearUserAuthorization(String userName, String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->clearUserAuthorization");
    }

    @Override
    public void clearUserAuthorization(String userName) throws UserStoreException {
		log.info("custom userstore -->clearUserAuthorization");

    }

    @Override
    public void denyRole(String roleName, String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->denyRole");
    }

    @Override
    public void denyUser(String userName, String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->denyUser");
    }

    @Override
    public String[] getAllowedRolesForResource(String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->getAllowedRolesForResource");
        return new String[0];
    }

    @Override
    public String[] getAllowedUIResourcesForUser(String userName, String permissionRootPath)
            throws UserStoreException {
		log.info("custom userstore -->getAllowedUIResourcesForUser");
		String[] uis = { "/permission", "/permission/admin/configure/", "/permission/admin/login/",
				"/permission/admin/manage/", "/permission/admin/monitor/", "/permission/protected/",
				"/permission/testlogin/" };

		return uis;
    }

    @Override
    public String[] getDeniedRolesForResource(String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->getDeniedRolesForResource");
        return new String[0];
    }

    @Override
    public String[] getExplicitlyAllowedUsersForResource(String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->getExplicitlyAllowedUsersForResource");
        return new String[0];
    }

    @Override
    public String[] getExplicitlyDeniedUsersForResource(String resourceId, String action)
            throws UserStoreException {
		log.info("custom userstore -->getExplicitlyDeniedUsersForResource");
        return new String[0];
    }

    @Override
    public boolean isRoleAuthorized(String roleName, String resourceId, String action)
            throws UserStoreException {
		/*
		 * try { return stub.isRoleAuthorized(roleName, resourceId, action); }
		 * catch (Exception e) { this.handleException(e.getMessage(), e); }
		 */

		log.info("customauthorizationmanager isRoleAuthorized");
		return true;
    }

    @Override
    public boolean isUserAuthorized(String userName, String resourceId, String action)
            throws UserStoreException {
		log.info("customauthorizationmanager isUserAuthorized");
		return true;
    }

    @Override
    public void resetPermissionOnUpdateRole(String roleName, String newRoleName)
            throws UserStoreException {

    }

    @Override
    public int getTenantId() throws UserStoreException {
		log.info("customauthorizationmanager -->getTenantId");
		return -1234;
    }


    private String[] handleException(String msg, Exception e) throws UserStoreException {
        log.error(e.getMessage(), e);
        throw new UserStoreException(msg, e);
    }


    @Override
    public String[] normalizeRoles(String[] roles) {
        return roles;
    }


}
