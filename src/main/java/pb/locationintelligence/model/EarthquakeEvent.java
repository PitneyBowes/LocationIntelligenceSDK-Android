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
import pb.locationintelligence.model.DateTimeEarthQuake;
import pb.locationintelligence.model.Depth;
import pb.locationintelligence.model.EarthquakeLocation;
import pb.locationintelligence.model.Magnitude;


/**
 * EarthquakeEvent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class EarthquakeEvent   {
  @SerializedName("dateTime")
  private DateTimeEarthQuake dateTime = null;

  @SerializedName("seismicRegionNumber")
  private Integer seismicRegionNumber = null;

  @SerializedName("depth")
  private Depth depth = null;

  @SerializedName("magnitude")
  private Magnitude magnitude = null;

  @SerializedName("cause")
  private String cause = null;

  @SerializedName("culturalEffect")
  private String culturalEffect = null;

  @SerializedName("intensity")
  private Integer intensity = null;

  @SerializedName("diastrophism")
  private String diastrophism = null;

  @SerializedName("miscPhenomena")
  private String miscPhenomena = null;

  @SerializedName("location")
  private EarthquakeLocation location = null;

  public EarthquakeEvent dateTime(DateTimeEarthQuake dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTimeEarthQuake getDateTime() {
    return dateTime;
  }

  public void setDateTime(DateTimeEarthQuake dateTime) {
    this.dateTime = dateTime;
  }

  public EarthquakeEvent seismicRegionNumber(Integer seismicRegionNumber) {
    this.seismicRegionNumber = seismicRegionNumber;
    return this;
  }

   /**
   * Get seismicRegionNumber
   * @return seismicRegionNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSeismicRegionNumber() {
    return seismicRegionNumber;
  }

  public void setSeismicRegionNumber(Integer seismicRegionNumber) {
    this.seismicRegionNumber = seismicRegionNumber;
  }

  public EarthquakeEvent depth(Depth depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "null", value = "")
  public Depth getDepth() {
    return depth;
  }

  public void setDepth(Depth depth) {
    this.depth = depth;
  }

  public EarthquakeEvent magnitude(Magnitude magnitude) {
    this.magnitude = magnitude;
    return this;
  }

   /**
   * Get magnitude
   * @return magnitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Magnitude getMagnitude() {
    return magnitude;
  }

  public void setMagnitude(Magnitude magnitude) {
    this.magnitude = magnitude;
  }

  public EarthquakeEvent cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public EarthquakeEvent culturalEffect(String culturalEffect) {
    this.culturalEffect = culturalEffect;
    return this;
  }

   /**
   * Get culturalEffect
   * @return culturalEffect
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCulturalEffect() {
    return culturalEffect;
  }

  public void setCulturalEffect(String culturalEffect) {
    this.culturalEffect = culturalEffect;
  }

  public EarthquakeEvent intensity(Integer intensity) {
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIntensity() {
    return intensity;
  }

  public void setIntensity(Integer intensity) {
    this.intensity = intensity;
  }

  public EarthquakeEvent diastrophism(String diastrophism) {
    this.diastrophism = diastrophism;
    return this;
  }

   /**
   * Get diastrophism
   * @return diastrophism
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDiastrophism() {
    return diastrophism;
  }

  public void setDiastrophism(String diastrophism) {
    this.diastrophism = diastrophism;
  }

  public EarthquakeEvent miscPhenomena(String miscPhenomena) {
    this.miscPhenomena = miscPhenomena;
    return this;
  }

   /**
   * Get miscPhenomena
   * @return miscPhenomena
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMiscPhenomena() {
    return miscPhenomena;
  }

  public void setMiscPhenomena(String miscPhenomena) {
    this.miscPhenomena = miscPhenomena;
  }

  public EarthquakeEvent location(EarthquakeLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public EarthquakeLocation getLocation() {
    return location;
  }

  public void setLocation(EarthquakeLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeEvent earthquakeEvent = (EarthquakeEvent) o;
    return Objects.equals(this.dateTime, earthquakeEvent.dateTime) &&
        Objects.equals(this.seismicRegionNumber, earthquakeEvent.seismicRegionNumber) &&
        Objects.equals(this.depth, earthquakeEvent.depth) &&
        Objects.equals(this.magnitude, earthquakeEvent.magnitude) &&
        Objects.equals(this.cause, earthquakeEvent.cause) &&
        Objects.equals(this.culturalEffect, earthquakeEvent.culturalEffect) &&
        Objects.equals(this.intensity, earthquakeEvent.intensity) &&
        Objects.equals(this.diastrophism, earthquakeEvent.diastrophism) &&
        Objects.equals(this.miscPhenomena, earthquakeEvent.miscPhenomena) &&
        Objects.equals(this.location, earthquakeEvent.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, seismicRegionNumber, depth, magnitude, cause, culturalEffect, intensity, diastrophism, miscPhenomena, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeEvent {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    seismicRegionNumber: ").append(toIndentedString(seismicRegionNumber)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    magnitude: ").append(toIndentedString(magnitude)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    culturalEffect: ").append(toIndentedString(culturalEffect)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    diastrophism: ").append(toIndentedString(diastrophism)).append("\n");
    sb.append("    miscPhenomena: ").append(toIndentedString(miscPhenomena)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

