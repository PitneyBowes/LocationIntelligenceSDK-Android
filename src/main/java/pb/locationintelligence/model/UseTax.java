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
import pb.locationintelligence.model.SpecialPurposeDistrictTax;


/**
 * UseTax
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class UseTax   {
  @SerializedName("totalTaxRate")
  private Double totalTaxRate = null;

  @SerializedName("totalTaxAmount")
  private Double totalTaxAmount = null;

  @SerializedName("stateTaxRate")
  private Double stateTaxRate = null;

  @SerializedName("stateTaxAmount")
  private Double stateTaxAmount = null;

  @SerializedName("countyTaxRate")
  private Double countyTaxRate = null;

  @SerializedName("countyTaxAmount")
  private Double countyTaxAmount = null;

  @SerializedName("municipalTaxRate")
  private Double municipalTaxRate = null;

  @SerializedName("municipalTaxAmount")
  private Double municipalTaxAmount = null;

  @SerializedName("spdsTax")
  private List<SpecialPurposeDistrictTax> spdsTax = new ArrayList<SpecialPurposeDistrictTax>();

  @SerializedName("specialTaxRulesApplied")
  private Boolean specialTaxRulesApplied = false;

  @SerializedName("specialTaxRulesDescriptor")
  private String specialTaxRulesDescriptor = null;

  public UseTax totalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
    return this;
  }

   /**
   * Get totalTaxRate
   * @return totalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTaxRate() {
    return totalTaxRate;
  }

  public void setTotalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
  }

  public UseTax totalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Get totalTaxAmount
   * @return totalTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public UseTax stateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
    return this;
  }

   /**
   * Get stateTaxRate
   * @return stateTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTaxRate() {
    return stateTaxRate;
  }

  public void setStateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
  }

  public UseTax stateTaxAmount(Double stateTaxAmount) {
    this.stateTaxAmount = stateTaxAmount;
    return this;
  }

   /**
   * Get stateTaxAmount
   * @return stateTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTaxAmount() {
    return stateTaxAmount;
  }

  public void setStateTaxAmount(Double stateTaxAmount) {
    this.stateTaxAmount = stateTaxAmount;
  }

  public UseTax countyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
    return this;
  }

   /**
   * Get countyTaxRate
   * @return countyTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTaxRate() {
    return countyTaxRate;
  }

  public void setCountyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
  }

  public UseTax countyTaxAmount(Double countyTaxAmount) {
    this.countyTaxAmount = countyTaxAmount;
    return this;
  }

   /**
   * Get countyTaxAmount
   * @return countyTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTaxAmount() {
    return countyTaxAmount;
  }

  public void setCountyTaxAmount(Double countyTaxAmount) {
    this.countyTaxAmount = countyTaxAmount;
  }

  public UseTax municipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
    return this;
  }

   /**
   * Get municipalTaxRate
   * @return municipalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTaxRate() {
    return municipalTaxRate;
  }

  public void setMunicipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
  }

  public UseTax municipalTaxAmount(Double municipalTaxAmount) {
    this.municipalTaxAmount = municipalTaxAmount;
    return this;
  }

   /**
   * Get municipalTaxAmount
   * @return municipalTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTaxAmount() {
    return municipalTaxAmount;
  }

  public void setMunicipalTaxAmount(Double municipalTaxAmount) {
    this.municipalTaxAmount = municipalTaxAmount;
  }

  public UseTax spdsTax(List<SpecialPurposeDistrictTax> spdsTax) {
    this.spdsTax = spdsTax;
    return this;
  }

   /**
   * Get spdsTax
   * @return spdsTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SpecialPurposeDistrictTax> getSpdsTax() {
    return spdsTax;
  }

  public void setSpdsTax(List<SpecialPurposeDistrictTax> spdsTax) {
    this.spdsTax = spdsTax;
  }

  public UseTax specialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    this.specialTaxRulesApplied = specialTaxRulesApplied;
    return this;
  }

   /**
   * Get specialTaxRulesApplied
   * @return specialTaxRulesApplied
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSpecialTaxRulesApplied() {
    return specialTaxRulesApplied;
  }

  public void setSpecialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    this.specialTaxRulesApplied = specialTaxRulesApplied;
  }

  public UseTax specialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
    return this;
  }

   /**
   * Get specialTaxRulesDescriptor
   * @return specialTaxRulesDescriptor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpecialTaxRulesDescriptor() {
    return specialTaxRulesDescriptor;
  }

  public void setSpecialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseTax useTax = (UseTax) o;
    return Objects.equals(this.totalTaxRate, useTax.totalTaxRate) &&
        Objects.equals(this.totalTaxAmount, useTax.totalTaxAmount) &&
        Objects.equals(this.stateTaxRate, useTax.stateTaxRate) &&
        Objects.equals(this.stateTaxAmount, useTax.stateTaxAmount) &&
        Objects.equals(this.countyTaxRate, useTax.countyTaxRate) &&
        Objects.equals(this.countyTaxAmount, useTax.countyTaxAmount) &&
        Objects.equals(this.municipalTaxRate, useTax.municipalTaxRate) &&
        Objects.equals(this.municipalTaxAmount, useTax.municipalTaxAmount) &&
        Objects.equals(this.spdsTax, useTax.spdsTax) &&
        Objects.equals(this.specialTaxRulesApplied, useTax.specialTaxRulesApplied) &&
        Objects.equals(this.specialTaxRulesDescriptor, useTax.specialTaxRulesDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTaxRate, totalTaxAmount, stateTaxRate, stateTaxAmount, countyTaxRate, countyTaxAmount, municipalTaxRate, municipalTaxAmount, spdsTax, specialTaxRulesApplied, specialTaxRulesDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseTax {\n");
    
    sb.append("    totalTaxRate: ").append(toIndentedString(totalTaxRate)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    stateTaxRate: ").append(toIndentedString(stateTaxRate)).append("\n");
    sb.append("    stateTaxAmount: ").append(toIndentedString(stateTaxAmount)).append("\n");
    sb.append("    countyTaxRate: ").append(toIndentedString(countyTaxRate)).append("\n");
    sb.append("    countyTaxAmount: ").append(toIndentedString(countyTaxAmount)).append("\n");
    sb.append("    municipalTaxRate: ").append(toIndentedString(municipalTaxRate)).append("\n");
    sb.append("    municipalTaxAmount: ").append(toIndentedString(municipalTaxAmount)).append("\n");
    sb.append("    spdsTax: ").append(toIndentedString(spdsTax)).append("\n");
    sb.append("    specialTaxRulesApplied: ").append(toIndentedString(specialTaxRulesApplied)).append("\n");
    sb.append("    specialTaxRulesDescriptor: ").append(toIndentedString(specialTaxRulesDescriptor)).append("\n");
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

