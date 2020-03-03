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
 * Coverage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class Coverage   {
  @SerializedName("area")
  private String area = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("exceptions")
  private String exceptions = null;

  public Coverage area(String area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public Coverage comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Coverage exceptions(String exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExceptions() {
    return exceptions;
  }

  public void setExceptions(String exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coverage coverage = (Coverage) o;
    return Objects.equals(this.area, coverage.area) &&
        Objects.equals(this.comments, coverage.comments) &&
        Objects.equals(this.exceptions, coverage.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, comments, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coverage {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

