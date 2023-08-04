/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.GrantOffer;
import com.adyen.model.balanceplatform.GrantOffers;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GrantOffersApi extends Service {
    protected String baseURL;

    public GrantOffersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Get all available grant offers
    *
    * @param accountHolderId {@link String } The unique identifier of the grant account. (required)
    * @return {@link GrantOffers }
    * @throws ApiException if fails to make API call
    */
    public GrantOffers getAllAvailableGrantOffers(String accountHolderId) throws ApiException, IOException {
        return getAllAvailableGrantOffers(accountHolderId,  null);
    }

    /**
    * Get all available grant offers
    *
    * @param accountHolderId {@link String } Query: The unique identifier of the grant account. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GrantOffers }
    * @throws ApiException if fails to make API call
    */
    public GrantOffers getAllAvailableGrantOffers(String accountHolderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (accountHolderId != null) {
        queryParams.put("accountHolderId", accountHolderId);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/grantOffers", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return GrantOffers.fromJson(jsonResult);
    }

    /**
    * Get a grant offer
    *
    * @param grantOfferId {@link String } The unique identifier of the grant offer. (required)
    * @return {@link GrantOffer }
    * @throws ApiException if fails to make API call
    */
    public GrantOffer getGrantOffer(String grantOfferId) throws ApiException, IOException {
        return getGrantOffer(grantOfferId, null);
    }

    /**
    * Get a grant offer
    *
    * @param grantOfferId {@link String } The unique identifier of the grant offer. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GrantOffer }
    * @throws ApiException if fails to make API call
    */
    public GrantOffer getGrantOffer(String grantOfferId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (grantOfferId == null) {
            throw new IllegalArgumentException("Please provide the grantOfferId path parameter");
        }
        pathParams.put("grantOfferId", grantOfferId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/grantOffers/{grantOfferId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return GrantOffer.fromJson(jsonResult);
    }
}
