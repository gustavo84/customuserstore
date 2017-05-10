 

package org.wso2.carbon.um.ws.api;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.ClaimMapping;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.claim.Claim;
import org.wso2.carbon.user.core.claim.ClaimManager;

public class WSClaimManager implements ClaimManager {

    private static final Log log = LogFactory.getLog(WSClaimManager.class);


    private static final String SERVICE_NAME = "RemoteClaimManagerService";
    private static final String CONNECTION_ERROR_MESSAGE = "Error while establishing web service connection ";

    public WSClaimManager(String serverUrl, String cookie, ConfigurationContext configCtxt)
            throws UserStoreException {
		/*
		 * try { stub = new RemoteClaimManagerServiceStub(configCtxt, serverUrl
		 * + SERVICE_NAME);
		 * 
		 * ServiceClient client = stub._getServiceClient(); Options option =
		 * client.getOptions(); option.setManageSession(true);
		 * option.setProperty(org.apache.axis2.transport.http.HTTPConstants.
		 * COOKIE_STRING, cookie); } catch (AxisFault e) {
		 * 
		 * throw new
		 * UserStoreException("Axis error occurred while creating service client stub"
		 * , e); }
		 */
    }

    @Override
    public void addNewClaimMapping(ClaimMapping mapping) throws UserStoreException {


    }

    @Override

    public void deleteClaimMapping(ClaimMapping mapping) throws UserStoreException {

    }

    @Override
    public String[] getAllClaimUris() throws UserStoreException {
		log.info("customaclaimmanager -->getAllClaimUris");
        return new String[0];
    }

    @Override
    public String getAttributeName(String claimURI) throws UserStoreException {

        return null;
    }

    @Override
    public Claim getClaim(String claimURI) throws UserStoreException {

        return null;
    }

    @Override
    public ClaimMapping getClaimMapping(String claimURI) throws UserStoreException {

        return null;
    }

    @Override
    public void updateClaimMapping(ClaimMapping mapping) throws UserStoreException {

    }

    private String[] handleException(String msg, Exception e) throws UserStoreException {
        log.error(e.getMessage(), e);
        throw new UserStoreException(msg, e);
    }

    @Override
    public String getAttributeName(String domainName, String claimURI)
            throws org.wso2.carbon.user.api.UserStoreException {

        return null;
    }

    @Override
    public org.wso2.carbon.user.api.ClaimMapping[] getAllSupportClaimMappingsByDefault()
            throws org.wso2.carbon.user.api.UserStoreException {

        return new ClaimMapping[0];
    }

    @Override
    public org.wso2.carbon.user.api.ClaimMapping[] getAllClaimMappings()
            throws org.wso2.carbon.user.api.UserStoreException {
        return new ClaimMapping[0];
    }

    @Override
    public org.wso2.carbon.user.api.ClaimMapping[] getAllClaimMappings(String dialectURI)
            throws org.wso2.carbon.user.api.UserStoreException {
        return new ClaimMapping[0];
    }

    @Override
    public org.wso2.carbon.user.api.ClaimMapping[] getAllRequiredClaimMappings()
            throws org.wso2.carbon.user.api.UserStoreException {

        return new ClaimMapping[0];
    }
}
