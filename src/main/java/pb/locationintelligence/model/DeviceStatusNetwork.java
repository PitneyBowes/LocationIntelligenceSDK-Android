/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pb.locationintelligence.model.GeoLocationFixedLineCountry;


/**
 * DeviceStatusNetwork
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class DeviceStatusNetwork   {
  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("callType")
  private String callType = null;

  @SerializedName("locAccuracySupport")
  private String locAccuracySupport = null;

  @SerializedName("nationalNumber")
  private String nationalNumber = null;

  @SerializedName("country")
  private GeoLocationFixedLineCountry country = null;

  public DeviceStatusNetwork carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public DeviceStatusNetwork callType(String callType) {
    this.callType = callType;
    return this;
  }

   /**
   * Get callType
   * @return callType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public DeviceStatusNetwork locAccuracySupport(String locAccuracySupport) {
    this.locAccuracySupport = locAccuracySupport;
    return this;
  }

   /**
   * Get locAccuracySupport
   * @return locAccuracySupport
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocAccuracySupport() {
    return locAccuracySupport;
  }

  public void setLocAccuracySupport(String locAccuracySupport) {
    this.locAccuracySupport = locAccuracySupport;
  }

  public DeviceStatusNetwork nationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
    return this;
  }

   /**
   * Get nationalNumber
   * @return nationalNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNationalNumber() {
    return nationalNumber;
  }

  public void setNationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
  }

  public DeviceStatusNetwork country(GeoLocationFixedLineCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoLocationFixedLineCountry getCountry() {
    return country;
  }

  public void setCountry(GeoLocationFixedLineCountry country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceStatusNetwork deviceStatusNetwork = (DeviceStatusNetwork) o;
    return Objects.equals(this.carrier, deviceStatusNetwork.carrier) &&
        Objects.equals(this.callType, deviceStatusNetwork.callType) &&
        Objects.equals(this.locAccuracySupport, deviceStatusNetwork.locAccuracySupport) &&
        Objects.equals(this.nationalNumber, deviceStatusNetwork.nationalNumber) &&
        Objects.equals(this.country, deviceStatusNetwork.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, callType, locAccuracySupport, nationalNumber, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceStatusNetwork {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    locAccuracySupport: ").append(toIndentedString(locAccuracySupport)).append("\n");
    sb.append("    nationalNumber: ").append(toIndentedString(nationalNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

