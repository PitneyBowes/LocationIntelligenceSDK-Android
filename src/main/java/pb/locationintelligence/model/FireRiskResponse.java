/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.0.0
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
import pb.locationintelligence.model.CommonState;
import pb.locationintelligence.model.FireShed;
import pb.locationintelligence.model.MatchedAddress;


/**
 * FireRiskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class FireRiskResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("state")
  private CommonState state = null;

  @SerializedName("fireShed")
  private FireShed fireShed = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public FireRiskResponse objectId(String objectId) {
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

  public FireRiskResponse state(CommonState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonState getState() {
    return state;
  }

  public void setState(CommonState state) {
    this.state = state;
  }

  public FireRiskResponse fireShed(FireShed fireShed) {
    this.fireShed = fireShed;
    return this;
  }

   /**
   * Get fireShed
   * @return fireShed
  **/
  @ApiModelProperty(example = "null", value = "")
  public FireShed getFireShed() {
    return fireShed;
  }

  public void setFireShed(FireShed fireShed) {
    this.fireShed = fireShed;
  }

  public FireRiskResponse matchedAddress(MatchedAddress matchedAddress) {
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
    FireRiskResponse fireRiskResponse = (FireRiskResponse) o;
    return Objects.equals(this.objectId, fireRiskResponse.objectId) &&
        Objects.equals(this.state, fireRiskResponse.state) &&
        Objects.equals(this.fireShed, fireRiskResponse.fireShed) &&
        Objects.equals(this.matchedAddress, fireRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, state, fireShed, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireRiskResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fireShed: ").append(toIndentedString(fireShed)).append("\n");
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

