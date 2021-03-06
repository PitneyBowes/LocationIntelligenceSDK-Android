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
 * FreeOrReducedPriceLunches
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class FreeOrReducedPriceLunches   {
  @SerializedName("freeLunchesCount")
  private String freeLunchesCount = null;

  @SerializedName("reducedPriceLunchedCount")
  private String reducedPriceLunchedCount = null;

  @SerializedName("totalCount")
  private String totalCount = null;

  public FreeOrReducedPriceLunches freeLunchesCount(String freeLunchesCount) {
    this.freeLunchesCount = freeLunchesCount;
    return this;
  }

   /**
   * Get freeLunchesCount
   * @return freeLunchesCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFreeLunchesCount() {
    return freeLunchesCount;
  }

  public void setFreeLunchesCount(String freeLunchesCount) {
    this.freeLunchesCount = freeLunchesCount;
  }

  public FreeOrReducedPriceLunches reducedPriceLunchedCount(String reducedPriceLunchedCount) {
    this.reducedPriceLunchedCount = reducedPriceLunchedCount;
    return this;
  }

   /**
   * Get reducedPriceLunchedCount
   * @return reducedPriceLunchedCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReducedPriceLunchedCount() {
    return reducedPriceLunchedCount;
  }

  public void setReducedPriceLunchedCount(String reducedPriceLunchedCount) {
    this.reducedPriceLunchedCount = reducedPriceLunchedCount;
  }

  public FreeOrReducedPriceLunches totalCount(String totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeOrReducedPriceLunches freeOrReducedPriceLunches = (FreeOrReducedPriceLunches) o;
    return Objects.equals(this.freeLunchesCount, freeOrReducedPriceLunches.freeLunchesCount) &&
        Objects.equals(this.reducedPriceLunchedCount, freeOrReducedPriceLunches.reducedPriceLunchedCount) &&
        Objects.equals(this.totalCount, freeOrReducedPriceLunches.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeLunchesCount, reducedPriceLunchedCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeOrReducedPriceLunches {\n");
    
    sb.append("    freeLunchesCount: ").append(toIndentedString(freeLunchesCount)).append("\n");
    sb.append("    reducedPriceLunchedCount: ").append(toIndentedString(reducedPriceLunchedCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

