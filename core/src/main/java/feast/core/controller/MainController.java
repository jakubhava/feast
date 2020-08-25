/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright 2018-2019 The Feast Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package feast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

  @Autowired
  OAuth2AuthorizedClientService clientService;

  private String getTokens(Principal user) {
    var auth = (OAuth2AuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
    var userDetails =  (DefaultOidcUser) auth.getPrincipal();
    OAuth2AuthorizedClient client = clientService
            .loadAuthorizedClient(auth.getAuthorizedClientRegistrationId(), auth.getName());
    var token = client.getAccessToken().getTokenValue();
    return "Hello " + user.getName() + ", your ID token is " + userDetails.getIdToken().getTokenValue() + "\n" +
            "Your Access token is + " + token;
  }

  @GetMapping("/")
  String home(Principal user) {
    return "Welcome to Feast";
  }

  @GetMapping("/admin")
  String admin() {
    return "Welcome Admin";
  }

  @GetMapping("/user")
  String user() {
    return "Welcome User";
  }
}
