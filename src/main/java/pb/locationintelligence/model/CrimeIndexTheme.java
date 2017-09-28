/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.7.0
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
import pb.locationintelligence.model.IndexVariable;


/**
 * CrimeIndexTheme
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class CrimeIndexTheme   {
  @SerializedName("source")
  private String source = null;

  @SerializedName("boundaryRef")
  private String boundaryRef = null;

  @SerializedName("indexVariable")
  private List<IndexVariable> indexVariable = new ArrayList<IndexVariable>();

  public CrimeIndexTheme source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CrimeIndexTheme boundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryRef() {
    return boundaryRef;
  }

  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }

  public CrimeIndexTheme indexVariable(List<IndexVariable> indexVariable) {
    this.indexVariable = indexVariable;
    return this;
  }

   /**
   * Get indexVariable
   * @return indexVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IndexVariable> getIndexVariable() {
    return indexVariable;
  }

  public void setIndexVariable(List<IndexVariable> indexVariable) {
    this.indexVariable = indexVariable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeIndexTheme crimeIndexTheme = (CrimeIndexTheme) o;
    return Objects.equals(this.source, crimeIndexTheme.source) &&
        Objects.equals(this.boundaryRef, crimeIndexTheme.boundaryRef) &&
        Objects.equals(this.indexVariable, crimeIndexTheme.indexVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, boundaryRef, indexVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeIndexTheme {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
    sb.append("    indexVariable: ").append(toIndentedString(indexVariable)).append("\n");
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

