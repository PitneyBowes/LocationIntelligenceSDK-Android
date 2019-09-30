/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 7.5.0
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


/**
 * GeocodeRequestAddress
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:11:39.640+05:30")
public class GeocodeRequestAddress   {
  @SerializedName("mainAddressLine")
  private String mainAddressLine = null;

  @SerializedName("addressLastLine")
  private String addressLastLine = null;

  @SerializedName("placeName")
  private String placeName = null;

  @SerializedName("areaName1")
  private String areaName1 = null;

  @SerializedName("areaName2")
  private String areaName2 = null;

  @SerializedName("areaName3")
  private String areaName3 = null;

  @SerializedName("areaName4")
  private String areaName4 = null;

  @SerializedName("postCode1")
  private String postCode1 = null;

  @SerializedName("postCode2")
  private String postCode2 = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("addressNumber")
  private String addressNumber = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("unitType")
  private String unitType = null;

  @SerializedName("unitValue")
  private String unitValue = null;

  public GeocodeRequestAddress mainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
    return this;
  }

   /**
   * Get mainAddressLine
   * @return mainAddressLine
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMainAddressLine() {
    return mainAddressLine;
  }

  public void setMainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
  }

  public GeocodeRequestAddress addressLastLine(String addressLastLine) {
    this.addressLastLine = addressLastLine;
    return this;
  }

   /**
   * Get addressLastLine
   * @return addressLastLine
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressLastLine() {
    return addressLastLine;
  }

  public void setAddressLastLine(String addressLastLine) {
    this.addressLastLine = addressLastLine;
  }

  public GeocodeRequestAddress placeName(String placeName) {
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceName() {
    return placeName;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }

  public GeocodeRequestAddress areaName1(String areaName1) {
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName1() {
    return areaName1;
  }

  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }

  public GeocodeRequestAddress areaName2(String areaName2) {
    this.areaName2 = areaName2;
    return this;
  }

   /**
   * Get areaName2
   * @return areaName2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName2() {
    return areaName2;
  }

  public void setAreaName2(String areaName2) {
    this.areaName2 = areaName2;
  }

  public GeocodeRequestAddress areaName3(String areaName3) {
    this.areaName3 = areaName3;
    return this;
  }

   /**
   * Get areaName3
   * @return areaName3
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName3() {
    return areaName3;
  }

  public void setAreaName3(String areaName3) {
    this.areaName3 = areaName3;
  }

  public GeocodeRequestAddress areaName4(String areaName4) {
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName4() {
    return areaName4;
  }

  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }

  public GeocodeRequestAddress postCode1(String postCode1) {
    this.postCode1 = postCode1;
    return this;
  }

   /**
   * Get postCode1
   * @return postCode1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode1() {
    return postCode1;
  }

  public void setPostCode1(String postCode1) {
    this.postCode1 = postCode1;
  }

  public GeocodeRequestAddress postCode2(String postCode2) {
    this.postCode2 = postCode2;
    return this;
  }

   /**
   * Get postCode2
   * @return postCode2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode2() {
    return postCode2;
  }

  public void setPostCode2(String postCode2) {
    this.postCode2 = postCode2;
  }

  public GeocodeRequestAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GeocodeRequestAddress addressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
    return this;
  }

   /**
   * Get addressNumber
   * @return addressNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }

  public GeocodeRequestAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public GeocodeRequestAddress unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public GeocodeRequestAddress unitValue(String unitValue) {
    this.unitValue = unitValue;
    return this;
  }

   /**
   * Get unitValue
   * @return unitValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnitValue() {
    return unitValue;
  }

  public void setUnitValue(String unitValue) {
    this.unitValue = unitValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeRequestAddress geocodeRequestAddress = (GeocodeRequestAddress) o;
    return Objects.equals(this.mainAddressLine, geocodeRequestAddress.mainAddressLine) &&
        Objects.equals(this.addressLastLine, geocodeRequestAddress.addressLastLine) &&
        Objects.equals(this.placeName, geocodeRequestAddress.placeName) &&
        Objects.equals(this.areaName1, geocodeRequestAddress.areaName1) &&
        Objects.equals(this.areaName2, geocodeRequestAddress.areaName2) &&
        Objects.equals(this.areaName3, geocodeRequestAddress.areaName3) &&
        Objects.equals(this.areaName4, geocodeRequestAddress.areaName4) &&
        Objects.equals(this.postCode1, geocodeRequestAddress.postCode1) &&
        Objects.equals(this.postCode2, geocodeRequestAddress.postCode2) &&
        Objects.equals(this.country, geocodeRequestAddress.country) &&
        Objects.equals(this.addressNumber, geocodeRequestAddress.addressNumber) &&
        Objects.equals(this.streetName, geocodeRequestAddress.streetName) &&
        Objects.equals(this.unitType, geocodeRequestAddress.unitType) &&
        Objects.equals(this.unitValue, geocodeRequestAddress.unitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainAddressLine, addressLastLine, placeName, areaName1, areaName2, areaName3, areaName4, postCode1, postCode2, country, addressNumber, streetName, unitType, unitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeRequestAddress {\n");
    
    sb.append("    mainAddressLine: ").append(toIndentedString(mainAddressLine)).append("\n");
    sb.append("    addressLastLine: ").append(toIndentedString(addressLastLine)).append("\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    areaName2: ").append(toIndentedString(areaName2)).append("\n");
    sb.append("    areaName3: ").append(toIndentedString(areaName3)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
    sb.append("    postCode1: ").append(toIndentedString(postCode1)).append("\n");
    sb.append("    postCode2: ").append(toIndentedString(postCode2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
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

