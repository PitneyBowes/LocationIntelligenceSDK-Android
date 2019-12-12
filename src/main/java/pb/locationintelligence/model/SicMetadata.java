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
 * SicMetadata
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class SicMetadata   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("tradeDivision")
  private String tradeDivision = null;

  @SerializedName("tradeGroup")
  private String tradeGroup = null;

  @SerializedName("class")
  private String PropertyClass = null;

  @SerializedName("subClass")
  private String subClass = null;

  @SerializedName("description")
  private String description = null;

  public SicMetadata code(String code) {
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

  public SicMetadata categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public SicMetadata tradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
    return this;
  }

   /**
   * Get tradeDivision
   * @return tradeDivision
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTradeDivision() {
    return tradeDivision;
  }

  public void setTradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
  }

  public SicMetadata tradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
    return this;
  }

   /**
   * Get tradeGroup
   * @return tradeGroup
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTradeGroup() {
    return tradeGroup;
  }

  public void setTradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
  }

  public SicMetadata PropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
    return this;
  }

   /**
   * Get PropertyClass
   * @return PropertyClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyClass() {
    return PropertyClass;
  }

  public void setPropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
  }

  public SicMetadata subClass(String subClass) {
    this.subClass = subClass;
    return this;
  }

   /**
   * Get subClass
   * @return subClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubClass() {
    return subClass;
  }

  public void setSubClass(String subClass) {
    this.subClass = subClass;
  }

  public SicMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SicMetadata sicMetadata = (SicMetadata) o;
    return Objects.equals(this.code, sicMetadata.code) &&
        Objects.equals(this.categoryCode, sicMetadata.categoryCode) &&
        Objects.equals(this.tradeDivision, sicMetadata.tradeDivision) &&
        Objects.equals(this.tradeGroup, sicMetadata.tradeGroup) &&
        Objects.equals(this.PropertyClass, sicMetadata.PropertyClass) &&
        Objects.equals(this.subClass, sicMetadata.subClass) &&
        Objects.equals(this.description, sicMetadata.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, categoryCode, tradeDivision, tradeGroup, PropertyClass, subClass, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SicMetadata {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    tradeDivision: ").append(toIndentedString(tradeDivision)).append("\n");
    sb.append("    tradeGroup: ").append(toIndentedString(tradeGroup)).append("\n");
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
    sb.append("    subClass: ").append(toIndentedString(subClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

