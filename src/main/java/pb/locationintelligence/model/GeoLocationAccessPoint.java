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
import pb.locationintelligence.model.Accuracy;
import pb.locationintelligence.model.Geometry;


/**
 * GeoLocationAccessPoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:11:39.640+05:30")
public class GeoLocationAccessPoint   {
  @SerializedName("geometry")
  private Geometry geometry = null;

  @SerializedName("accuracy")
  private Accuracy accuracy = null;

  public GeoLocationAccessPoint geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public GeoLocationAccessPoint accuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Accuracy getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationAccessPoint geoLocationAccessPoint = (GeoLocationAccessPoint) o;
    return Objects.equals(this.geometry, geoLocationAccessPoint.geometry) &&
        Objects.equals(this.accuracy, geoLocationAccessPoint.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, accuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationAccessPoint {\n");
    
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

