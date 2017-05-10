 

package org.wso2.carbon.um.ws.api;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.profile.ProfileConfiguration;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;

public class WSProfileConfigurationManager implements ProfileConfigurationManager {

    private static final Log log = LogFactory.getLog(WSProfileConfigurationManager.class);


    private static final String SERVICE_NAME = "RemoteProfileConfigurationManagerService";
    private static final String CONNECTION_ERROR_MESSAGE = "Error while establishing web service connection ";

    public WSProfileConfigurationManager(String serverUrl, String cookie,
                                         ConfigurationContext configCtxt) throws UserStoreException {
		/*
		 * try { stub = new
		 * RemoteProfileConfigurationManagerServiceStub(configCtxt, serverUrl +
		 * SERVICE_NAME); ServiceClient client = stub._getServiceClient();
		 * Options option = client.getOptions(); option.setManageSession(true);
		 * option.setProperty(org.apache.axis2.transport.http.HTTPConstants.
		 * COOKIE_STRING, cookie); } catch (AxisFault e) {
		 * 
		 * throw new
		 * UserStoreException("Axis error occurred while creating service client stub"
		 * ,e); }
		 */
    }

    public void addProfileConfig(ProfileConfiguration profileConfig) throws UserStoreException {

    }

    public void deleteProfileConfig(ProfileConfiguration profileConfig) throws UserStoreException {

    }

    public void updateProfileConfig(ProfileConfiguration profileConfig) throws UserStoreException {

    }

    @Override
    public ProfileConfiguration[] getAllProfiles() throws UserStoreException {

        return new ProfileConfiguration[0];
    }

    @Override
    public ProfileConfiguration getProfileConfig(String profileName) throws UserStoreException {

        return null;
    }

    @Override
    public void addProfileConfig(org.wso2.carbon.user.api.ProfileConfiguration profileConfiguration)
            throws org.wso2.carbon.user.api.UserStoreException {
        addProfileConfig((ProfileConfiguration) profileConfiguration);
    }

    @Override
    public void updateProfileConfig(
            org.wso2.carbon.user.api.ProfileConfiguration profileConfiguration)
            throws org.wso2.carbon.user.api.UserStoreException {
        updateProfileConfig((ProfileConfiguration) profileConfiguration);
    }

    @Override
    public void deleteProfileConfig(
            org.wso2.carbon.user.api.ProfileConfiguration profileConfiguration)
            throws org.wso2.carbon.user.api.UserStoreException {
        deleteProfileConfig((ProfileConfiguration) profileConfiguration);
    }

    private String[] handleException(String msg, Exception e) throws UserStoreException {
        log.error(e.getMessage(), e);
        throw new UserStoreException(msg, e);
    }

}
