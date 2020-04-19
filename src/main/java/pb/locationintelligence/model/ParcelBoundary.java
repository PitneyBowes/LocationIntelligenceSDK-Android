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
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.Center;
import pb.locationintelligence.model.CommonGeometry;
import pb.locationintelligence.model.MatchedAddress;
import pb.locationintelligence.model.Parcel;
import pb.locationintelligence.model.ParcelBoundary;


/**
 * ParcelBoundary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class ParcelBoundary   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("apn")
  private String apn = null;

  @SerializedName("pid")
  private String pid = null;

  @SerializedName("center")
  private Center center = null;

  @SerializedName("countyfips")
  private String countyfips = null;

  @SerializedName("geometry")
  private CommonGeometry geometry = null;

  @SerializedName("parcelList")
  private List<Parcel> parcelList = new ArrayList<Parcel>();

  @SerializedName("adjacentParcelBoundary")
  private List<ParcelBoundary> adjacentParcelBoundary = new ArrayList<ParcelBoundary>();

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public ParcelBoundary objectId(String objectId) {
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

  public ParcelBoundary apn(String apn) {
    this.apn = apn;
    return this;
  }

   /**
   * Get apn
   * @return apn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getApn() {
    return apn;
  }

  public void setApn(String apn) {
    this.apn = apn;
  }

  public ParcelBoundary pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ParcelBoundary center(Center center) {
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(example = "null", value = "")
  public Center getCenter() {
    return center;
  }

  public void setCenter(Center center) {
    this.center = center;
  }

  public ParcelBoundary countyfips(String countyfips) {
    this.countyfips = countyfips;
    return this;
  }

   /**
   * Get countyfips
   * @return countyfips
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountyfips() {
    return countyfips;
  }

  public void setCountyfips(String countyfips) {
    this.countyfips = countyfips;
  }

  public ParcelBoundary geometry(CommonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(CommonGeometry geometry) {
    this.geometry = geometry;
  }

  public ParcelBoundary parcelList(List<Parcel> parcelList) {
    this.parcelList = parcelList;
    return this;
  }

   /**
   * Get parcelList
   * @return parcelList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Parcel> getParcelList() {
    return parcelList;
  }

  public void setParcelList(List<Parcel> parcelList) {
    this.parcelList = parcelList;
  }

  public ParcelBoundary adjacentParcelBoundary(List<ParcelBoundary> adjacentParcelBoundary) {
    this.adjacentParcelBoundary = adjacentParcelBoundary;
    return this;
  }

   /**
   * Get adjacentParcelBoundary
   * @return adjacentParcelBoundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ParcelBoundary> getAdjacentParcelBoundary() {
    return adjacentParcelBoundary;
  }

  public void setAdjacentParcelBoundary(List<ParcelBoundary> adjacentParcelBoundary) {
    this.adjacentParcelBoundary = adjacentParcelBoundary;
  }

  public ParcelBoundary matchedAddress(MatchedAddress matchedAddress) {
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
    ParcelBoundary parcelBoundary = (ParcelBoundary) o;
    return Objects.equals(this.objectId, parcelBoundary.objectId) &&
        Objects.equals(this.apn, parcelBoundary.apn) &&
        Objects.equals(this.pid, parcelBoundary.pid) &&
        Objects.equals(this.center, parcelBoundary.center) &&
        Objects.equals(this.countyfips, parcelBoundary.countyfips) &&
        Objects.equals(this.geometry, parcelBoundary.geometry) &&
        Objects.equals(this.parcelList, parcelBoundary.parcelList) &&
        Objects.equals(this.adjacentParcelBoundary, parcelBoundary.adjacentParcelBoundary) &&
        Objects.equals(this.matchedAddress, parcelBoundary.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, apn, pid, center, countyfips, geometry, parcelList, adjacentParcelBoundary, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelBoundary {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    apn: ").append(toIndentedString(apn)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    countyfips: ").append(toIndentedString(countyfips)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    parcelList: ").append(toIndentedString(parcelList)).append("\n");
    sb.append("    adjacentParcelBoundary: ").append(toIndentedString(adjacentParcelBoundary)).append("\n");
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

