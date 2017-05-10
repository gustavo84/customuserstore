 

package org.wso2.carbon.um.ws.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.wso2.carbon.core.util.AnonymousSessionUtil;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.tenant.Tenant;
import org.wso2.carbon.user.core.tenant.TenantManager;

/**
 * This is the Tenant manager used with WSRealm.
 */
public class WSRealmTenantManager implements TenantManager {

    private static final Log log = LogFactory.getLog(AnonymousSessionUtil.class);
    private static final String SERVICE_NAME = "RemoteTenantManagerService";
    private static final String AXIS_FAULT_MESSAGE = "Axis fault occured  ";
    private static final String SERVER_LOGIN_ERROR = "WSRealmTenantManager cannot login to server";


    private String userName = null;
    private String password = null;
    private String url = null;

	public WSRealmTenantManager(org.apache.axiom.om.OMElement w, java.util.Map s) {
		log.info("entt");
	}

    public WSRealmTenantManager(String userName, String password, String url)
            throws java.lang.Exception {
        this.userName = userName;
        this.password = password;
        this.url = url;

    }

    @Override
    public void activateTenant(int tenantId) throws UserStoreException {
		log.info("activateTenant");
    }

    public int addTenant(Tenant tenant) throws UserStoreException {
		log.info("addTenant");
        return -1;
    }

    @Override
    public void deactivateTenant(int tenantId) throws UserStoreException {
		log.info("deactivateTenant");
    }

    @Override
    public void deleteTenant(int tenantId) throws UserStoreException {

		log.info("deleteTenant");
    }

    @Override
    public void deleteTenant(int tenantId, boolean removeFromPersistentStorage) throws UserStoreException {
        //TODO Implement tenant deletion
        return;
    }


    @Override
    public Tenant[] getAllTenants() throws UserStoreException {
		log.info("getAllTenants");
        return new Tenant[0];
    }

    //TODO:implement methods
    @Override
    public org.wso2.carbon.user.api.Tenant[] getAllTenantsForTenantDomainStr(String s)
            throws org.wso2.carbon.user.api.UserStoreException {
        return new org.wso2.carbon.user.api.Tenant[0];
    }

    @Override
    public String getDomain(int tenantId) throws UserStoreException {
		log.info("getDomain");
        return null;
    }

    @Override
    public String getSuperTenantDomain() throws UserStoreException {
		log.info("getSuperTenantDomain");
        return null;
    }

    @Override
    public int addTenant(org.wso2.carbon.user.api.Tenant tenant)
            throws org.wso2.carbon.user.api.UserStoreException {
        return addTenant((Tenant) tenant);
    }

    @Override
    public void updateTenant(org.wso2.carbon.user.api.Tenant tenant)
            throws org.wso2.carbon.user.api.UserStoreException {
        updateTenant((Tenant) tenant);
    }

    @Override
    public Tenant getTenant(int tenantId) throws UserStoreException {
		Tenant t = new Tenant();
		t.setActive(true);
		t.setAdminFirstName("a");
		t.setAdminPassword("a");
		t.setAdminName("as");
		t.setAdminPassword("a");
		t.setDomain("a");
		t.setEmail("a");
		t.setId(1);

		RealmConfiguration r = new RealmConfiguration();
		r.setAdminUserName("a");
		r.setAdminPassword("a");
		r.setAdminRoleName("a");
		r.setEveryOneRoleName("a");
		t.setRealmConfig(r);
		return t;
    }

    @Override
    public int getTenantId(String domain) throws UserStoreException {
		log.info("getTenantId");
		return -1234;
    }

    @Override
    public boolean isTenantActive(int tenantId) throws UserStoreException {
		log.info("isTenantActive");
		return true;
    }

    @Override
    public void setBundleContext(BundleContext bundleContext) {
        return;
    }

    public void updateTenant(Tenant tenant) throws UserStoreException {
		log.info("updateTenant");
    }




    /**
     * This method was added to TenantManager interface to support tenant management with LDAP.
     * Hence no implementation currently in this context.
     */
    @Override
    public void initializeExistingPartitions() {
        return;
    }






}
