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
import pb.locationintelligence.model.FireStation;
import pb.locationintelligence.model.MatchedAddress;


/**
 * FireStations
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class FireStations   {
  @SerializedName("fireStation")
  private List<FireStation> fireStation = new ArrayList<FireStation>();

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public FireStations fireStation(List<FireStation> fireStation) {
    this.fireStation = fireStation;
    return this;
  }

   /**
   * Get fireStation
   * @return fireStation
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FireStation> getFireStation() {
    return fireStation;
  }

  public void setFireStation(List<FireStation> fireStation) {
    this.fireStation = fireStation;
  }

  public FireStations matchedAddress(MatchedAddress matchedAddress) {
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
    FireStations fireStations = (FireStations) o;
    return Objects.equals(this.fireStation, fireStations.fireStation) &&
        Objects.equals(this.matchedAddress, fireStations.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireStation, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireStations {\n");
    
    sb.append("    fireStation: ").append(toIndentedString(fireStation)).append("\n");
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

