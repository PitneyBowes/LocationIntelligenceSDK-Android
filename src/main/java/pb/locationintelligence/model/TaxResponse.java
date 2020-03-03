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
import pb.locationintelligence.model.LatLongFields;
import pb.locationintelligence.model.MatchedAddress;
import pb.locationintelligence.model.SalesTax;
import pb.locationintelligence.model.TaxJurisdiction;
import pb.locationintelligence.model.UseTax;


/**
 * TaxResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class TaxResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("jurisdiction")
  private TaxJurisdiction jurisdiction = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  @SerializedName("salesTax")
  private SalesTax salesTax = null;

  @SerializedName("useTax")
  private UseTax useTax = null;

  @SerializedName("latLongFields")
  private LatLongFields latLongFields = null;

  public TaxResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public TaxResponse confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public TaxResponse jurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }

  public TaxResponse salesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesTax getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
  }

  public TaxResponse useTax(UseTax useTax) {
    this.useTax = useTax;
    return this;
  }

   /**
   * Get useTax
   * @return useTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public UseTax getUseTax() {
    return useTax;
  }

  public void setUseTax(UseTax useTax) {
    this.useTax = useTax;
  }

  public TaxResponse latLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
    return this;
  }

   /**
   * Get latLongFields
   * @return latLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public LatLongFields getLatLongFields() {
    return latLongFields;
  }

  public void setLatLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxResponse taxResponse = (TaxResponse) o;
    return Objects.equals(this.objectId, taxResponse.objectId) &&
        Objects.equals(this.confidence, taxResponse.confidence) &&
        Objects.equals(this.jurisdiction, taxResponse.jurisdiction) &&
        Objects.equals(this.matchedAddress, taxResponse.matchedAddress) &&
        Objects.equals(this.salesTax, taxResponse.salesTax) &&
        Objects.equals(this.useTax, taxResponse.useTax) &&
        Objects.equals(this.latLongFields, taxResponse.latLongFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, confidence, jurisdiction, matchedAddress, salesTax, useTax, latLongFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    useTax: ").append(toIndentedString(useTax)).append("\n");
    sb.append("    latLongFields: ").append(toIndentedString(latLongFields)).append("\n");
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

