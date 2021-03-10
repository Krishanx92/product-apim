/*
 * Internal Utility API
 * This API allows you to access internal data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.internal.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RevokedJWTDTO
 */

public class RevokedJWTDTO {
  @SerializedName("jwt_signature")
  private String jwtSignature = null;

  @SerializedName("expiry_time")
  private Long expiryTime = null;

  public RevokedJWTDTO jwtSignature(String jwtSignature) {
    this.jwtSignature = jwtSignature;
    return this;
  }

   /**
   * signature of the JWT token.
   * @return jwtSignature
  **/
  @ApiModelProperty(value = "signature of the JWT token.")
  public String getJwtSignature() {
    return jwtSignature;
  }

  public void setJwtSignature(String jwtSignature) {
    this.jwtSignature = jwtSignature;
  }

  public RevokedJWTDTO expiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * expiry timestamp.
   * @return expiryTime
  **/
  @ApiModelProperty(value = "expiry timestamp.")
  public Long getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokedJWTDTO revokedJWT = (RevokedJWTDTO) o;
    return Objects.equals(this.jwtSignature, revokedJWT.jwtSignature) &&
        Objects.equals(this.expiryTime, revokedJWT.expiryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwtSignature, expiryTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokedJWTDTO {\n");
    
    sb.append("    jwtSignature: ").append(toIndentedString(jwtSignature)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

