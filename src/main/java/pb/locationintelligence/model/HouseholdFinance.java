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
import pb.locationintelligence.model.Boundary;


/**
 * HouseholdFinance
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class HouseholdFinance   {
  @SerializedName("averageIncome")
  private String averageIncome = null;

  @SerializedName("averageAssets")
  private String averageAssets = null;

  @SerializedName("averageWealth")
  private String averageWealth = null;

  @SerializedName("boundary")
  private Boundary boundary = null;

  public HouseholdFinance averageIncome(String averageIncome) {
    this.averageIncome = averageIncome;
    return this;
  }

   /**
   * Get averageIncome
   * @return averageIncome
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAverageIncome() {
    return averageIncome;
  }

  public void setAverageIncome(String averageIncome) {
    this.averageIncome = averageIncome;
  }

  public HouseholdFinance averageAssets(String averageAssets) {
    this.averageAssets = averageAssets;
    return this;
  }

   /**
   * Get averageAssets
   * @return averageAssets
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAverageAssets() {
    return averageAssets;
  }

  public void setAverageAssets(String averageAssets) {
    this.averageAssets = averageAssets;
  }

  public HouseholdFinance averageWealth(String averageWealth) {
    this.averageWealth = averageWealth;
    return this;
  }

   /**
   * Get averageWealth
   * @return averageWealth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAverageWealth() {
    return averageWealth;
  }

  public void setAverageWealth(String averageWealth) {
    this.averageWealth = averageWealth;
  }

  public HouseholdFinance boundary(Boundary boundary) {
    this.boundary = boundary;
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boundary getBoundary() {
    return boundary;
  }

  public void setBoundary(Boundary boundary) {
    this.boundary = boundary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseholdFinance householdFinance = (HouseholdFinance) o;
    return Objects.equals(this.averageIncome, householdFinance.averageIncome) &&
        Objects.equals(this.averageAssets, householdFinance.averageAssets) &&
        Objects.equals(this.averageWealth, householdFinance.averageWealth) &&
        Objects.equals(this.boundary, householdFinance.boundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageIncome, averageAssets, averageWealth, boundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseholdFinance {\n");
    
    sb.append("    averageIncome: ").append(toIndentedString(averageIncome)).append("\n");
    sb.append("    averageAssets: ").append(toIndentedString(averageAssets)).append("\n");
    sb.append("    averageWealth: ").append(toIndentedString(averageWealth)).append("\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
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

