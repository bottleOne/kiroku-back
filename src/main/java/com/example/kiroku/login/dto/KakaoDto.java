package com.example.kiroku.login.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class KakaoDto {

    @NoArgsConstructor
    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class KakaoTokenResponse {
        @JsonProperty("token_type")
        public String tokenType;
        @JsonProperty("access_token")
        public String accessToken;
        @JsonProperty("id_token")
        public String idToken;
        @JsonProperty("expires_in")
        public Integer expiresIn;
        @JsonProperty("refresh_token")
        public String refreshToken;
        @JsonProperty("refresh_token_expires_in")
        public Integer refreshTokenExpiresIn;
        @JsonProperty("scope")
        public String scope;
    }

    @NoArgsConstructor
    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class KakaoUserInfoResponse {
        @JsonProperty("id")
        public String id;
        @JsonProperty("connected_at")
        public String connectedAt;
        @JsonProperty("properties")
        private Properties properties;

        @NoArgsConstructor
        @Getter @Setter
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Properties {
            @JsonProperty("nickname")
            private String nickname  ;
        }

    }
}
