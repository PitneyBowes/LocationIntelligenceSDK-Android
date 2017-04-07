/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.0.0
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
import pb.locationintelligence.model.GeometryPolygon;


/**
 * Boundary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-07T16:31:43.806+05:30")
public class Boundary   {
  @SerializedName("geometry")
  private GeometryPolygon geometry = null;

  @SerializedName("boundaryId")
  private String boundaryId = null;

  @SerializedName("boundaryType")
  private String boundaryType = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("boundaryRef")
  private String boundaryRef = null;

  public Boundary geometry(GeometryPolygon geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeometryPolygon getGeometry() {
    return geometry;
  }

  public void setGeometry(GeometryPolygon geometry) {
    this.geometry = geometry;
  }

  public Boundary boundaryId(String boundaryId) {
    this.boundaryId = boundaryId;
    return this;
  }

   /**
   * Get boundaryId
   * @return boundaryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryId() {
    return boundaryId;
  }

  public void setBoundaryId(String boundaryId) {
    this.boundaryId = boundaryId;
  }

  public Boundary boundaryType(String boundaryType) {
    this.boundaryType = boundaryType;
    return this;
  }

   /**
   * Get boundaryType
   * @return boundaryType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryType() {
    return boundaryType;
  }

  public void setBoundaryType(String boundaryType) {
    this.boundaryType = boundaryType;
  }

  public Boundary url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Boundary boundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryRef() {
    return boundaryRef;
  }

  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boundary boundary = (Boundary) o;
    return Objects.equals(this.geometry, boundary.geometry) &&
        Objects.equals(this.boundaryId, boundary.boundaryId) &&
        Objects.equals(this.boundaryType, boundary.boundaryType) &&
        Objects.equals(this.url, boundary.url) &&
        Objects.equals(this.boundaryRef, boundary.boundaryRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, boundaryId, boundaryType, url, boundaryRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boundary {\n");
    
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    boundaryId: ").append(toIndentedString(boundaryId)).append("\n");
    sb.append("    boundaryType: ").append(toIndentedString(boundaryType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
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

