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


/**
 * TaxPlace
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class TaxPlace   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("classCode")
  private String classCode = null;

  @SerializedName("incorporatedFlag")
  private String incorporatedFlag = null;

  @SerializedName("lastAnnexedDate")
  private String lastAnnexedDate = null;

  @SerializedName("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @SerializedName("lastVerifiedDate")
  private String lastVerifiedDate = null;

  public TaxPlace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxPlace code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TaxPlace classCode(String classCode) {
    this.classCode = classCode;
    return this;
  }

   /**
   * Get classCode
   * @return classCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  public TaxPlace incorporatedFlag(String incorporatedFlag) {
    this.incorporatedFlag = incorporatedFlag;
    return this;
  }

   /**
   * Get incorporatedFlag
   * @return incorporatedFlag
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncorporatedFlag() {
    return incorporatedFlag;
  }

  public void setIncorporatedFlag(String incorporatedFlag) {
    this.incorporatedFlag = incorporatedFlag;
  }

  public TaxPlace lastAnnexedDate(String lastAnnexedDate) {
    this.lastAnnexedDate = lastAnnexedDate;
    return this;
  }

   /**
   * Get lastAnnexedDate
   * @return lastAnnexedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastAnnexedDate() {
    return lastAnnexedDate;
  }

  public void setLastAnnexedDate(String lastAnnexedDate) {
    this.lastAnnexedDate = lastAnnexedDate;
  }

  public TaxPlace lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public TaxPlace lastVerifiedDate(String lastVerifiedDate) {
    this.lastVerifiedDate = lastVerifiedDate;
    return this;
  }

   /**
   * Get lastVerifiedDate
   * @return lastVerifiedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastVerifiedDate() {
    return lastVerifiedDate;
  }

  public void setLastVerifiedDate(String lastVerifiedDate) {
    this.lastVerifiedDate = lastVerifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxPlace taxPlace = (TaxPlace) o;
    return Objects.equals(this.name, taxPlace.name) &&
        Objects.equals(this.code, taxPlace.code) &&
        Objects.equals(this.classCode, taxPlace.classCode) &&
        Objects.equals(this.incorporatedFlag, taxPlace.incorporatedFlag) &&
        Objects.equals(this.lastAnnexedDate, taxPlace.lastAnnexedDate) &&
        Objects.equals(this.lastUpdatedDate, taxPlace.lastUpdatedDate) &&
        Objects.equals(this.lastVerifiedDate, taxPlace.lastVerifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, classCode, incorporatedFlag, lastAnnexedDate, lastUpdatedDate, lastVerifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxPlace {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    incorporatedFlag: ").append(toIndentedString(incorporatedFlag)).append("\n");
    sb.append("    lastAnnexedDate: ").append(toIndentedString(lastAnnexedDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    lastVerifiedDate: ").append(toIndentedString(lastVerifiedDate)).append("\n");
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

