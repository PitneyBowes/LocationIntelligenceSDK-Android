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
import pb.locationintelligence.model.AHJList;
import pb.locationintelligence.model.PSAPResponse;


/**
 * AHJPlusPSAPResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T15:55:12.092+05:30")
public class AHJPlusPSAPResponse   {
  @SerializedName("ahjs")
  private AHJList ahjs = null;

  @SerializedName("psap")
  private PSAPResponse psap = null;

  @SerializedName("count")
  private Integer count = null;

  public AHJPlusPSAPResponse ahjs(AHJList ahjs) {
    this.ahjs = ahjs;
    return this;
  }

   /**
   * Get ahjs
   * @return ahjs
  **/
  @ApiModelProperty(example = "null", value = "")
  public AHJList getAhjs() {
    return ahjs;
  }

  public void setAhjs(AHJList ahjs) {
    this.ahjs = ahjs;
  }

  public AHJPlusPSAPResponse psap(PSAPResponse psap) {
    this.psap = psap;
    return this;
  }

   /**
   * Get psap
   * @return psap
  **/
  @ApiModelProperty(example = "null", value = "")
  public PSAPResponse getPsap() {
    return psap;
  }

  public void setPsap(PSAPResponse psap) {
    this.psap = psap;
  }

  public AHJPlusPSAPResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHJPlusPSAPResponse aHJPlusPSAPResponse = (AHJPlusPSAPResponse) o;
    return Objects.equals(this.ahjs, aHJPlusPSAPResponse.ahjs) &&
        Objects.equals(this.psap, aHJPlusPSAPResponse.psap) &&
        Objects.equals(this.count, aHJPlusPSAPResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ahjs, psap, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AHJPlusPSAPResponse {\n");
    
    sb.append("    ahjs: ").append(toIndentedString(ahjs)).append("\n");
    sb.append("    psap: ").append(toIndentedString(psap)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

