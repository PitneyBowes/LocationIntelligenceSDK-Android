/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.5.0
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
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.IndividualValueVariable;
import pb.locationintelligence.model.MatchedAddress;


/**
 * GeoPropertyResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class GeoPropertyResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("individualValueVariable")
  private List<IndividualValueVariable> individualValueVariable = new ArrayList<IndividualValueVariable>();

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public GeoPropertyResponse objectId(String objectId) {
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

  public GeoPropertyResponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GeoPropertyResponse individualValueVariable(List<IndividualValueVariable> individualValueVariable) {
    this.individualValueVariable = individualValueVariable;
    return this;
  }

   /**
   * Get individualValueVariable
   * @return individualValueVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IndividualValueVariable> getIndividualValueVariable() {
    return individualValueVariable;
  }

  public void setIndividualValueVariable(List<IndividualValueVariable> individualValueVariable) {
    this.individualValueVariable = individualValueVariable;
  }

  public GeoPropertyResponse matchedAddress(MatchedAddress matchedAddress) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoPropertyResponse geoPropertyResponse = (GeoPropertyResponse) o;
    return Objects.equals(this.objectId, geoPropertyResponse.objectId) &&
        Objects.equals(this.category, geoPropertyResponse.category) &&
        Objects.equals(this.individualValueVariable, geoPropertyResponse.individualValueVariable) &&
        Objects.equals(this.matchedAddress, geoPropertyResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, category, individualValueVariable, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoPropertyResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    individualValueVariable: ").append(toIndentedString(individualValueVariable)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

