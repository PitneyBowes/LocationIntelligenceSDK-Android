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


/**
 * AreaCodeInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class AreaCodeInfo   {
  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("ocn")
  private String ocn = null;

  @SerializedName("ocnCategory")
  private String ocnCategory = null;

  @SerializedName("npa")
  private String npa = null;

  @SerializedName("nxx")
  private String nxx = null;

  @SerializedName("startRange")
  private String startRange = null;

  @SerializedName("endRange")
  private String endRange = null;

  @SerializedName("lata")
  private String lata = null;

  @SerializedName("areaName4")
  private String areaName4 = null;

  public AreaCodeInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AreaCodeInfo ocn(String ocn) {
    this.ocn = ocn;
    return this;
  }

   /**
   * Get ocn
   * @return ocn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOcn() {
    return ocn;
  }

  public void setOcn(String ocn) {
    this.ocn = ocn;
  }

  public AreaCodeInfo ocnCategory(String ocnCategory) {
    this.ocnCategory = ocnCategory;
    return this;
  }

   /**
   * Get ocnCategory
   * @return ocnCategory
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOcnCategory() {
    return ocnCategory;
  }

  public void setOcnCategory(String ocnCategory) {
    this.ocnCategory = ocnCategory;
  }

  public AreaCodeInfo npa(String npa) {
    this.npa = npa;
    return this;
  }

   /**
   * Get npa
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNpa() {
    return npa;
  }

  public void setNpa(String npa) {
    this.npa = npa;
  }

  public AreaCodeInfo nxx(String nxx) {
    this.nxx = nxx;
    return this;
  }

   /**
   * Get nxx
   * @return nxx
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNxx() {
    return nxx;
  }

  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  public AreaCodeInfo startRange(String startRange) {
    this.startRange = startRange;
    return this;
  }

   /**
   * Get startRange
   * @return startRange
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartRange() {
    return startRange;
  }

  public void setStartRange(String startRange) {
    this.startRange = startRange;
  }

  public AreaCodeInfo endRange(String endRange) {
    this.endRange = endRange;
    return this;
  }

   /**
   * Get endRange
   * @return endRange
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndRange() {
    return endRange;
  }

  public void setEndRange(String endRange) {
    this.endRange = endRange;
  }

  public AreaCodeInfo lata(String lata) {
    this.lata = lata;
    return this;
  }

   /**
   * Get lata
   * @return lata
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLata() {
    return lata;
  }

  public void setLata(String lata) {
    this.lata = lata;
  }

  public AreaCodeInfo areaName4(String areaName4) {
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName4() {
    return areaName4;
  }

  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaCodeInfo areaCodeInfo = (AreaCodeInfo) o;
    return Objects.equals(this.companyName, areaCodeInfo.companyName) &&
        Objects.equals(this.ocn, areaCodeInfo.ocn) &&
        Objects.equals(this.ocnCategory, areaCodeInfo.ocnCategory) &&
        Objects.equals(this.npa, areaCodeInfo.npa) &&
        Objects.equals(this.nxx, areaCodeInfo.nxx) &&
        Objects.equals(this.startRange, areaCodeInfo.startRange) &&
        Objects.equals(this.endRange, areaCodeInfo.endRange) &&
        Objects.equals(this.lata, areaCodeInfo.lata) &&
        Objects.equals(this.areaName4, areaCodeInfo.areaName4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, ocn, ocnCategory, npa, nxx, startRange, endRange, lata, areaName4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaCodeInfo {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    ocn: ").append(toIndentedString(ocn)).append("\n");
    sb.append("    ocnCategory: ").append(toIndentedString(ocnCategory)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    endRange: ").append(toIndentedString(endRange)).append("\n");
    sb.append("    lata: ").append(toIndentedString(lata)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
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

