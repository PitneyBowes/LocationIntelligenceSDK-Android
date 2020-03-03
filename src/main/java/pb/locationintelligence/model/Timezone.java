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
import pb.locationintelligence.model.MatchedAddress;


/**
 * Timezone
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class Timezone   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("timezoneName")
  private String timezoneName = null;

  @SerializedName("zoneType")
  private String zoneType = null;

  @SerializedName("utcOffset")
  private Long utcOffset = null;

  @SerializedName("dstOffset")
  private Long dstOffset = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public Timezone objectId(String objectId) {
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

  public Timezone timezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
    return this;
  }

   /**
   * Get timezoneName
   * @return timezoneName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimezoneName() {
    return timezoneName;
  }

  public void setTimezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
  }

  public Timezone zoneType(String zoneType) {
    this.zoneType = zoneType;
    return this;
  }

   /**
   * Get zoneType
   * @return zoneType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getZoneType() {
    return zoneType;
  }

  public void setZoneType(String zoneType) {
    this.zoneType = zoneType;
  }

  public Timezone utcOffset(Long utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(Long utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Timezone dstOffset(Long dstOffset) {
    this.dstOffset = dstOffset;
    return this;
  }

   /**
   * Get dstOffset
   * @return dstOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDstOffset() {
    return dstOffset;
  }

  public void setDstOffset(Long dstOffset) {
    this.dstOffset = dstOffset;
  }

  public Timezone timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Timezone matchedAddress(MatchedAddress matchedAddress) {
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
    Timezone timezone = (Timezone) o;
    return Objects.equals(this.objectId, timezone.objectId) &&
        Objects.equals(this.timezoneName, timezone.timezoneName) &&
        Objects.equals(this.zoneType, timezone.zoneType) &&
        Objects.equals(this.utcOffset, timezone.utcOffset) &&
        Objects.equals(this.dstOffset, timezone.dstOffset) &&
        Objects.equals(this.timestamp, timezone.timestamp) &&
        Objects.equals(this.matchedAddress, timezone.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, timezoneName, zoneType, utcOffset, dstOffset, timestamp, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timezone {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
    sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    dstOffset: ").append(toIndentedString(dstOffset)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

