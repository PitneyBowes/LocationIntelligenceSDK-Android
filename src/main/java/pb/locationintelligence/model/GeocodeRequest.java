/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.7.0
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
import pb.locationintelligence.model.GeocodeAddress;
import pb.locationintelligence.model.Preferences;


/**
 * GeocodeRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class GeocodeRequest   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("preferences")
  private Preferences preferences = null;

  @SerializedName("addresses")
  private List<GeocodeAddress> addresses = new ArrayList<GeocodeAddress>();

  public GeocodeRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(example = "ADDRESS", required = true, value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeocodeRequest preferences(Preferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public Preferences getPreferences() {
    return preferences;
  }

  public void setPreferences(Preferences preferences) {
    this.preferences = preferences;
  }

  public GeocodeRequest addresses(List<GeocodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<GeocodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<GeocodeAddress> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeRequest geocodeRequest = (GeocodeRequest) o;
    return Objects.equals(this.type, geocodeRequest.type) &&
        Objects.equals(this.preferences, geocodeRequest.preferences) &&
        Objects.equals(this.addresses, geocodeRequest.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, preferences, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

