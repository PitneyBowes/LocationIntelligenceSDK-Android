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


/**
 * Proxy
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:11:39.640+05:30")
public class Proxy   {
  @SerializedName("anonymizerStatus")
  private String anonymizerStatus = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("lastDetected")
  private String lastDetected = null;

  @SerializedName("type")
  private String type = null;

  public Proxy anonymizerStatus(String anonymizerStatus) {
    this.anonymizerStatus = anonymizerStatus;
    return this;
  }

   /**
   * Get anonymizerStatus
   * @return anonymizerStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnonymizerStatus() {
    return anonymizerStatus;
  }

  public void setAnonymizerStatus(String anonymizerStatus) {
    this.anonymizerStatus = anonymizerStatus;
  }

  public Proxy level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Proxy lastDetected(String lastDetected) {
    this.lastDetected = lastDetected;
    return this;
  }

   /**
   * Get lastDetected
   * @return lastDetected
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastDetected() {
    return lastDetected;
  }

  public void setLastDetected(String lastDetected) {
    this.lastDetected = lastDetected;
  }

  public Proxy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Proxy proxy = (Proxy) o;
    return Objects.equals(this.anonymizerStatus, proxy.anonymizerStatus) &&
        Objects.equals(this.level, proxy.level) &&
        Objects.equals(this.lastDetected, proxy.lastDetected) &&
        Objects.equals(this.type, proxy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymizerStatus, level, lastDetected, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Proxy {\n");
    
    sb.append("    anonymizerStatus: ").append(toIndentedString(anonymizerStatus)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    lastDetected: ").append(toIndentedString(lastDetected)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

