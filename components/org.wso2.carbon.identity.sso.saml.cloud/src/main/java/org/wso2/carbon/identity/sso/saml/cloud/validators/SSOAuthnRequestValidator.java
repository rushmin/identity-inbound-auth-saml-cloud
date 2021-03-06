/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.sso.saml.cloud.validators;

import org.opensaml.saml2.core.AuthnRequest;
import org.wso2.carbon.identity.base.IdentityException;

import java.io.IOException;

/**
 * Interface to implement in order to validate a received SAML SSO request
 * Implementation class should be defined in <>identity.xml</> under <>SSOService</> element as
 * <IdPInitSSOAuthnRequestValidator></IdPInitSSOAuthnRequestValidator> for IDP initiated authentication request flow,
 * <SPInitSSOAuthnRequestValidator></SPInitSSOAuthnRequestValidator> for SP initiated authentication request flow.
 */
public interface SSOAuthnRequestValidator {

    /**
     * Validates the authentication request according to SAML SSO Web Browser Specification
     *
     * @return boolean : includes whether the request is validated
     * @throws IdentityException
     */
    boolean validate(AuthnRequest request) throws IdentityException, IOException;
}
