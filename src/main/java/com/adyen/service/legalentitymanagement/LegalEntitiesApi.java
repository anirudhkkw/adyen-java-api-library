/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.legalentitymanagement;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.legalentitymanagement.BusinessLines;
import com.adyen.model.legalentitymanagement.LegalEntity;
import com.adyen.model.legalentitymanagement.LegalEntityInfo;
import com.adyen.model.legalentitymanagement.LegalEntityInfoRequiredType;
import com.adyen.model.legalentitymanagement.ServiceError;
import com.adyen.model.legalentitymanagement.VerificationErrors;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LegalEntitiesApi extends Service {
    protected String baseURL;

    public LegalEntitiesApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://kyc-test.adyen.com/lem/v3");
    }

    /**
    * Get a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity getLegalEntity(String id) throws ApiException, IOException {
        return getLegalEntity(id, null);
    }

    /**
    * Get a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity getLegalEntity(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return LegalEntity.fromJson(jsonResult);
    }

    /**
    * Get all business lines under a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @return {@link BusinessLines }
    * @throws ApiException if fails to make API call
    */
    public BusinessLines getAllBusinessLinesUnderLegalEntity(String id) throws ApiException, IOException {
        return getAllBusinessLinesUnderLegalEntity(id, null);
    }

    /**
    * Get all business lines under a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BusinessLines }
    * @throws ApiException if fails to make API call
    */
    public BusinessLines getAllBusinessLinesUnderLegalEntity(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/businessLines", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return BusinessLines.fromJson(jsonResult);
    }

    /**
    * Update a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param legalEntityInfo {@link LegalEntityInfo }  (required)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity updateLegalEntity(String id, LegalEntityInfo legalEntityInfo) throws ApiException, IOException {
        return updateLegalEntity(id, legalEntityInfo, null);
    }

    /**
    * Update a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param legalEntityInfo {@link LegalEntityInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity updateLegalEntity(String id, LegalEntityInfo legalEntityInfo, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = legalEntityInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return LegalEntity.fromJson(jsonResult);
    }

    /**
    * Create a legal entity
    *
    * @param legalEntityInfoRequiredType {@link LegalEntityInfoRequiredType }  (required)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity createLegalEntity(LegalEntityInfoRequiredType legalEntityInfoRequiredType) throws ApiException, IOException {
        return createLegalEntity(legalEntityInfoRequiredType, null);
    }

    /**
    * Create a legal entity
    *
    * @param legalEntityInfoRequiredType {@link LegalEntityInfoRequiredType }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link LegalEntity }
    * @throws ApiException if fails to make API call
    */
    public LegalEntity createLegalEntity(LegalEntityInfoRequiredType legalEntityInfoRequiredType, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = legalEntityInfoRequiredType.toJson();
        Resource resource = new Resource(this, this.baseURL + "/legalEntities", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return LegalEntity.fromJson(jsonResult);
    }

    /**
    * Check a legal entity&#39;s verification errors
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @return {@link VerificationErrors }
    * @throws ApiException if fails to make API call
    */
    public VerificationErrors checkLegalEntitysVerificationErrors(String id) throws ApiException, IOException {
        return checkLegalEntitysVerificationErrors(id, null);
    }

    /**
    * Check a legal entity&#39;s verification errors
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link VerificationErrors }
    * @throws ApiException if fails to make API call
    */
    public VerificationErrors checkLegalEntitysVerificationErrors(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/checkVerificationErrors", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return VerificationErrors.fromJson(jsonResult);
    }
}